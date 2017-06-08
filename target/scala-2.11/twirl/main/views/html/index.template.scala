
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

<p>
  <a href=""""),_display_(/*12.13*/routes/*12.19*/.HomeController.logout()),format.raw/*12.43*/("""">Se déconnecter</a>
</p>

<p>Ici, vous pouvez communiquer avec les professeurs et étudiants de Polytech à travers les groupes auxquels vous appartenez.</p>

<h2>Nouveau message</h2>

<form method="post" action=""""),_display_(/*19.30*/routes/*19.36*/.HomeController.doMessageCreate()),format.raw/*19.69*/("""" enctype="multipart/form-data">
  <div class="form-group">
    <label for="exampleTextarea">Contenu</label>
    <textarea name="content" class="form-control" id="exampleTextarea" rows="3"></textarea>
  </div>
  <div class="form-group">
    <label for="exampleSelect1">Envoyé le</label>
    <select class="form-control" name="groupe" id="exampleSelect1">
      <option value="broadcast">Tous</option>
      """),_display_(/*28.8*/for(g <- groupes) yield /*28.25*/ {_display_(Seq[Any](format.raw/*28.27*/("""
        """),format.raw/*29.9*/("""<option value=""""),_display_(/*29.25*/g/*29.26*/.getId()),format.raw/*29.34*/("""">"""),_display_(/*29.37*/g/*29.38*/.getName()),format.raw/*29.48*/("""</option>
      """)))}),format.raw/*30.8*/("""
    """),format.raw/*31.5*/("""</select>
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
    """),_display_(/*58.6*/for(m <- messages) yield /*58.24*/ {_display_(Seq[Any](format.raw/*58.26*/("""
      """),format.raw/*59.7*/("""<tr>
        <td>"""),_display_(/*60.14*/m/*60.15*/.getId()),format.raw/*60.23*/("""</td>
        <td>"""),_display_(/*61.14*/m/*61.15*/.getContent()),format.raw/*61.28*/("""</td>
        <td>"""),_display_(/*62.14*/m/*62.15*/.getAutheur().getName()),format.raw/*62.38*/("""</td>
        <td>
          """),_display_(/*64.12*/if(m.getGroupe() != null)/*64.37*/ {_display_(Seq[Any](format.raw/*64.39*/("""
            """),_display_(/*65.14*/m/*65.15*/.getGroupe().getName()),format.raw/*65.37*/("""
          """)))}/*66.13*/else/*66.18*/{_display_(Seq[Any](format.raw/*66.19*/("""
            """),format.raw/*67.13*/("""all
          """)))}),format.raw/*68.12*/("""
        """),format.raw/*69.9*/("""</td>
        <td>"""),_display_(/*70.14*/m/*70.15*/.getCreationDate()),format.raw/*70.33*/("""</td>
        <td>
          """),_display_(/*72.12*/if(m.getDocument() != null)/*72.39*/ {_display_(Seq[Any](format.raw/*72.41*/("""
            """),format.raw/*73.13*/("""<a href=""""),_display_(/*73.23*/routes/*73.29*/.DocumentController.getFile(m.getDocument().getId())),format.raw/*73.81*/("""">"""),_display_(/*73.84*/m/*73.85*/.getDocument().getTitle()),format.raw/*73.110*/("""</a>
          """)))}),format.raw/*74.12*/("""
        """),format.raw/*75.9*/("""</td>
      </tr>
    """)))}),format.raw/*77.6*/("""
    """),format.raw/*78.5*/("""</tbody>
  </table>
</div>
""")))}),format.raw/*81.2*/("""
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
                  DATE: Thu Jun 08 16:40:18 CEST 2017
                  SOURCE: /Users/mehdi/bachir/AWIAPPP/app/views/index.scala.html
                  HASH: 1bc36e64684cedc57a603bd6fa7df13280655f42
                  MATRIX: 765->1|950->49|978->96|1007->100|1021->107|1051->129|1090->131|1117->132|1230->218|1245->224|1290->248|1530->461|1545->467|1599->500|2033->908|2066->925|2106->927|2142->936|2185->952|2195->953|2224->961|2254->964|2264->965|2295->975|2342->992|2374->997|2985->1582|3019->1600|3059->1602|3093->1609|3138->1627|3148->1628|3177->1636|3223->1655|3233->1656|3267->1669|3313->1688|3323->1689|3367->1712|3424->1742|3458->1767|3498->1769|3539->1783|3549->1784|3592->1806|3623->1819|3636->1824|3675->1825|3716->1838|3762->1853|3798->1862|3844->1881|3854->1882|3893->1900|3950->1930|3986->1957|4026->1959|4067->1972|4104->1982|4119->1988|4192->2040|4222->2043|4232->2044|4279->2069|4326->2085|4362->2094|4415->2117|4447->2122|4505->2150
                  LINES: 27->1|33->1|35->5|38->8|38->8|38->8|38->8|39->9|42->12|42->12|42->12|49->19|49->19|49->19|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|59->29|59->29|60->30|61->31|88->58|88->58|88->58|89->59|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|98->68|99->69|100->70|100->70|100->70|102->72|102->72|102->72|103->73|103->73|103->73|103->73|103->73|103->73|103->73|104->74|105->75|107->77|108->78|111->81
                  -- GENERATED --
              */
          