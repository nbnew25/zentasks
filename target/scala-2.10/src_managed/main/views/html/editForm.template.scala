
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Project],User,Long,Form[Computer],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User, id: Long, computerForm: Form[Computer]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(projects, user)/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    
    <h1>Edit computer</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.ComputerDB.update(id))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""
            
            """),_display_(Seq[Any](/*19.14*/select(
                computerForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*24.14*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.ComputerDB.list())),format.raw/*30.47*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*33.6*/("""
    
    """),_display_(Seq[Any](/*35.6*/form(routes.ComputerDB.delete(id), 'class -> "topRight")/*35.62*/ {_display_(Seq[Any](format.raw/*35.64*/("""
        <input type="submit" value="Delete this computer" class="btn danger">
    """)))})),format.raw/*37.6*/("""
    
""")))})),format.raw/*39.2*/("""
"""))}
    }
    
    def render(projects:List[Project],user:User,id:Long,computerForm:Form[Computer]): play.api.templates.HtmlFormat.Appendable = apply(projects,user,id,computerForm)
    
    def f:((List[Project],User,Long,Form[Computer]) => play.api.templates.HtmlFormat.Appendable) = (projects,user,id,computerForm) => apply(projects,user,id,computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:51:49 ICT 2014
                    SOURCE: /home/tannb/git/zentasks/app/views/editForm.scala.html
                    HASH: f1e6a50f09c29c93945dedaad3135992d1d729ac
                    MATRIX: 809->1|988->99|1020->123|1104->78|1132->97|1160->177|1198->181|1226->201|1265->203|1343->246|1386->280|1426->282|1513->333|1594->392|1644->406|1733->473|1783->487|1876->558|1939->585|2190->814|2402->990|2417->996|2457->1014|2543->1069|2589->1080|2654->1136|2694->1138|2809->1222|2847->1229
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|47->19|52->24|58->30|58->30|58->30|61->33|63->35|63->35|63->35|65->37|67->39
                    -- GENERATED --
                */
            