
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
            <th>Envoyé à</th>
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
            <td>
                """),_display_(/*33.18*/if(m.getGroupe() != null)/*33.43*/ {_display_(Seq[Any](format.raw/*33.45*/("""
                """),_display_(/*34.18*/m/*34.19*/.getGroupe().getName()),format.raw/*34.41*/("""
                """)))}/*35.19*/else/*35.24*/{_display_(Seq[Any](format.raw/*35.25*/("""
                """),format.raw/*36.17*/("""all
                """)))}),format.raw/*37.18*/("""
            """),format.raw/*38.13*/("""</td>
            <td>"""),_display_(/*39.18*/m/*39.19*/.getCreationDate()),format.raw/*39.37*/("""</td>
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
                  DATE: Wed Jun 07 01:29:41 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/listeMessages.scala.html
                  HASH: 224eb58fc3c1349805f2dcf28eae0e643fb86b54
                  MATRIX: 768->1|909->26|937->51|966->55|980->62|1010->84|1049->86|1076->87|1510->494|1544->512|1584->514|1620->523|1669->545|1679->546|1708->554|1758->577|1768->578|1802->591|1852->614|1862->615|1906->638|1973->678|2007->703|2047->705|2092->723|2102->724|2145->746|2182->765|2195->770|2234->771|2279->788|2331->809|2372->822|2422->845|2432->846|2471->864|2538->904|2574->931|2614->933|2659->950|2710->974|2720->975|2766->1000|2796->1003|2806->1004|2852->1029|2905->1051|2946->1064|3005->1096|3020->1102|3077->1138|3152->1182|3188->1191
                  LINES: 27->1|32->1|34->4|37->7|37->7|37->7|37->7|38->8|57->27|57->27|57->27|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|67->37|68->38|69->39|69->39|69->39|71->41|71->41|71->41|72->42|72->42|72->42|72->42|72->42|72->42|72->42|73->43|74->44|75->45|75->45|75->45|77->47|78->48
                  -- GENERATED --
              */
          