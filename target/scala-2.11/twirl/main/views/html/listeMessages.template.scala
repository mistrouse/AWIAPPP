
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listeMessages_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class listeMessages extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Message],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: List[Message]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.Message

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/layouts/*7.9*/.main("Messagerie IG")/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
"""),format.raw/*8.1*/("""<h1>Gérer les messages</h1>

<h2>Liste des messages</h2>

<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>Contenu</th>
            <th>Autheur</th>
            <th>Groupe</th>
            <th>Envoyé le</th>
            <th>Document</th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        """),_display_(/*27.10*/for(m <- messages) yield /*27.28*/ {_display_(Seq[Any](format.raw/*27.30*/("""
        """),format.raw/*28.9*/("""<tr>
            <td>"""),_display_(/*29.18*/m/*29.19*/.getId()),format.raw/*29.27*/("""</td>
            <td>"""),_display_(/*30.18*/m/*30.19*/.getContent()),format.raw/*30.32*/("""</td>
            <td>"""),_display_(/*31.18*/m/*31.19*/.getAutheur().getName()),format.raw/*31.42*/("""</td>
            <td><a href=""""),_display_(/*32.27*/routes/*32.33*/.GroupeController.voirGroupe(m.getId())),format.raw/*32.72*/("""">
                """),_display_(/*33.18*/if(m.getGroupe() != null)/*33.43*/ {_display_(Seq[Any](format.raw/*33.45*/("""
                """),_display_(/*34.18*/m/*34.19*/.getGroupe().getName()),format.raw/*34.41*/("""
                """)))}/*35.19*/else/*35.24*/{_display_(Seq[Any](format.raw/*35.25*/("""
                """),format.raw/*36.17*/("""all
                """)))}),format.raw/*37.18*/("""
            """),format.raw/*38.13*/("""</td>
            <td>"""),_display_(/*39.18*/m/*39.19*/.getCreationDate.format("dd MMM yy")),format.raw/*39.55*/("""</td>
            <td>
                """),_display_(/*41.18*/if(m.getDocument() != null)/*41.45*/ {_display_(Seq[Any](format.raw/*41.47*/("""
                """),format.raw/*42.17*/("""<a href="assets/upload/"""),_display_(/*42.41*/m/*42.42*/.getDocument().getTitle()),format.raw/*42.67*/("""">"""),_display_(/*42.70*/m/*42.71*/.getDocument().getTitle()),format.raw/*42.96*/("""</a>
                """)))}),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""</td>
            <td><a href=""""),_display_(/*45.27*/routes/*45.33*/.MessageController.delete(m.getId())),format.raw/*45.69*/("""">Supprimer</a></td>
        </tr>
        """)))}),format.raw/*47.10*/("""
        """),format.raw/*48.9*/("""</tbody>
    </table>
</div>
""")))}))
      }
    }
  }

  def render(messages:List[Message]): play.twirl.api.HtmlFormat.Appendable = apply(messages)

  def f:((List[Message]) => play.twirl.api.HtmlFormat.Appendable) = (messages) => apply(messages)

  def ref: this.type = this

}


}

/**/
object listeMessages extends listeMessages_Scope0.listeMessages
              /*
                  -- GENERATED --
                  DATE: Wed Jun 07 19:30:56 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/listeMessages.scala.html
                  HASH: 81a2a8c9b26b272e2693ed9da0f902dc5097ed7e
                  MATRIX: 768->1|909->26|937->51|966->55|980->62|1010->84|1049->86|1076->87|1511->495|1545->513|1585->515|1621->524|1670->546|1680->547|1709->555|1759->578|1769->579|1803->592|1853->615|1863->616|1907->639|1966->671|1981->677|2041->716|2088->736|2122->761|2162->763|2207->781|2217->782|2260->804|2297->823|2310->828|2349->829|2394->846|2446->867|2487->880|2537->903|2547->904|2604->940|2671->980|2707->1007|2747->1009|2792->1026|2843->1050|2853->1051|2899->1076|2929->1079|2939->1080|2985->1105|3038->1127|3079->1140|3138->1172|3153->1178|3210->1214|3285->1258|3321->1267
                  LINES: 27->1|32->1|34->4|37->7|37->7|37->7|37->7|38->8|57->27|57->27|57->27|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|67->37|68->38|69->39|69->39|69->39|71->41|71->41|71->41|72->42|72->42|72->42|72->42|72->42|72->42|72->42|73->43|74->44|75->45|75->45|75->45|77->47|78->48
                  -- GENERATED --
              */
          