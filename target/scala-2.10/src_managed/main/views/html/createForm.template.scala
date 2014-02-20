
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Form[Computer],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User, computerForm: Form[Computer]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(projects, user)/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    
    <h1>Add a computer</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.ComputerDB.save())/*11.36*/ {_display_(Seq[Any](format.raw/*11.38*/("""
        
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
            <input type="submit" value="Create this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*31.23*/routes/*31.29*/.ComputerDB.list())),format.raw/*31.47*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*34.6*/("""
    
""")))})))}
    }
    
    def render(projects:List[Project],user:User,computerForm:Form[Computer]): play.api.templates.HtmlFormat.Appendable = apply(projects,user,computerForm)
    
    def f:((List[Project],User,Form[Computer]) => play.api.templates.HtmlFormat.Appendable) = (projects,user,computerForm) => apply(projects,user,computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:51:49 ICT 2014
                    SOURCE: /home/tannb/git/zentasks/app/views/createForm.scala.html
                    HASH: fcc6bd46282b1b2c5e3b4eb3c0d79796be56def7
                    MATRIX: 806->1|975->89|1007->113|1091->68|1119->87|1147->167|1185->171|1213->191|1252->193|1331->237|1370->267|1410->269|1497->320|1578->379|1628->393|1717->460|1767->474|1860->545|1911->560|2162->789|2381->972|2396->978|2436->996|2522->1051
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|47->19|52->24|59->31|59->31|59->31|62->34
                    -- GENERATED --
                */
            