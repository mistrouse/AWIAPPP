
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createUser_Scope0 {
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

class createUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Groupe],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(groups: List[Groupe]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.Groupe

Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/layouts/*7.9*/.main("Messagerie IG")/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""

"""),format.raw/*9.1*/("""<h2>Créer un utilisateur</h2>
<form action=""""),_display_(/*10.16*/routes/*10.22*/.UserController.doCreate()),format.raw/*10.48*/("""" method="post">
    <div class="form-group row">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
        <div class="col-sm-10">
            <input type="email" name="email" class="form-control" id="inputEmail3" placeholder="Email">
        </div>
    </div>
    <div class="form-group row">
        <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
            <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="Password">
        </div>
    </div>
    <fieldset class="form-group">
        <legend class="col-form-legend col-sm-2">Groupes : </legend>
        """),_display_(/*25.10*/for(g <- groups) yield /*25.26*/ {_display_(Seq[Any](format.raw/*25.28*/("""
            """),format.raw/*26.13*/("""<div class="form-check form-check-inline">
                <label class="form-check-label">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" name="groups[]" value=""""),_display_(/*28.114*/g/*28.115*/.getId()),format.raw/*28.123*/(""""> """),_display_(/*28.127*/g/*28.128*/.getName()),format.raw/*28.138*/("""
                """),format.raw/*29.17*/("""</label>
            </div>
        """)))}),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</fieldset>
    <button type="submit" class="btn btn-default">Submit</button>

</form>

</ul>

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
object createUser extends createUser_Scope0.createUser
              /*
                  -- GENERATED --
                  DATE: Wed Jun 07 19:54:31 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/createUser.scala.html
                  HASH: e3f066f671172f1d4f81e6fc8ad7089ddbfbc1af
                  MATRIX: 761->1|898->23|926->47|955->51|969->58|999->80|1038->82|1066->84|1138->129|1153->135|1200->161|1922->856|1954->872|1994->874|2035->887|2268->1092|2279->1093|2309->1101|2341->1105|2352->1106|2384->1116|2429->1133|2497->1170|2529->1175
                  LINES: 27->1|32->1|34->4|37->7|37->7|37->7|37->7|39->9|40->10|40->10|40->10|55->25|55->25|55->25|56->26|58->28|58->28|58->28|58->28|58->28|58->28|59->29|61->31|62->32
                  -- GENERATED --
              */
          