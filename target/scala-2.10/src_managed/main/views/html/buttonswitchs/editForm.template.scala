
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Project],User,String,Form[ButtonSwitch],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User, id: String, buttonSwitchForm: Form[ButtonSwitch]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.89*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(projects, user)/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    
    <h1>Edit Button Switch</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.ButtonSwitchs.update(id))/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""
        
        <fieldset>
        
        	"""),_display_(Seq[Any](/*15.11*/inputText(buttonSwitchForm("mfg1Part"), '_label -> "Mfg1 Part"))),format.raw/*15.74*/("""
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
            <input type="submit" value="Save this button switch" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*43.23*/routes/*43.29*/.ButtonSwitchs.list())),format.raw/*43.50*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*46.6*/("""
    
    """),_display_(Seq[Any](/*48.6*/form(routes.ButtonSwitchs.delete(id), 'class -> "topRight")/*48.65*/ {_display_(Seq[Any](format.raw/*48.67*/("""
        <input type="submit" value="Delete this button switch" class="btn danger">
    """)))})),format.raw/*50.6*/("""
    
""")))})),format.raw/*52.2*/("""
"""))}
    }
    
    def render(projects:List[Project],user:User,id:String,buttonSwitchForm:Form[ButtonSwitch]): play.api.templates.HtmlFormat.Appendable = apply(projects,user,id,buttonSwitchForm)
    
    def f:((List[Project],User,String,Form[ButtonSwitch]) => play.api.templates.HtmlFormat.Appendable) = (projects,user,id,buttonSwitchForm) => apply(projects,user,id,buttonSwitchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:51:49 ICT 2014
                    SOURCE: /home/tannb/git/zentasks/app/views/buttonswitchs/editForm.scala.html
                    HASH: 7c5ad18613d765d6a360c19cd5a1b12f5c07fb2c
                    MATRIX: 829->1|1018->109|1050->133|1134->88|1162->107|1190->187|1228->191|1256->211|1295->213|1378->261|1424->298|1464->300|1548->348|1633->411|1683->425|1767->487|1817->501|1897->559|1947->573|2032->636|2082->650|2172->718|2222->732|2302->790|2352->804|2428->858|2478->872|2558->930|2608->944|2697->1011|2747->1025|2825->1081|2875->1095|2958->1156|3008->1170|3090->1230|3140->1244|3222->1304|3272->1318|3365->1389|3415->1403|3491->1457|3541->1471|3621->1529|3671->1543|3747->1597|3797->1611|3879->1671|3929->1685|4015->1749|4065->1763|4152->1828|4202->1842|4295->1913|4345->1927|4440->2000|4490->2014|4570->2072|4797->2263|4812->2269|4855->2290|4941->2345|4987->2356|5055->2415|5095->2417|5215->2506|5253->2513
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|48->20|48->20|49->21|49->21|50->22|50->22|51->23|51->23|52->24|52->24|53->25|53->25|54->26|54->26|55->27|55->27|56->28|56->28|57->29|57->29|58->30|58->30|59->31|59->31|60->32|60->32|61->33|61->33|62->34|62->34|63->35|63->35|64->36|64->36|65->37|65->37|71->43|71->43|71->43|74->46|76->48|76->48|76->48|78->50|80->52
                    -- GENERATED --
                */
            