
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listeDesGroupes_Scope0 {
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

class listeDesGroupes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Groupe],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(groups: List[Groupe]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.Groupe

Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/layouts/*7.9*/.main("Messagerie IG")/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
"""),format.raw/*8.1*/("""<h1>Gérer les groupes</h1>

<a href=""""),_display_(/*10.11*/routes/*10.17*/.GroupeController.createGroup()),format.raw/*10.48*/("""">Ajouter un groupe</a>

<h2>Liste des groupes</h2>

<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        """),_display_(/*27.10*/for(g <- groups) yield /*27.26*/ {_display_(Seq[Any](format.raw/*27.28*/("""
        """),format.raw/*28.9*/("""<tr>
            <td>"""),_display_(/*29.18*/g/*29.19*/.getId()),format.raw/*29.27*/("""</td>
            <td>"""),_display_(/*30.18*/g/*30.19*/.getName()),format.raw/*30.29*/("""</td>
            <td><a href=""""),_display_(/*31.27*/routes/*31.33*/.GroupeController.voirGroupe(g.getId())),format.raw/*31.72*/("""">Voir</a></td>
            <td><a href="#">Editer</a></td>
            <td><a href="#">Supprimer</a></td>
        </tr>
        """)))}),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""</tbody>
    </table>
</div>
""")))}))
      }
    }
  }

  def render(groups:List[Groupe]): play.twirl.api.HtmlFormat.Appendable = apply(groups)

  def f:((List[Groupe]) => play.twirl.api.HtmlFormat.Appendable) = (groups) => apply(groups)

  def ref: this.type = this

}


}

/**/
object listeDesGroupes extends listeDesGroupes_Scope0.listeDesGroupes
              /*
                  -- GENERATED --
                  DATE: Wed Jun 07 01:06:47 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/listeDesGroupes.scala.html
                  HASH: 5d53e00fb84a57128eafb521ffed8e7caee72d5b
                  MATRIX: 771->1|908->23|936->47|965->51|979->58|1009->80|1048->82|1075->83|1140->121|1155->127|1207->158|1560->484|1592->500|1632->502|1668->511|1717->533|1727->534|1756->542|1806->565|1816->566|1847->576|1906->608|1921->614|1981->653|2142->783|2178->792
                  LINES: 27->1|32->1|34->4|37->7|37->7|37->7|37->7|38->8|40->10|40->10|40->10|57->27|57->27|57->27|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|65->35|66->36
                  -- GENERATED --
              */
          