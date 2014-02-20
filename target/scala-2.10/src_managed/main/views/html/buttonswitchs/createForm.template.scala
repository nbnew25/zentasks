
package views.html.buttonswitchs

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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Form[ButtonSwitch],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User, buttonSwitchForm: Form[ButtonSwitch]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.77*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(projects, user)/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    
    <h1>Add a Button Switch</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.ButtonSwitchs.save())/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(buttonSwitchForm("mfg1Part"), '_label -> "Mfg1 Part"))),format.raw/*15.77*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(buttonSwitchForm("category"), '_label -> "Category"))),format.raw/*16.76*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(buttonSwitchForm("prefix"), '_label -> "Prefix"))),format.raw/*17.72*/("""
            """),_display_(Seq[Any](/*18.14*/inputText(buttonSwitchForm("partType"), '_label -> "Part Type"))),format.raw/*18.77*/("""
            """),_display_(Seq[Any](/*19.14*/inputText(buttonSwitchForm("description"), '_label -> "Description"))),format.raw/*19.82*/("""
            """),_display_(Seq[Any](/*20.14*/inputText(buttonSwitchForm("device"), '_label -> "Device"))),format.raw/*20.72*/("""
            """),_display_(Seq[Any](/*21.14*/inputText(buttonSwitchForm("mfg1"), '_label -> "Mfg1"))),format.raw/*21.68*/("""
            """),_display_(Seq[Any](/*22.14*/inputText(buttonSwitchForm("distr1"), '_label -> "Distr1"))),format.raw/*22.72*/("""
            """),_display_(Seq[Any](/*23.14*/inputText(buttonSwitchForm("distr1Part"), '_label -> "Distr1 Part"))),format.raw/*23.81*/("""
            """),_display_(Seq[Any](/*24.14*/inputText(buttonSwitchForm("value"), '_label -> "Value"))),format.raw/*24.70*/("""
            """),_display_(Seq[Any](/*25.14*/inputText(buttonSwitchForm("package_"), '_label -> "Package"))),format.raw/*25.75*/("""
            """),_display_(Seq[Any](/*26.14*/inputText(buttonSwitchForm("voltage"), '_label -> "Voltage"))),format.raw/*26.74*/("""
            """),_display_(Seq[Any](/*27.14*/inputText(buttonSwitchForm("current"), '_label -> "Current"))),format.raw/*27.74*/("""
            """),_display_(Seq[Any](/*28.14*/inputText(buttonSwitchForm("pcbFootprint"), '_label -> "Pcb Footprint"))),format.raw/*28.85*/("""
            """),_display_(Seq[Any](/*29.14*/inputText(buttonSwitchForm("name"), '_label -> "Name"))),format.raw/*29.68*/("""
            """),_display_(Seq[Any](/*30.14*/inputText(buttonSwitchForm("niMark"), '_label -> "NiMark"))),format.raw/*30.72*/("""
            """),_display_(Seq[Any](/*31.14*/inputText(buttonSwitchForm("type"), '_label -> "Type"))),format.raw/*31.68*/("""
            """),_display_(Seq[Any](/*32.14*/inputText(buttonSwitchForm("subtype"), '_label -> "Subtype"))),format.raw/*32.74*/("""
            """),_display_(Seq[Any](/*33.14*/inputText(buttonSwitchForm("noOfPins"), '_label -> "No Of Pins"))),format.raw/*33.78*/("""
            """),_display_(Seq[Any](/*34.14*/inputText(buttonSwitchForm("accountId"), '_label -> "Account ID"))),format.raw/*34.79*/("""
            """),_display_(Seq[Any](/*35.14*/inputText(buttonSwitchForm("modifiedDate"), '_label -> "Modified Date"))),format.raw/*35.85*/("""
            """),_display_(Seq[Any](/*36.14*/inputText(buttonSwitchForm("schematicPart"), '_label -> "Schematic Part"))),format.raw/*36.87*/("""
            """),_display_(Seq[Any](/*37.14*/inputText(buttonSwitchForm("status"), '_label -> "Status"))),format.raw/*37.72*/("""

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this button switch" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*43.23*/routes/*43.29*/.ButtonSwitchs.list())),format.raw/*43.50*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*46.6*/("""
    
""")))})))}
    }
    
    def render(projects:List[Project],user:User,buttonSwitchForm:Form[ButtonSwitch]): play.api.templates.HtmlFormat.Appendable = apply(projects,user,buttonSwitchForm)
    
    def f:((List[Project],User,Form[ButtonSwitch]) => play.api.templates.HtmlFormat.Appendable) = (projects,user,buttonSwitchForm) => apply(projects,user,buttonSwitchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:51:49 ICT 2014
                    SOURCE: /home/tannb/git/zentasks/app/views/buttonswitchs/createForm.scala.html
                    HASH: 995dcd796dad1b298936bdcffbc669a3f8e60ad6
                    MATRIX: 824->1|1001->97|1033->121|1117->76|1145->95|1173->175|1211->179|1239->199|1278->201|1362->250|1404->283|1444->285|1531->336|1616->399|1666->413|1750->475|1800->489|1880->547|1930->561|2015->624|2065->638|2155->706|2205->720|2285->778|2335->792|2411->846|2461->860|2541->918|2591->932|2680->999|2730->1013|2808->1069|2858->1083|2941->1144|2991->1158|3073->1218|3123->1232|3205->1292|3255->1306|3348->1377|3398->1391|3474->1445|3524->1459|3604->1517|3654->1531|3730->1585|3780->1599|3862->1659|3912->1673|3998->1737|4048->1751|4135->1816|4185->1830|4278->1901|4328->1915|4423->1988|4473->2002|4553->2060|4764->2235|4779->2241|4822->2262|4908->2317
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|48->20|48->20|49->21|49->21|50->22|50->22|51->23|51->23|52->24|52->24|53->25|53->25|54->26|54->26|55->27|55->27|56->28|56->28|57->29|57->29|58->30|58->30|59->31|59->31|60->32|60->32|61->33|61->33|62->34|62->34|63->35|63->35|64->36|64->36|65->37|65->37|71->43|71->43|71->43|74->46
                    -- GENERATED --
                */
            