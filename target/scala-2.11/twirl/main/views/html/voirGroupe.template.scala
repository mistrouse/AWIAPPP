
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object voirGroupe_Scope0 {
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

class voirGroupe extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Groupe,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(group: Groupe):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.Groupe
def /*5.2*/messagesGroupe/*5.16*/ = {{group.getMessages()}};
Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.41*/(""";


"""),_display_(/*8.2*/layouts/*8.9*/.main("Groupe")/*8.24*/ {_display_(Seq[Any](format.raw/*8.26*/("""
"""),format.raw/*9.1*/("""<h2>Groupe """),_display_(/*9.13*/group/*9.18*/.getName()),format.raw/*9.28*/("""</h2>
    """),_display_(/*10.6*/if(messagesGroupe != null)/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
        """),format.raw/*11.9*/("""<div class="table-responsive">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Contenu</th>
                    <th>Autheur</th>
                    <th>Groupe</th>
                    <th>Envoyé à</th>
                    <th>Document</th>
                </tr>
                </thead>
                <tbody>
                """),_display_(/*24.18*/for(m <- messagesGroupe) yield /*24.42*/ {_display_(Seq[Any](format.raw/*24.44*/("""
                """),format.raw/*25.17*/("""<tr>
                    <td>"""),_display_(/*26.26*/m/*26.27*/.getId()),format.raw/*26.35*/("""</td>
                    <td>"""),_display_(/*27.26*/m/*27.27*/.getContent()),format.raw/*27.40*/("""</td>
                    <td>"""),_display_(/*28.26*/m/*28.27*/.getAutheur().getName()),format.raw/*28.50*/("""</td>
                    <td>
                        """),_display_(/*30.26*/if(m.getGroupe() != null)/*30.51*/ {_display_(Seq[Any](format.raw/*30.53*/("""
                        """),_display_(/*31.26*/m/*31.27*/.getGroupe().getName()),format.raw/*31.49*/("""
                        """)))}/*32.27*/else/*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
                        """),format.raw/*33.25*/("""all
                        """)))}),format.raw/*34.26*/("""
                    """),format.raw/*35.21*/("""</td>
                    <td>"""),_display_(/*36.26*/m/*36.27*/.getCreationDate()),format.raw/*36.45*/("""</td>
                    <td>
                        """),_display_(/*38.26*/if(m.getDocument() != null)/*38.53*/ {_display_(Seq[Any](format.raw/*38.55*/("""
                        """),format.raw/*39.25*/("""<a href="assets/upload/"""),_display_(/*39.49*/m/*39.50*/.getDocument().getTitle()),format.raw/*39.75*/("""">"""),_display_(/*39.78*/m/*39.79*/.getDocument().getTitle()),format.raw/*39.104*/("""</a>
                        """)))}),format.raw/*40.26*/("""
                    """),format.raw/*41.21*/("""</td>
                </tr>
                """)))}),format.raw/*43.18*/("""
                """),format.raw/*44.17*/("""</tbody>
            </table>
        </div>
    """)))}),format.raw/*47.6*/("""

""")))}))
      }
    }
  }

  def render(group:Groupe): play.twirl.api.HtmlFormat.Appendable = apply(group)

  def f:((Groupe) => play.twirl.api.HtmlFormat.Appendable) = (group) => apply(group)

  def ref: this.type = this

}


}

/**/
object voirGroupe extends voirGroupe_Scope0.voirGroupe
              /*
                  -- GENERATED --
                  DATE: Thu Jun 08 16:28:26 CEST 2017
                  SOURCE: /Users/mehdi/bachir/AWIAPPP/app/views/voirGroupe.scala.html
                  HASH: 9b3c7119b6760edf14cdb2257ec91355166ef44e
                  MATRIX: 755->1|868->42|890->56|945->16|973->40|1001->81|1031->86|1045->93|1068->108|1107->110|1134->111|1172->123|1185->128|1215->138|1252->149|1287->175|1327->177|1363->186|1819->615|1859->639|1899->641|1944->658|2001->688|2011->689|2040->697|2098->728|2108->729|2142->742|2200->773|2210->774|2254->797|2337->853|2371->878|2411->880|2464->906|2474->907|2517->929|2562->956|2575->961|2614->962|2667->987|2727->1016|2776->1037|2834->1068|2844->1069|2883->1087|2966->1143|3002->1170|3042->1172|3095->1197|3146->1221|3156->1222|3202->1247|3232->1250|3242->1251|3289->1276|3350->1306|3399->1327|3475->1372|3520->1389|3600->1439
                  LINES: 27->1|31->5|31->5|32->1|34->4|35->5|38->8|38->8|38->8|38->8|39->9|39->9|39->9|39->9|40->10|40->10|40->10|41->11|54->24|54->24|54->24|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|64->34|65->35|66->36|66->36|66->36|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|69->39|70->40|71->41|73->43|74->44|77->47
                  -- GENERATED --
              */
          