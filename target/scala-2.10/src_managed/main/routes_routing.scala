// @SOURCE:/home/tannb/git/zentasks/conf/routes
// @HASH:f9f7b21dd491a2e48359b9b36d92552aef37263b
// @DATE:Thu Feb 20 10:51:47 ICT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Projects_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val controllers_Projects_add4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects"))))
        

// @LINE:16
private[this] lazy val controllers_Projects_addGroup5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/groups"))))
        

// @LINE:17
private[this] lazy val controllers_Projects_deleteGroup6 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/groups"))))
        

// @LINE:18
private[this] lazy val controllers_Projects_renameGroup7 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/groups"))))
        

// @LINE:20
private[this] lazy val controllers_Projects_delete8 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_Projects_rename9 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Projects_addUser10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/team"))))
        

// @LINE:24
private[this] lazy val controllers_Projects_removeUser11 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/team"))))
        

// @LINE:27
private[this] lazy val controllers_Tasks_index12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks"))))
        

// @LINE:28
private[this] lazy val controllers_Tasks_add13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks"))))
        

// @LINE:29
private[this] lazy val controllers_Tasks_update14 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("task", """[^/]+""",true))))
        

// @LINE:30
private[this] lazy val controllers_Tasks_delete15 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("task", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Tasks_addFolder16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/folder"))))
        

// @LINE:33
private[this] lazy val controllers_Tasks_deleteFolder17 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks/folder"))))
        

// @LINE:34
private[this] lazy val controllers_Tasks_renameFolder18 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks/folder"))))
        

// @LINE:37
private[this] lazy val controllers_ComputerDB_index19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index2"))))
        

// @LINE:40
private[this] lazy val controllers_ComputerDB_list20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:43
private[this] lazy val controllers_ComputerDB_create21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/new"))))
        

// @LINE:44
private[this] lazy val controllers_ComputerDB_save22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:47
private[this] lazy val controllers_ComputerDB_edit23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:48
private[this] lazy val controllers_ComputerDB_update24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:51
private[this] lazy val controllers_ComputerDB_delete25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:55
private[this] lazy val controllers_ButtonSwitchs_list26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buttonswitchs"))))
        

// @LINE:58
private[this] lazy val controllers_ButtonSwitchs_create27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buttonswitchs/new"))))
        

// @LINE:59
private[this] lazy val controllers_ButtonSwitchs_save28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buttonswitchs"))))
        

// @LINE:62
private[this] lazy val controllers_ButtonSwitchs_edit29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buttonswitchs/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:63
private[this] lazy val controllers_ButtonSwitchs_update30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buttonswitchs/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:66
private[this] lazy val controllers_ButtonSwitchs_delete31 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buttonswitchs/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:70
private[this] lazy val controllers_Application_javascriptRoutes32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
        

// @LINE:73
private[this] lazy val controllers_Assets_at33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Projects.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects""","""controllers.Projects.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/groups""","""controllers.Projects.addGroup()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/groups""","""controllers.Projects.deleteGroup(group:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/groups""","""controllers.Projects.renameGroup(group:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>""","""controllers.Projects.delete(project:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>""","""controllers.Projects.rename(project:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/team""","""controllers.Projects.addUser(project:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/team""","""controllers.Projects.removeUser(project:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/tasks""","""controllers.Tasks.index(project:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/tasks""","""controllers.Tasks.add(project:Long, folder:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$task<[^/]+>""","""controllers.Tasks.update(task:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$task<[^/]+>""","""controllers.Tasks.delete(task:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/folder""","""controllers.Tasks.addFolder()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/tasks/folder""","""controllers.Tasks.deleteFolder(project:Long, folder:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$project<[^/]+>/tasks/folder""","""controllers.Tasks.renameFolder(project:Long, folder:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index2""","""controllers.ComputerDB.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.ComputerDB.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/new""","""controllers.ComputerDB.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.ComputerDB.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.ComputerDB.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.ComputerDB.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>/delete""","""controllers.ComputerDB.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buttonswitchs""","""controllers.ButtonSwitchs.list(p:Int ?= 0, s:String ?= "mfg1Part", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buttonswitchs/new""","""controllers.ButtonSwitchs.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buttonswitchs""","""controllers.ButtonSwitchs.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buttonswitchs/$id<[^/]+>""","""controllers.ButtonSwitchs.edit(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buttonswitchs/$id<[^/]+>""","""controllers.ButtonSwitchs.update(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buttonswitchs/$id<[^/]+>/delete""","""controllers.ButtonSwitchs.delete(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Projects_index0(params) => {
   call { 
        invokeHandler(controllers.Projects.index(), HandlerDef(this, "controllers.Projects", "index", Nil,"GET", """ The home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:14
case controllers_Projects_add4(params) => {
   call { 
        invokeHandler(controllers.Projects.add(), HandlerDef(this, "controllers.Projects", "add", Nil,"POST", """ Projects""", Routes.prefix + """projects"""))
   }
}
        

// @LINE:16
case controllers_Projects_addGroup5(params) => {
   call { 
        invokeHandler(controllers.Projects.addGroup(), HandlerDef(this, "controllers.Projects", "addGroup", Nil,"POST", """""", Routes.prefix + """projects/groups"""))
   }
}
        

// @LINE:17
case controllers_Projects_deleteGroup6(params) => {
   call(params.fromQuery[String]("group", None)) { (group) =>
        invokeHandler(controllers.Projects.deleteGroup(group), HandlerDef(this, "controllers.Projects", "deleteGroup", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """projects/groups"""))
   }
}
        

// @LINE:18
case controllers_Projects_renameGroup7(params) => {
   call(params.fromQuery[String]("group", None)) { (group) =>
        invokeHandler(controllers.Projects.renameGroup(group), HandlerDef(this, "controllers.Projects", "renameGroup", Seq(classOf[String]),"PUT", """""", Routes.prefix + """projects/groups"""))
   }
}
        

// @LINE:20
case controllers_Projects_delete8(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.delete(project), HandlerDef(this, "controllers.Projects", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """projects/$project<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_Projects_rename9(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.rename(project), HandlerDef(this, "controllers.Projects", "rename", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """projects/$project<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Projects_addUser10(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.addUser(project), HandlerDef(this, "controllers.Projects", "addUser", Seq(classOf[Long]),"POST", """""", Routes.prefix + """projects/$project<[^/]+>/team"""))
   }
}
        

// @LINE:24
case controllers_Projects_removeUser11(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.removeUser(project), HandlerDef(this, "controllers.Projects", "removeUser", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """projects/$project<[^/]+>/team"""))
   }
}
        

// @LINE:27
case controllers_Tasks_index12(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Tasks.index(project), HandlerDef(this, "controllers.Tasks", "index", Seq(classOf[Long]),"GET", """ Tasks""", Routes.prefix + """projects/$project<[^/]+>/tasks"""))
   }
}
        

// @LINE:28
case controllers_Tasks_add13(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(controllers.Tasks.add(project, folder), HandlerDef(this, "controllers.Tasks", "add", Seq(classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """projects/$project<[^/]+>/tasks"""))
   }
}
        

// @LINE:29
case controllers_Tasks_update14(params) => {
   call(params.fromPath[Long]("task", None)) { (task) =>
        invokeHandler(controllers.Tasks.update(task), HandlerDef(this, "controllers.Tasks", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """tasks/$task<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_Tasks_delete15(params) => {
   call(params.fromPath[Long]("task", None)) { (task) =>
        invokeHandler(controllers.Tasks.delete(task), HandlerDef(this, "controllers.Tasks", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """tasks/$task<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Tasks_addFolder16(params) => {
   call { 
        invokeHandler(controllers.Tasks.addFolder(), HandlerDef(this, "controllers.Tasks", "addFolder", Nil,"POST", """""", Routes.prefix + """tasks/folder"""))
   }
}
        

// @LINE:33
case controllers_Tasks_deleteFolder17(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(controllers.Tasks.deleteFolder(project, folder), HandlerDef(this, "controllers.Tasks", "deleteFolder", Seq(classOf[Long], classOf[String]),"DELETE", """""", Routes.prefix + """projects/$project<[^/]+>/tasks/folder"""))
   }
}
        

// @LINE:34
case controllers_Tasks_renameFolder18(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(controllers.Tasks.renameFolder(project, folder), HandlerDef(this, "controllers.Tasks", "renameFolder", Seq(classOf[Long], classOf[String]),"PUT", """""", Routes.prefix + """project/$project<[^/]+>/tasks/folder"""))
   }
}
        

// @LINE:37
case controllers_ComputerDB_index19(params) => {
   call { 
        invokeHandler(controllers.ComputerDB.index(), HandlerDef(this, "controllers.ComputerDB", "index", Nil,"GET", """ Default path will just redirect to the computer list""", Routes.prefix + """index2"""))
   }
}
        

// @LINE:40
case controllers_ComputerDB_list20(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.ComputerDB.list(p, s, o, f), HandlerDef(this, "controllers.ComputerDB", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Computers list (look at the default values for pagination parameters)""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:43
case controllers_ComputerDB_create21(params) => {
   call { 
        invokeHandler(controllers.ComputerDB.create(), HandlerDef(this, "controllers.ComputerDB", "create", Nil,"GET", """ Add computer""", Routes.prefix + """computers/new"""))
   }
}
        

// @LINE:44
case controllers_ComputerDB_save22(params) => {
   call { 
        invokeHandler(controllers.ComputerDB.save(), HandlerDef(this, "controllers.ComputerDB", "save", Nil,"POST", """""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:47
case controllers_ComputerDB_edit23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ComputerDB.edit(id), HandlerDef(this, "controllers.ComputerDB", "edit", Seq(classOf[Long]),"GET", """ Edit existing computer""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:48
case controllers_ComputerDB_update24(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ComputerDB.update(id), HandlerDef(this, "controllers.ComputerDB", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:51
case controllers_ComputerDB_delete25(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ComputerDB.delete(id), HandlerDef(this, "controllers.ComputerDB", "delete", Seq(classOf[Long]),"POST", """ Delete a computer""", Routes.prefix + """computers/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:55
case controllers_ButtonSwitchs_list26(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("mfg1Part")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.ButtonSwitchs.list(p, s, o, f), HandlerDef(this, "controllers.ButtonSwitchs", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ ButtonSwitch list (look at the default values for pagination parameters)""", Routes.prefix + """buttonswitchs"""))
   }
}
        

// @LINE:58
case controllers_ButtonSwitchs_create27(params) => {
   call { 
        invokeHandler(controllers.ButtonSwitchs.create(), HandlerDef(this, "controllers.ButtonSwitchs", "create", Nil,"GET", """ Add ButtonSwitch""", Routes.prefix + """buttonswitchs/new"""))
   }
}
        

// @LINE:59
case controllers_ButtonSwitchs_save28(params) => {
   call { 
        invokeHandler(controllers.ButtonSwitchs.save(), HandlerDef(this, "controllers.ButtonSwitchs", "save", Nil,"POST", """""", Routes.prefix + """buttonswitchs"""))
   }
}
        

// @LINE:62
case controllers_ButtonSwitchs_edit29(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.ButtonSwitchs.edit(id), HandlerDef(this, "controllers.ButtonSwitchs", "edit", Seq(classOf[String]),"GET", """ Edit existing ButtonSwitch""", Routes.prefix + """buttonswitchs/$id<[^/]+>"""))
   }
}
        

// @LINE:63
case controllers_ButtonSwitchs_update30(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.ButtonSwitchs.update(id), HandlerDef(this, "controllers.ButtonSwitchs", "update", Seq(classOf[String]),"POST", """""", Routes.prefix + """buttonswitchs/$id<[^/]+>"""))
   }
}
        

// @LINE:66
case controllers_ButtonSwitchs_delete31(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.ButtonSwitchs.delete(id), HandlerDef(this, "controllers.ButtonSwitchs", "delete", Seq(classOf[String]),"POST", """ Delete a ButtonSwitch""", Routes.prefix + """buttonswitchs/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:70
case controllers_Application_javascriptRoutes32(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """ Javascript routing""", Routes.prefix + """assets/javascripts/routes"""))
   }
}
        

// @LINE:73
case controllers_Assets_at33(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /public path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     