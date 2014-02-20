package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import play.db.ebean.Model;

import com.avaje.ebean.Ebean;

/**
 * Project entity managed by Ebean
 */
@Entity
@Table(name="project")
public class Project extends Model {

    private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
    public Long id;
    
	@Column(name = "name")
    public String name;
    
	@Column(name = "folder")
    public String folder;
    
    @ManyToMany
    @JoinTable(name="project_account",
    		  joinColumns=@JoinColumn(name="project_id",referencedColumnName="id"),
    	      inverseJoinColumns=@JoinColumn(name="account_email",referencedColumnName="email"))
    public List<User> members = new ArrayList<User>();
    
    public Project(String name, String folder, User owner) {
        this.name = name;
        this.folder = folder;
        this.members.add(owner);
    }
    
    // -- Queries
    
    public static Model.Finder<Long,Project> find = new Model.Finder<Long,Project>(Long.class, Project.class);
    
    /**
     * Retrieve project for user
     */
    public static List<Project> findInvolving(String user) {
        return find.where()
            .eq("members.email", user)
            .findList();
    }
    
    /**
     * Delete all project in a folder
     */
    public static void deleteInFolder(String folder) {
        Ebean.createSqlUpdate(
            "delete from project where folder = :folder"
        ).setParameter("folder", folder).execute();
    }
    
    /**
     * Create a new project.
     */
    public static Project create(String name, String folder, String owner) {
        Project project = new Project(name, folder, User.findByEmail(owner));
        project.save();
        project.saveManyToManyAssociations("members");
        return project;
    }
    
    /**
     * Rename a project
     */
    public static String rename(Long projectId, String newName) {
        Project project = find.ref(projectId);
        project.name = newName;
        project.update();
        return newName;
    }
    
    /**
     * Rename a folder
     */
    public static String renameFolder(String folder, String newName) {
        Ebean.createSqlUpdate(
            "update project set folder = :newName where folder = :folder"
        ).setParameter("folder", folder).setParameter("newName", newName).execute();
        return newName;
    }
    
    /**
     * Add a member to this project
     */
    public static void addMember(Long project, String user) {
        Project p = Project.find.setId(project).fetch("members", "email").findUnique();
        p.members.add(
            User.findByEmail(user)
        );
        p.saveManyToManyAssociations("members");
    }
    
    /**
     * Remove a member from this project
     */
    public static void removeMember(Long project, String user) {
        Project p = Project.find.setId(project).fetch("members", "email").findUnique();
        p.members.remove(
            User.findByEmail(user)
        );
        p.saveManyToManyAssociations("members");
    }
    
    /**
     * Check if a user is a member of this project
     */
    public static boolean isMember(Long project, String user) {
        return find.where()
            .eq("members.email", user)
            .eq("id", project)
            .findRowCount() > 0;
    } 
    
    // --
    
    public String toString() {
        return "Project(" + id + ") with " + (members == null ? "null" : members.size()) + " members";
    }

}

