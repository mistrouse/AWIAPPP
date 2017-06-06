
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userList_Scope0 {
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

class userList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.User

Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/layouts/*7.9*/.main("Messagerie IG")/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
"""),format.raw/*8.1*/("""<h1>Gérer les utilisateurs</h1>
<a href=""""),_display_(/*9.11*/routes/*9.17*/.UserController.create()),format.raw/*9.41*/("""">Ajouter un utilisateur</a>
<h2>Liste des utilisateurs</h2>

<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>email</th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        """),_display_(/*24.10*/for(u <- users) yield /*24.25*/ {_display_(Seq[Any](format.raw/*24.27*/("""
            """),format.raw/*25.13*/("""<tr>
                <td>"""),_display_(/*26.22*/u/*26.23*/.getId()),format.raw/*26.31*/("""</td>
                <td>"""),_display_(/*27.22*/u/*27.23*/.getName()),format.raw/*27.33*/("""</td>
                <td>"""),_display_(/*28.22*/u/*28.23*/.getEmail()),format.raw/*28.34*/("""</td>
                <td><a href="#">Editer</a></td>
                <td><a href="#">Supprimer</a></td>
            </tr>
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""</tbody>
    </table>
</div>

""")))}))
      }
    }
  }

  def render(users:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/**/
object userList extends userList_Scope0.userList
              /*
                  -- GENERATED --
                  DATE: Wed Jun 07 01:06:47 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/userList.scala.html
                  HASH: 854c1f38324cc014cc49963f17dad95fec5fafbb
                  MATRIX: 755->1|887->20|915->42|944->46|958->53|988->75|1027->77|1054->78|1122->120|1136->126|1180->150|1525->468|1556->483|1596->485|1637->498|1690->524|1700->525|1729->533|1783->560|1793->561|1824->571|1878->598|1888->599|1920->610|2083->742|2119->751
                  LINES: 27->1|32->1|34->4|37->7|37->7|37->7|37->7|38->8|39->9|39->9|39->9|54->24|54->24|54->24|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|62->32|63->33
                  -- GENERATED --
              */
          