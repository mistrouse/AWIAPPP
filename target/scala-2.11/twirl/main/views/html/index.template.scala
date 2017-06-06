
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
"""),format.raw/*9.1*/("""<h1>Home</h1>


<h2>Nouveau message</h2>

<form method="post" action=""""),_display_(/*14.30*/routes/*14.36*/.HomeController.doMessageCreate()),format.raw/*14.69*/("""" enctype="multipart/form-data">
  <div class="form-group">
    <label for="exampleTextarea">Contenu</label>
    <textarea name="content" class="form-control" id="exampleTextarea" rows="3"></textarea>
  </div>
  <div class="form-group">
    <label for="exampleSelect1">Envoyer à</label>
    <select class="form-control" name="groupe" id="exampleSelect1">
      <option value="broadcast">Tous</option>
      """),_display_(/*23.8*/for(g <- groupes) yield /*23.25*/ {_display_(Seq[Any](format.raw/*23.27*/("""
        """),format.raw/*24.9*/("""<option value=""""),_display_(/*24.25*/g/*24.26*/.getId()),format.raw/*24.34*/("""">"""),_display_(/*24.37*/g/*24.38*/.getName()),format.raw/*24.48*/("""</option>
      """)))}),format.raw/*25.8*/("""
    """),format.raw/*26.5*/("""</select>
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
      <th>Envoyé à</th>
      <th>Document</th>
    </tr>
    </thead>
    <tbody>
    """),_display_(/*53.6*/for(m <- messages) yield /*53.24*/ {_display_(Seq[Any](format.raw/*53.26*/("""
      """),format.raw/*54.7*/("""<tr>
        <td>"""),_display_(/*55.14*/m/*55.15*/.getId()),format.raw/*55.23*/("""</td>
        <td>"""),_display_(/*56.14*/m/*56.15*/.getContent()),format.raw/*56.28*/("""</td>
        <td>"""),_display_(/*57.14*/m/*57.15*/.getAutheur().getName()),format.raw/*57.38*/("""</td>
        <td>
          """),_display_(/*59.12*/if(m.getGroupe() != null)/*59.37*/ {_display_(Seq[Any](format.raw/*59.39*/("""
            """),_display_(/*60.14*/m/*60.15*/.getGroupe().getName()),format.raw/*60.37*/("""
          """)))}/*61.13*/else/*61.18*/{_display_(Seq[Any](format.raw/*61.19*/("""
            """),format.raw/*62.13*/("""all
          """)))}),format.raw/*63.12*/("""
        """),format.raw/*64.9*/("""</td>
        <td>"""),_display_(/*65.14*/m/*65.15*/.getCreationDate()),format.raw/*65.33*/("""</td>
        <td>
          """),_display_(/*67.12*/if(m.getDocument() != null)/*67.39*/ {_display_(Seq[Any](format.raw/*67.41*/("""
            """),format.raw/*68.13*/("""<a href=""""),_display_(/*68.23*/route/*68.28*/.DocumentController.getFile(m.getDocument().getId())),format.raw/*68.80*/("""">"""),_display_(/*68.83*/m/*68.84*/.getDocument().getTitle()),format.raw/*68.109*/("""</a>
          """)))}),format.raw/*69.12*/("""
        """),format.raw/*70.9*/("""</td>
      </tr>
    """)))}),format.raw/*72.6*/("""
    """),format.raw/*73.5*/("""</tbody>
  </table>
</div>
""")))}),format.raw/*76.2*/("""
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
                  DATE: Wed Jun 07 01:06:47 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/index.scala.html
                  HASH: 945e0dfc928c44d5f22d1070d7fdfb7128fb07f0
                  MATRIX: 765->1|950->49|978->96|1007->100|1021->107|1051->129|1090->131|1117->132|1215->203|1230->209|1284->242|1718->650|1751->667|1791->669|1827->678|1870->694|1880->695|1909->703|1939->706|1949->707|1980->717|2027->734|2059->739|2669->1323|2703->1341|2743->1343|2777->1350|2822->1368|2832->1369|2861->1377|2907->1396|2917->1397|2951->1410|2997->1429|3007->1430|3051->1453|3108->1483|3142->1508|3182->1510|3223->1524|3233->1525|3276->1547|3307->1560|3320->1565|3359->1566|3400->1579|3446->1594|3482->1603|3528->1622|3538->1623|3577->1641|3634->1671|3670->1698|3710->1700|3751->1713|3788->1723|3802->1728|3875->1780|3905->1783|3915->1784|3962->1809|4009->1825|4045->1834|4098->1857|4130->1862|4188->1890
                  LINES: 27->1|33->1|35->5|38->8|38->8|38->8|38->8|39->9|44->14|44->14|44->14|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|56->26|83->53|83->53|83->53|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|89->59|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|92->62|93->63|94->64|95->65|95->65|95->65|97->67|97->67|97->67|98->68|98->68|98->68|98->68|98->68|98->68|98->68|99->69|100->70|102->72|103->73|106->76
                  -- GENERATED --
              */
          