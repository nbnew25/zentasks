
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User)(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap2.min.css"))),format.raw/*7.120*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*9.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*10.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*11.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*12.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Assets.at("javascripts/main.js"))),format.raw/*13.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*14.46*/routes/*14.52*/.Application.javascriptRoutes)),format.raw/*14.81*/(""""></script>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Projects.index)),format.raw/*18.44*/("""" id="logo"><span>Zen</span>tasks</a>
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*20.22*/user/*20.26*/.name)),format.raw/*20.31*/(""" <span>("""),_display_(Seq[Any](/*20.40*/user/*20.44*/.email)),format.raw/*20.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*22.31*/routes/*22.37*/.Application.logout())),format.raw/*22.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="projects">
                """),_display_(Seq[Any](/*29.18*/projects/*29.26*/.groupBy(_.folder).map/*29.48*/ {/*30.21*/case (group, projects) =>/*30.46*/ {_display_(Seq[Any](format.raw/*30.48*/("""
                        """),_display_(Seq[Any](/*31.26*/views/*31.31*/.html.projects.group(group, projects))),format.raw/*31.68*/("""
                    """)))}})),format.raw/*33.18*/("""
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            """),_display_(Seq[Any](/*38.14*/body)),format.raw/*38.18*/("""
        </section>
    </body>
</html>

"""))}
    }
    
    def render(projects:List[Project],user:User,body:Html): play.api.templates.HtmlFormat.Appendable = apply(projects,user)(body)
    
    def f:((List[Project],User) => (Html) => play.api.templates.HtmlFormat.Appendable) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:51:49 ICT 2014
                    SOURCE: /home/tannb/git/zentasks/app/views/main.scala.html
                    HASH: b8ab6d0b557e28389554fed18d3472a644d78390
                    MATRIX: 790->1|933->50|1078->160|1092->166|1145->198|1252->270|1266->276|1332->320|1440->393|1454->399|1510->433|1593->481|1607->487|1669->528|1762->585|1777->591|1845->637|1938->694|1953->700|2018->743|2111->800|2126->806|2189->847|2282->904|2297->910|2352->943|2445->1000|2460->1006|2511->1035|2621->1109|2636->1115|2673->1130|2795->1216|2808->1220|2835->1225|2880->1234|2893->1238|2921->1244|3022->1309|3037->1315|3080->1336|3315->1535|3332->1543|3363->1565|3374->1588|3408->1613|3448->1615|3510->1641|3524->1646|3583->1683|3638->1723|3802->1851|3828->1855
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|46->18|48->20|48->20|48->20|48->20|48->20|48->20|50->22|50->22|50->22|57->29|57->29|57->29|57->30|57->30|57->30|58->31|58->31|58->31|59->33|64->38|64->38
                    -- GENERATED --
                */
            