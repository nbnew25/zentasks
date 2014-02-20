package models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import com.avaje.ebean.Page;


@Entity 
@Table(name="button_switch")
public class ButtonSwitch extends Model{
	private static final long serialVersionUID = 2L;
	
	@Id
    @Column(name = "MFG1_PART")
	public String mfg1Part;
	
	@Column(name = "CATEGORY")
	public String category;
	
	@Column(name = "PREFIX")
	public Integer prefix;

	@Column(name = "PART_TYPE")
	public String partType;
	
	@Column(name = "DESCRIPTION")
	public String description;
	
	@Column(name = "DEVICE")
	public String device;
	
	@Column(name = "MFG1")
	public String mfg1;
	
	@Column(name = "DISTR1")
	public String distr1;
	
	@Column(name = "DISTR1_PART")
	public String distr1Part;
	
	@Column(name = "VALUE")
	public String value;
	
	@Column(name = "PACKAGE")
	public String package_;
	
	@Column(name = "VOLTAGE")
	public String voltage;
	
	@Column(name = "CURRENT")
	public String current;
	
	@Column(name = "PCB_FOOTPRINT")
	public String pcbFootprint;
	
	@Column(name = "NAME")
	public String name;
	
	@Column(name = "NI_MARK")
	public String niMark;
	
	@Column(name = "TYPE")
	public String type;
	
	@Column(name = "SUBTYPE")
	public String subtype;
	
	@Column(name = "NO_OF_PINS")
	public Integer noOfPins;
	
	@Column(name = "ACCOUNT_ID")
	public String accountId;
	
	@Formats.DateTime(pattern="yyyy-MM-dd HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATE", length = 19)
	public Date modifiedDate;
	
	@Column(name = "SCHEMATIC_PART")
	public String schematicPart;
	
	@Column(name = "STATUS")
	public Integer status;
	
	

	public static Model.Finder<String,ButtonSwitch> find = new Model.Finder<String,ButtonSwitch>(String.class, ButtonSwitch.class);

    /**
     * Return a page of buttonswitchs
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<ButtonSwitch> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("description", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }
    
	 /**
	  * Retrieve all object.
	  */
	 public static List<ButtonSwitch> findAll() {
	     return find.all();
	 }
	
	 /**
	  * Retrieve a User from mfg1Part.
	  */
	 public static ButtonSwitch findByMfg1Part(String mfg1Part) {
	     return find.where().eq("mfg1Part", mfg1Part).findUnique();
	 }
}
