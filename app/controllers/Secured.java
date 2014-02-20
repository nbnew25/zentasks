package controllers;

import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class Secured extends Security.Authenticator {
    
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }
    
    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
    
    public static Long getUserId() {
    	String userId = Context.current().session().get("userId");
    	if(userId==null)
    	{
    		return 0L;
    	}
    	return Long.parseLong(userId);
    }
    // Access rights
    
    public static boolean isMemberOf(Long project) {
        return Project.isMember(
            project,
            Secured.getUserId()
        );
    }
    
    public static boolean isOwnerOf(Long task) {
        return Task.isOwner(
            task,
            Secured.getUserId()
        );
    }
    
}