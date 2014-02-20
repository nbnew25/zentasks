// @SOURCE:/home/tannb/git/zentasks/conf/routes
// @HASH:f9f7b21dd491a2e48359b9b36d92552aef37263b
// @DATE:Thu Feb 20 10:51:47 ICT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:73
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:73
class ReverseAssets {
    

// @LINE:73
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:37
class ReverseComputerDB {
    

// @LINE:51
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:43
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/new")
}
                                                

// @LINE:47
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:48
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:40
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:44
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers")
}
                                                

// @LINE:37
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "index2")
}
                                                
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    

// @LINE:30
def delete(task:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("task", task))
}
                                                

// @LINE:34
def renameFolder(project:Long, folder:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks/folder" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                

// @LINE:32
def addFolder(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks/folder")
}
                                                

// @LINE:33
def deleteFolder(project:Long, folder:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks/folder" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                

// @LINE:29
def update(task:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("task", task))
}
                                                

// @LINE:27
def index(project:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks")
}
                                                

// @LINE:28
def add(project:Long, folder:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                
    
}
                          

// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:55
class ReverseButtonSwitchs {
    

// @LINE:62
def edit(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "buttonswitchs/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:58
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "buttonswitchs/new")
}
                                                

// @LINE:55
def list(p:Int = 0, s:String = "mfg1Part", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "buttonswitchs" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "mfg1Part") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:66
def delete(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "buttonswitchs/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/delete")
}
                                                

// @LINE:59
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "buttonswitchs")
}
                                                

// @LINE:63
def update(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "buttonswitchs/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                
    
}
                          

// @LINE:70
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:70
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:6
class ReverseProjects {
    

// @LINE:16
def addGroup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projects/groups")
}
                                                

// @LINE:20
def delete(project:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project))
}
                                                

// @LINE:21
def rename(project:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project))
}
                                                

// @LINE:24
def removeUser(project:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/team")
}
                                                

// @LINE:17
def deleteGroup(group:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "projects/groups" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("group", group)))))
}
                                                

// @LINE:18
def renameGroup(group:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "projects/groups" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("group", group)))))
}
                                                

// @LINE:14
def add(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projects")
}
                                                

// @LINE:23
def addUser(project:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/team")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:73
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:73
class ReverseAssets {
    

// @LINE:73
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:37
class ReverseComputerDB {
    

// @LINE:51
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputerDB.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:43
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputerDB.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/new"})
      }
   """
)
                        

// @LINE:47
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputerDB.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:48
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputerDB.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:40
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputerDB.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:44
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputerDB.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers"})
      }
   """
)
                        

// @LINE:37
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputerDB.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index2"})
      }
   """
)
                        
    
}
              

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    

// @LINE:30
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.delete",
   """
      function(task) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("task", task)})
      }
   """
)
                        

// @LINE:34
def renameFolder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.renameFolder",
   """
      function(project,folder) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks/folder" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                        

// @LINE:32
def addFolder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.addFolder",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/folder"})
      }
   """
)
                        

// @LINE:33
def deleteFolder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.deleteFolder",
   """
      function(project,folder) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks/folder" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                        

// @LINE:29
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.update",
   """
      function(task) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("task", task)})
      }
   """
)
                        

// @LINE:27
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.index",
   """
      function(project) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks"})
      }
   """
)
                        

// @LINE:28
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.add",
   """
      function(project,folder) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                        
    
}
              

// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:55
class ReverseButtonSwitchs {
    

// @LINE:62
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ButtonSwitchs.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buttonswitchs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:58
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ButtonSwitchs.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buttonswitchs/new"})
      }
   """
)
                        

// @LINE:55
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ButtonSwitchs.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buttonswitchs" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:66
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ButtonSwitchs.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "buttonswitchs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/delete"})
      }
   """
)
                        

// @LINE:59
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ButtonSwitchs.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "buttonswitchs"})
      }
   """
)
                        

// @LINE:63
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ButtonSwitchs.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "buttonswitchs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        
    
}
              

// @LINE:70
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:70
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:6
class ReverseProjects {
    

// @LINE:16
def addGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.addGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/groups"})
      }
   """
)
                        

// @LINE:20
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.delete",
   """
      function(project) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project)})
      }
   """
)
                        

// @LINE:21
def rename : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.rename",
   """
      function(project) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project)})
      }
   """
)
                        

// @LINE:24
def removeUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.removeUser",
   """
      function(project) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/team"})
      }
   """
)
                        

// @LINE:17
def deleteGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.deleteGroup",
   """
      function(group) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/groups" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("group", group)])})
      }
   """
)
                        

// @LINE:18
def renameGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.renameGroup",
   """
      function(group) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/groups" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("group", group)])})
      }
   """
)
                        

// @LINE:14
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects"})
      }
   """
)
                        

// @LINE:23
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.addUser",
   """
      function(project) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/team"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:73
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:73
class ReverseAssets {
    

// @LINE:73
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /public path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:37
class ReverseComputerDB {
    

// @LINE:51
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputerDB.delete(id), HandlerDef(this, "controllers.ComputerDB", "delete", Seq(classOf[Long]), "POST", """ Delete a computer""", _prefix + """computers/$id<[^/]+>/delete""")
)
                      

// @LINE:43
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputerDB.create(), HandlerDef(this, "controllers.ComputerDB", "create", Seq(), "GET", """ Add computer""", _prefix + """computers/new""")
)
                      

// @LINE:47
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputerDB.edit(id), HandlerDef(this, "controllers.ComputerDB", "edit", Seq(classOf[Long]), "GET", """ Edit existing computer""", _prefix + """computers/$id<[^/]+>""")
)
                      

// @LINE:48
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputerDB.update(id), HandlerDef(this, "controllers.ComputerDB", "update", Seq(classOf[Long]), "POST", """""", _prefix + """computers/$id<[^/]+>""")
)
                      

// @LINE:40
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputerDB.list(p, s, o, f), HandlerDef(this, "controllers.ComputerDB", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Computers list (look at the default values for pagination parameters)""", _prefix + """computers""")
)
                      

