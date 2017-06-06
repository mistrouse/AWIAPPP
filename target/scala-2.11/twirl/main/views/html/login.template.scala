
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.main("Login")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<h1>Login</h1>

    <form action=""""),_display_(/*6.20*/routes/*6.26*/.HomeController.handleLogin()),format.raw/*6.55*/("""" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input name="email" type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Jun 07 01:29:41 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/login.scala.html
                  HASH: 94384f0d5d68b3a2e970dff0c2e6e3c43e8e2067
                  MATRIX: 738->1|834->3|862->6|876->13|898->27|937->29|968->34|1029->69|1043->75|1092->104|1682->664
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|37->6|37->6|37->6|48->17
                  -- GENERATED --
              */
          