
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object creerGroupe_Scope0 {
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

class creerGroupe extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.main("Messagerie IG")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

"""),format.raw/*5.1*/("""<h2>Créer un groupe</h2>
<form action=""""),_display_(/*6.16*/routes/*6.22*/.UserController.doCreate()),format.raw/*6.48*/("""" method="post">
    <div class="form-group row">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Nom</label>
        <div class="col-sm-10">
            <input type="text" name="name" class="form-control" id="inputEmail3" placeholder="Email">
        </div>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>

</form>

</ul>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object creerGroupe extends creerGroupe_Scope0.creerGroupe
              /*
                  -- GENERATED --
                  DATE: Thu Jun 08 16:28:26 CEST 2017
                  SOURCE: /Users/mehdi/bachir/AWIAPPP/app/views/creerGroupe.scala.html
                  HASH: 430dff6c660d2af026e627943e7d6cc7a8dfcad1
                  MATRIX: 750->1|846->3|874->6|888->13|918->35|957->37|985->39|1051->79|1065->85|1111->111
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|37->6|37->6|37->6
                  -- GENERATED --
              */
          