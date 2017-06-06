
package views.html.layouts

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="icon" href="../../favicon.ico">

    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>

    <!-- Bootstrap core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    <link href=""""),_display_(/*18.18*/routes/*18.24*/.Assets.versioned("stylesheets/dashboard.css")),format.raw/*18.70*/("""" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-expand-md navbar-inverse fixed-top bg-inverse">
    <a class="navbar-brand" href="#">Outil de messagerie Polytech Montpellier</a>
</nav>

<div class="container-fluid">
    <div class="row">
        <nav class="col-sm-3 col-md-2 d-none d-sm-block bg-faded sidebar">
            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link active" href=""""),_display_(/*31.55*/routes/*31.61*/.HomeController.index()),format.raw/*31.84*/("""">Home </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*34.48*/routes/*34.54*/.GroupeController.myGroups()),format.raw/*34.82*/("""">Mes groupes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*37.48*/routes/*37.54*/.DocumentController.index()),format.raw/*37.81*/("""">Documents</a>
                </li>
            </ul>

            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*43.48*/routes/*43.54*/.MessageController.index()),format.raw/*43.80*/("""">Gérer les messages</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*46.48*/routes/*46.54*/.GroupeController.index()),format.raw/*46.79*/("""">Gérer les groupes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*49.48*/routes/*49.54*/.UserController.list()),format.raw/*49.76*/("""">Gérer les utilisateurs</a>
                </li>
            </ul>
        </nav>

        <main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3" role="main">
            """),_display_(/*55.14*/content),format.raw/*55.21*/("""
        """),format.raw/*56.9*/("""</main>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.9.9/umd/popper.min.js" integrity="sha256-c477vRLKQv1jt9o7w6TTBzFyFznTaZjoMLTDFi7Hlxc=" crossorigin="anonymous"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Jun 07 01:29:41 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/layouts/main.scala.html
                  HASH: d210d31de6088ecfc8842124bcd49915438226d6
                  MATRIX: 756->1|881->31|909->33|1232->329|1258->334|1610->659|1625->665|1692->711|2189->1181|2204->1187|2248->1210|2394->1329|2409->1335|2458->1363|2610->1488|2625->1494|2673->1521|2893->1714|2908->1720|2955->1746|3114->1878|3129->1884|3175->1909|3333->2040|3348->2046|3391->2068|3599->2249|3627->2256|3663->2265
                  LINES: 27->1|32->1|34->3|44->13|44->13|49->18|49->18|49->18|62->31|62->31|62->31|65->34|65->34|65->34|68->37|68->37|68->37|74->43|74->43|74->43|77->46|77->46|77->46|80->49|80->49|80->49|86->55|86->55|87->56
                  -- GENERATED --
              */
          