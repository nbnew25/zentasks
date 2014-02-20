
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[Project],User,com.avaje.ebean.Page[ButtonSwitch],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User, currentPage: com.avaje.ebean.Page[ButtonSwitch], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.ButtonSwitchs.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.156*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main(projects, user)/*38.22*/ {_display_(Seq[Any](format.raw/*38.24*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("buttonswitchs.list.title", currentPage.getTotalRowCount))),format.raw/*40.91*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by description...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.ButtonSwitchs.create())),format.raw/*55.77*/("""">Add a new buttonswitch</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("mfg1Part", "Mfg1 Part"))),format.raw/*70.53*/("""
                    """),_display_(Seq[Any](/*71.22*/header("description", "Description"))),format.raw/*71.58*/("""
                    """),_display_(Seq[Any](/*72.22*/header("device", "Device"))),format.raw/*72.48*/("""
                    """),_display_(Seq[Any](/*73.22*/header("modifiedDate", "Modified Date"))),format.raw/*73.61*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*78.18*/for(item <- currentPage.getList) yield /*78.50*/ {_display_(Seq[Any](format.raw/*78.52*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*80.39*/routes/*80.45*/.ButtonSwitchs.edit(item.mfg1Part))),format.raw/*80.79*/("""">"""),_display_(Seq[Any](/*80.82*/item/*80.86*/.mfg1Part)),format.raw/*80.95*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*82.30*/if(item.description == null)/*82.58*/ {_display_(Seq[Any](format.raw/*82.60*/("""
                                <em>-</em>
                            """)))}/*84.31*/else/*84.36*/{_display_(Seq[Any](format.raw/*84.37*/("""
                                """),_display_(Seq[Any](/*85.34*/item/*85.38*/.description)),format.raw/*85.50*/("""
                            """)))})),format.raw/*86.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*89.30*/if(item.device == null)/*89.53*/ {_display_(Seq[Any](format.raw/*89.55*/("""
                                <em>-</em>
                            """)))}/*91.31*/else/*91.36*/{_display_(Seq[Any](format.raw/*91.37*/("""
                                """),_display_(Seq[Any](/*92.34*/item/*92.38*/.device)),format.raw/*92.45*/("""
                            """)))})),format.raw/*93.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*96.30*/if(item.modifiedDate == null)/*96.59*/ {_display_(Seq[Any](format.raw/*96.61*/("""
                                <em>-</em>
                            """)))}/*98.31*/else/*98.36*/{_display_(Seq[Any](format.raw/*98.37*/("""
                                """),_display_(Seq[Any](/*99.34*/item/*99.38*/.modifiedDate.format("dd MMM yyyy"))),format.raw/*99.73*/("""
                            """)))})),format.raw/*100.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*103.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*110.18*/if(currentPage.hasPrev)/*110.41*/ {_display_(Seq[Any](format.raw/*110.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*112.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*112.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*114.19*/else/*114.24*/{_display_(Seq[Any](format.raw/*114.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*118.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*120.36*/currentPage/*120.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*120.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*122.18*/if(currentPage.hasNext)/*122.41*/ {_display_(Seq[Any](format.raw/*122.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*124.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*124.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*126.19*/else/*126.24*/{_display_(Seq[Any](format.raw/*126.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*130.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*134.6*/("""
        
""")))})),format.raw/*136.2*/("""

            """))}
    }
    
    def render(projects:List[Project],user:User,currentPage:com.avaje.ebean.Page[ButtonSwitch],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(projects,user,currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((List[Project],User,com.avaje.ebean.Page[ButtonSwitch],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (projects,user,currentPage,currentSortBy,currentOrder,currentFilter) => apply(projects,user,currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:51:49 ICT 2014
                    SOURCE: /home/tannb/git/zentasks/app/views/buttonswitchs/list.scala.html
                    HASH: baf4e4cf24cd987c08cb61867897cf319775509f
                    MATRIX: 855->1|1087->903|1101->909|1212->939|1265->956|1277->959|1316->976|1361->985|1395->1011|1483->1075|1540->1096|1574->1108|1613->1111|1640->1116|1678->284|1689->288|2223->155|2252->282|2280->791|2310->901|2338->1132|2376->1135|2405->1155|2445->1157|2511->1187|2599->1253|2646->1265|2687->1297|2727->1299|2844->1380|2858->1385|2895->1400|2947->1421|3041->1479|3078->1494|3195->1575|3230->1588|3475->1797|3490->1803|3535->1826|3629->1885|3675->1922|3715->1924|3839->2031|3852->2036|3891->2037|4047->2157|4100->2188|4158->2210|4216->2246|4274->2268|4322->2294|4380->2316|4441->2355|4559->2437|4607->2469|4647->2471|4747->2535|4762->2541|4818->2575|4857->2578|4870->2582|4901->2591|5005->2659|5042->2687|5082->2689|5174->2763|5187->2768|5226->2769|5296->2803|5309->2807|5343->2819|5405->2849|5530->2938|5562->2961|5602->2963|5694->3037|5707->3042|5746->3043|5816->3077|5829->3081|5858->3088|5920->3118|6045->3207|6083->3236|6123->3238|6215->3312|6228->3317|6267->3318|6337->3352|6350->3356|6407->3391|6470->3421|6577->3495|6738->3619|6771->3642|6812->3644|6922->3717|6985->3757|7070->3823|7084->3828|7124->3829|7295->3967|7405->4040|7426->4051|7482->4084|7563->4128|7596->4151|7637->4153|7747->4226|7810->4266|7891->4328|7905->4333|7945->4334|8112->4468|8192->4516|8235->4527
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|104->78|104->78|104->78|106->80|106->80|106->80|106->80|106->80|106->80|108->82|108->82|108->82|110->84|110->84|110->84|111->85|111->85|111->85|112->86|115->89|115->89|115->89|117->91|117->91|117->91|118->92|118->92|118->92|119->93|122->96|122->96|122->96|124->98|124->98|124->98|125->99|125->99|125->99|126->100|129->103|136->110|136->110|136->110|138->112|138->112|140->114|140->114|140->114|144->118|146->120|146->120|146->120|148->122|148->122|148->122|150->124|150->124|152->126|152->126|152->126|156->130|160->134|162->136
                    -- GENERATED --
                */
            