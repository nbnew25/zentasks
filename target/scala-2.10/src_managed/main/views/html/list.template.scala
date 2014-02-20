
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[Project],User,com.avaje.ebean.Page[Computer],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User, currentPage: com.avaje.ebean.Page[Computer], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.ComputerDB.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.152*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main(projects, user)/*38.22*/ {_display_(Seq[Any](format.raw/*38.24*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("computers.list.title", currentPage.getTotalRowCount))),format.raw/*40.87*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.ComputerDB.create())),format.raw/*55.74*/("""">Add a new computer</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Computer name"))),format.raw/*70.53*/("""
                    """),_display_(Seq[Any](/*71.22*/header("introduced", "Introduced"))),format.raw/*71.56*/("""
                    """),_display_(Seq[Any](/*72.22*/header("discontinued", "Discontinued"))),format.raw/*72.60*/("""
                    """),_display_(Seq[Any](/*73.22*/header("company.name", "Company"))),format.raw/*73.55*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*78.18*/for(computer <- currentPage.getList) yield /*78.54*/ {_display_(Seq[Any](format.raw/*78.56*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*80.39*/routes/*80.45*/.ComputerDB.edit(computer.id))),format.raw/*80.74*/("""">"""),_display_(Seq[Any](/*80.77*/computer/*80.85*/.name)),format.raw/*80.90*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*82.30*/if(computer.introduced == null)/*82.61*/ {_display_(Seq[Any](format.raw/*82.63*/("""
                                <em>-</em>
                            """)))}/*84.31*/else/*84.36*/{_display_(Seq[Any](format.raw/*84.37*/("""
                                """),_display_(Seq[Any](/*85.34*/computer/*85.42*/.introduced.format("dd MMM yyyy"))),format.raw/*85.75*/("""
                            """)))})),format.raw/*86.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*89.30*/if(computer.discontinued == null)/*89.63*/ {_display_(Seq[Any](format.raw/*89.65*/("""
                                <em>-</em>
                            """)))}/*91.31*/else/*91.36*/{_display_(Seq[Any](format.raw/*91.37*/("""
                                """),_display_(Seq[Any](/*92.34*/computer/*92.42*/.discontinued.format("dd MMM yyyy"))),format.raw/*92.77*/("""
                            """)))})),format.raw/*93.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*96.30*/if(computer.company == null)/*96.58*/ {_display_(Seq[Any](format.raw/*96.60*/("""
                                <em>-</em>
                            """)))}/*98.31*/else/*98.36*/{_display_(Seq[Any](format.raw/*98.37*/("""
                                """),_display_(Seq[Any](/*99.34*/computer/*99.42*/.company.name)),format.raw/*99.55*/("""
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
    
    def render(projects:List[Project],user:User,currentPage:com.avaje.ebean.Page[Computer],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(projects,user,currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((List[Project],User,com.avaje.ebean.Page[Computer],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (projects,user,currentPage,currentSortBy,currentOrder,currentFilter) => apply(projects,user,currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:51:48 ICT 2014
                    SOURCE: /home/tannb/git/zentasks/app/views/list.scala.html
                    HASH: 3de4cbb1a527db6a510117183b42b478d926469f
                    MATRIX: 837->1|1065->896|1079->902|1190->932|1243->949|1255->952|1294->969|1339->978|1373->1004|1461->1068|1518->1089|1552->1101|1591->1104|1618->1109|1656->280|1667->284|2198->151|2227->278|2255->784|2285->894|2313->1125|2351->1128|2380->1148|2420->1150|2486->1180|2570->1242|2617->1254|2658->1286|2698->1288|2815->1369|2829->1374|2866->1389|2918->1410|3012->1468|3049->1483|3166->1564|3201->1577|3448->1788|3463->1794|3505->1814|3595->1869|3641->1906|3681->1908|3805->2015|3818->2020|3857->2021|4013->2141|4066->2172|4124->2194|4180->2228|4238->2250|4298->2288|4356->2310|4411->2343|4529->2425|4581->2461|4621->2463|4721->2527|4736->2533|4787->2562|4826->2565|4843->2573|4870->2578|4974->2646|5014->2677|5054->2679|5146->2753|5159->2758|5198->2759|5268->2793|5285->2801|5340->2834|5402->2864|5527->2953|5569->2986|5609->2988|5701->3062|5714->3067|5753->3068|5823->3102|5840->3110|5897->3145|5959->3175|6084->3264|6121->3292|6161->3294|6253->3368|6266->3373|6305->3374|6375->3408|6392->3416|6427->3429|6490->3459|6597->3533|6758->3657|6791->3680|6832->3682|6942->3755|7005->3795|7090->3861|7104->3866|7144->3867|7315->4005|7425->4078|7446->4089|7502->4122|7583->4166|7616->4189|7657->4191|7767->4264|7830->4304|7911->4366|7925->4371|7965->4372|8132->4506|8212->4554|8255->4565
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|104->78|104->78|104->78|106->80|106->80|106->80|106->80|106->80|106->80|108->82|108->82|108->82|110->84|110->84|110->84|111->85|111->85|111->85|112->86|115->89|115->89|115->89|117->91|117->91|117->91|118->92|118->92|118->92|119->93|122->96|122->96|122->96|124->98|124->98|124->98|125->99|125->99|125->99|126->100|129->103|136->110|136->110|136->110|138->112|138->112|140->114|140->114|140->114|144->118|146->120|146->120|146->120|148->122|148->122|148->122|150->124|150->124|152->126|152->126|152->126|156->130|160->134|162->136
                    -- GENERATED --
                */
            