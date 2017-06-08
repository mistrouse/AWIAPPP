
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myGroups_Scope0 {
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

class myGroups extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Groupe],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(groups: List[Groupe]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.Groupe

Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/layouts/*7.9*/.main("Messagerie IG")/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
"""),format.raw/*8.1*/("""<h2>Mes groupes</h2>
<ul>
    """),_display_(/*10.6*/for(g <- groups) yield /*10.22*/ {_display_(Seq[Any](format.raw/*10.24*/("""
    """),format.raw/*11.5*/("""<li><a href=""""),_display_(/*11.19*/routes/*11.25*/.GroupeController.voirGroupe(g.getId())),format.raw/*11.64*/("""">"""),_display_(/*11.67*/g/*11.68*/.getName()),format.raw/*11.78*/("""</li>
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</ul>
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
object myGroups extends myGroups_Scope0.myGroups
              /*
                  -- GENERATED --
                  DATE: Thu Jun 08 16:28:26 CEST 2017
                  SOURCE: /Users/mehdi/bachir/AWIAPPP/app/views/myGroups.scala.html
                  HASH: 4842d5e356329496dfe662a4b3ce6cbb5b928c16
                  MATRIX: 757->1|894->23|922->47|951->51|965->58|995->80|1034->82|1061->83|1118->114|1150->130|1190->132|1222->137|1263->151|1278->157|1338->196|1368->199|1378->200|1409->210|1450->221|1478->222
                  LINES: 27->1|32->1|34->4|37->7|37->7|37->7|37->7|38->8|40->10|40->10|40->10|41->11|41->11|41->11|41->11|41->11|41->11|41->11|42->12|43->13
                  -- GENERATED --
              */
          