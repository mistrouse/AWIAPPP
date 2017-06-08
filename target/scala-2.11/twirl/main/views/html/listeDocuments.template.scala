
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listeDocuments_Scope0 {
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

class listeDocuments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Document],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(documents: List[Document]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.Document

Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/layouts/*7.9*/.main("Messagerie IG")/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
"""),format.raw/*8.1*/("""<h1>Documents</h1>

<p>Les documents auxquels vous avez accés.</p>

<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        </thead>
        <tbody>

        """),_display_(/*22.10*/for(d <- documents) yield /*22.29*/ {_display_(Seq[Any](format.raw/*22.31*/("""
        """),format.raw/*23.9*/("""<tr>
            <td>"""),_display_(/*24.18*/d/*24.19*/.getId()),format.raw/*24.27*/("""</td>
            <td><a href=""""),_display_(/*25.27*/routes/*25.33*/.DocumentController.getFile(d.getId())),format.raw/*25.71*/("""">"""),_display_(/*25.74*/d/*25.75*/.getTitle()),format.raw/*25.86*/("""</a></td>
        </tr>
        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""</tbody>
    </table>
</div>
""")))}))
      }
    }
  }

  def render(documents:List[Document]): play.twirl.api.HtmlFormat.Appendable = apply(documents)

  def f:((List[Document]) => play.twirl.api.HtmlFormat.Appendable) = (documents) => apply(documents)

  def ref: this.type = this

}


}

/**/
object listeDocuments extends listeDocuments_Scope0.listeDocuments
              /*
                  -- GENERATED --
                  DATE: Thu Jun 08 16:28:26 CEST 2017
                  SOURCE: /Users/mehdi/bachir/AWIAPPP/app/views/listeDocuments.scala.html
                  HASH: 5c98dcfa0000a78b7e1e29b8e162f307818fddbb
                  MATRIX: 771->1|915->28|943->54|972->58|986->65|1016->87|1055->89|1082->90|1384->365|1419->384|1459->386|1495->395|1544->417|1554->418|1583->426|1642->458|1657->464|1716->502|1746->505|1756->506|1788->517|1852->550|1888->559
                  LINES: 27->1|32->1|34->4|37->7|37->7|37->7|37->7|38->8|52->22|52->22|52->22|53->23|54->24|54->24|54->24|55->25|55->25|55->25|55->25|55->25|55->25|57->27|58->28
                  -- GENERATED --
              */
          