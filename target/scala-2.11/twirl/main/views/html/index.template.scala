
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Message],List[Groupe],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: List[Message], groupes: List[Groupe]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.Message
import models.Groupe

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""


"""),_display_(/*8.2*/layouts/*8.9*/.main("Messagerie IG")/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""
"""),format.raw/*9.1*/("""<h1>Bienvenue sur l'outil de messagerie de Polytech Montpellier</h1>

<p>Ici, vous pouvez communiquer avec les professeurs et étudiants de Polytech à travers les groupes auxquels vous appartenez.</p>

<h2>Nouveau message</h2>

<form method="post" action=""""),_display_(/*15.30*/routes/*15.36*/.HomeController.doMessageCreate()),format.raw/*15.69*/("""" enctype="multipart/form-data">
  <div class="form-group">
    <label for="exampleTextarea">Contenu</label>
    <textarea name="content" class="form-control" id="exampleTextarea" rows="3"></textarea>
  </div>
  <div class="form-group">
    <label for="exampleSelect1">Envoyé le</label>
    <select class="form-control" name="groupe" id="exampleSelect1">
      <option value="broadcast">Tous</option>
      """),_display_(/*24.8*/for(g <- groupes) yield /*24.25*/ {_display_(Seq[Any](format.raw/*24.27*/("""
        """),format.raw/*25.9*/("""<option value=""""),_display_(/*25.25*/g/*25.26*/.getId()),format.raw/*25.34*/("""">"""),_display_(/*25.37*/g/*25.38*/.getName()),format.raw/*25.48*/("""</option>
      """)))}),format.raw/*26.8*/("""
    """),format.raw/*27.5*/("""</select>
  </div>
  <div class="form-group">
    <label for="exampleInputFile">Document</label>
    <input name="document" type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

<h2>Les messages</h2>



<div class="table-responsive">
  <table class="table table-striped">
    <thead>
    <tr>
      <th>#</th>
      <th>Contenu</th>
      <th>Autheur</th>
      <th>Groupe</th>
      <th>Envoyé le</th>
      <th>Document</th>
    </tr>
    </thead>
    <tbody>
    """),_display_(/*54.6*/for(m <- messages) yield /*54.24*/ {_display_(Seq[Any](format.raw/*54.26*/("""
      """),format.raw/*55.7*/("""<tr>
        <td>"""),_display_(/*56.14*/m/*56.15*/.getId()),format.raw/*56.23*/("""</td>
        <td>"""),_display_(/*57.14*/m/*57.15*/.getContent()),format.raw/*57.28*/("""</td>
        <td>"""),_display_(/*58.14*/m/*58.15*/.getAutheur().getName()),format.raw/*58.38*/("""</td>
        <td>
          """),_display_(/*60.12*/if(m.getGroupe() != null)/*60.37*/ {_display_(Seq[Any](format.raw/*60.39*/("""
            """),_display_(/*61.14*/m/*61.15*/.getGroupe().getName()),format.raw/*61.37*/("""
          """)))}/*62.13*/else/*62.18*/{_display_(Seq[Any](format.raw/*62.19*/("""
            """),format.raw/*63.13*/("""all
          """)))}),format.raw/*64.12*/("""
        """),format.raw/*65.9*/("""</td>
        <td>"""),_display_(/*66.14*/m/*66.15*/.getCreationDate()),format.raw/*66.33*/("""</td>
        <td>
          """),_display_(/*68.12*/if(m.getDocument() != null)/*68.39*/ {_display_(Seq[Any](format.raw/*68.41*/("""
            """),format.raw/*69.13*/("""<a href=""""),_display_(/*69.23*/routes/*69.29*/.DocumentController.getFile(m.getDocument().getId())),format.raw/*69.81*/("""">"""),_display_(/*69.84*/m/*69.85*/.getDocument().getTitle()),format.raw/*69.110*/("""</a>
          """)))}),format.raw/*70.12*/("""
        """),format.raw/*71.9*/("""</td>
      </tr>
    """)))}),format.raw/*73.6*/("""
    """),format.raw/*74.5*/("""</tbody>
  </table>
</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(messages:List[Message],groupes:List[Groupe]): play.twirl.api.HtmlFormat.Appendable = apply(messages,groupes)

  def f:((List[Message],List[Groupe]) => play.twirl.api.HtmlFormat.Appendable) = (messages,groupes) => apply(messages,groupes)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Jun 07 19:18:00 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/index.scala.html
                  HASH: 388f1ef351d56f2010b87347ff6b672befae4820
                  MATRIX: 765->1|950->49|978->96|1007->100|1021->107|1051->129|1090->131|1117->132|1400->388|1415->394|1469->427|1903->835|1936->852|1976->854|2012->863|2055->879|2065->880|2094->888|2124->891|2134->892|2165->902|2212->919|2244->924|2855->1509|2889->1527|2929->1529|2963->1536|3008->1554|3018->1555|3047->1563|3093->1582|3103->1583|3137->1596|3183->1615|3193->1616|3237->1639|3294->1669|3328->1694|3368->1696|3409->1710|3419->1711|3462->1733|3493->1746|3506->1751|3545->1752|3586->1765|3632->1780|3668->1789|3714->1808|3724->1809|3763->1827|3820->1857|3856->1884|3896->1886|3937->1899|3974->1909|3989->1915|4062->1967|4092->1970|4102->1971|4149->1996|4196->2012|4232->2021|4285->2044|4317->2049|4375->2077
                  LINES: 27->1|33->1|35->5|38->8|38->8|38->8|38->8|39->9|45->15|45->15|45->15|54->24|54->24|54->24|55->25|55->25|55->25|55->25|55->25|55->25|55->25|56->26|57->27|84->54|84->54|84->54|85->55|86->56|86->56|86->56|87->57|87->57|87->57|88->58|88->58|88->58|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|94->64|95->65|96->66|96->66|96->66|98->68|98->68|98->68|99->69|99->69|99->69|99->69|99->69|99->69|99->69|100->70|101->71|103->73|104->74|107->77
                  -- GENERATED --
              */
          