// @LINE:44
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputerDB.save(), HandlerDef(this, "controllers.ComputerDB", "save", Seq(), "POST", """""", _prefix + """computers""")
)
                      

// @LINE:37
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputerDB.index(), HandlerDef(this, "controllers.ComputerDB", "index", Seq(), "GET", """ Default path will just redirect to the computer list""", _prefix + """index2""")
)
                      
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    

// @LINE:30
def delete(task:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.delete(task), HandlerDef(this, "controllers.Tasks", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """tasks/$task<[^/]+>""")
)
                      

// @LINE:34
def renameFolder(project:Long, folder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.renameFolder(project, folder), HandlerDef(this, "controllers.Tasks", "renameFolder", Seq(classOf[Long], classOf[String]), "PUT", """""", _prefix + """project/$project<[^/]+>/tasks/folder""")
)
                      

// @LINE:32
def addFolder(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.addFolder(), HandlerDef(this, "controllers.Tasks", "addFolder", Seq(), "POST", """""", _prefix + """tasks/folder""")
)
                      

// @LINE:33
def deleteFolder(project:Long, folder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.deleteFolder(project, folder), HandlerDef(this, "controllers.Tasks", "deleteFolder", Seq(classOf[Long], classOf[String]), "DELETE", """""", _prefix + """projects/$project<[^/]+>/tasks/folder""")
)
                      

// @LINE:29
def update(task:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.update(task), HandlerDef(this, "controllers.Tasks", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """tasks/$task<[^/]+>""")
)
                      

// @LINE:27
def index(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.index(project), HandlerDef(this, "controllers.Tasks", "index", Seq(classOf[Long]), "GET", """ Tasks""", _prefix + """projects/$project<[^/]+>/tasks""")
)
                      

// @LINE:28
def add(project:Long, folder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.add(project, folder), HandlerDef(this, "controllers.Tasks", "add", Seq(classOf[Long], classOf[String]), "POST", """""", _prefix + """projects/$project<[^/]+>/tasks""")
)
                      
    
}
                          

// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:55
class ReverseButtonSwitchs {
    

// @LINE:62
def edit(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ButtonSwitchs.edit(id), HandlerDef(this, "controllers.ButtonSwitchs", "edit", Seq(classOf[String]), "GET", """ Edit existing ButtonSwitch""", _prefix + """buttonswitchs/$id<[^/]+>""")
)
                      

// @LINE:58
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ButtonSwitchs.create(), HandlerDef(this, "controllers.ButtonSwitchs", "create", Seq(), "GET", """ Add ButtonSwitch""", _prefix + """buttonswitchs/new""")
)
                      

// @LINE:55
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ButtonSwitchs.list(p, s, o, f), HandlerDef(this, "controllers.ButtonSwitchs", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ ButtonSwitch list (look at the default values for pagination parameters)""", _prefix + """buttonswitchs""")
)
                      

// @LINE:66
def delete(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ButtonSwitchs.delete(id), HandlerDef(this, "controllers.ButtonSwitchs", "delete", Seq(classOf[String]), "POST", """ Delete a ButtonSwitch""", _prefix + """buttonswitchs/$id<[^/]+>/delete""")
)
                      

// @LINE:59
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ButtonSwitchs.save(), HandlerDef(this, "controllers.ButtonSwitchs", "save", Seq(), "POST", """""", _prefix + """buttonswitchs""")
)
                      

// @LINE:63
def update(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ButtonSwitchs.update(id), HandlerDef(this, "controllers.ButtonSwitchs", "update", Seq(classOf[String]), "POST", """""", _prefix + """buttonswitchs/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:70
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:70
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Javascript routing""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:6
class ReverseProjects {
    

// @LINE:16
def addGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.addGroup(), HandlerDef(this, "controllers.Projects", "addGroup", Seq(), "POST", """""", _prefix + """projects/groups""")
)
                      

// @LINE:20
def delete(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.delete(project), HandlerDef(this, "controllers.Projects", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """projects/$project<[^/]+>""")
)
                      

// @LINE:21
def rename(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.rename(project), HandlerDef(this, "controllers.Projects", "rename", Seq(classOf[Long]), "PUT", """""", _prefix + """projects/$project<[^/]+>""")
)
                      

// @LINE:24
def removeUser(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.removeUser(project), HandlerDef(this, "controllers.Projects", "removeUser", Seq(classOf[Long]), "DELETE", """""", _prefix + """projects/$project<[^/]+>/team""")
)
                      

// @LINE:17
def deleteGroup(group:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.deleteGroup(group), HandlerDef(this, "controllers.Projects", "deleteGroup", Seq(classOf[String]), "DELETE", """""", _prefix + """projects/groups""")
)
                      

// @LINE:18
def renameGroup(group:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.renameGroup(group), HandlerDef(this, "controllers.Projects", "renameGroup", Seq(classOf[String]), "PUT", """""", _prefix + """projects/groups""")
)
                      

// @LINE:14
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.add(), HandlerDef(this, "controllers.Projects", "add", Seq(), "POST", """ Projects""", _prefix + """projects""")
)
                      

// @LINE:23
def addUser(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.addUser(project), HandlerDef(this, "controllers.Projects", "addUser", Seq(classOf[Long]), "POST", """""", _prefix + """projects/$project<[^/]+>/team""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.index(), HandlerDef(this, "controllers.Projects", "index", Seq(), "GET", """ The home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    