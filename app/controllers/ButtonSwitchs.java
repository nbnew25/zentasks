package controllers;

import static play.data.Form.form;
import models.Project;
import models.User;
import models.ButtonSwitch;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.buttonswitchs.*;

@Security.Authenticated(Secured.class)
public class ButtonSwitchs extends Controller{
	public static Result GO_HOME = redirect(
	        routes.ButtonSwitchs.list(0, "mfg1Part", "asc", "")
	    );
	
	 public static Result index() {
	        return GO_HOME;
	    }
	
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
            	Project.findInvolving(Secured.getUserId()),
            	User.find.byId(Secured.getUserId()),
                ButtonSwitch.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
    
    public static Result edit(String id) {
        Form<ButtonSwitch> buttonSwitchForm = form(ButtonSwitch.class).fill(
        		ButtonSwitch.find.byId(id)
        );
        return ok(
            editForm.render(
            		Project.findInvolving(Secured.getUserId()),
                	User.find.byId(Secured.getUserId()),
            		id, 
            		buttonSwitchForm)
        );
    }
    
    public static Result update(String id) {
        Form<ButtonSwitch> buttonSwitchForm = form(ButtonSwitch.class).bindFromRequest();
        if(buttonSwitchForm.hasErrors()) {
            return badRequest(editForm.render(
            		Project.findInvolving(Secured.getUserId()),
                	User.find.byId(Secured.getUserId()),
            		id, 
            		buttonSwitchForm));
        }
        buttonSwitchForm.get().update((Object) id);
        flash("success", "ButtonSwitch " + buttonSwitchForm.get().mfg1Part + " has been updated");
        return GO_HOME;
    }
    
    public static Result create() {
        Form<ButtonSwitch> buttonSwitchForm = form(ButtonSwitch.class);
        return ok(
            createForm.render(
            		Project.findInvolving(Secured.getUserId()),
                	User.find.byId(Secured.getUserId()),
                	buttonSwitchForm)
        );
    }
    
    public static Result save() {
        Form<ButtonSwitch> buttonSwitchForm = form(ButtonSwitch.class).bindFromRequest();
        if(buttonSwitchForm.hasErrors()) {
            return badRequest(createForm.render(
            		Project.findInvolving(Secured.getUserId()),
                	User.find.byId(Secured.getUserId()),
                	buttonSwitchForm));
        }
        buttonSwitchForm.get().save();
        flash("success", "ButtonSwitch " + buttonSwitchForm.get().mfg1Part + " has been created");
        return GO_HOME;
    }
    
    public static Result delete(String id) {
    	ButtonSwitch.find.ref(id).delete();
        flash("success", "ButtonSwitch has been deleted");
        return GO_HOME;
    }
}
