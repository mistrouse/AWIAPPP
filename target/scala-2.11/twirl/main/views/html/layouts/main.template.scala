
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
    <a class="navbar-brand" href="#">Dashboard</a>
    <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Groups</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Profile</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Help</a>
            </li>
        </ul>
        <form class="form-inline mt-2 mt-md-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <nav class="col-sm-3 col-md-2 d-none d-sm-block bg-faded sidebar">
            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link active" href=""""),_display_(/*55.55*/routes/*55.61*/.HomeController.index()),format.raw/*55.84*/("""">Home </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*58.48*/routes/*58.54*/.GroupeController.myGroups()),format.raw/*58.82*/("""">Mes groupes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Documents</a>
                </li>
            </ul>

            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*67.48*/routes/*67.54*/.MessageController.index()),format.raw/*67.80*/("""">Gérer les messages</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*70.48*/routes/*70.54*/.GroupeController.index()),format.raw/*70.79*/("""">Gérer les groupes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*73.48*/routes/*73.54*/.UserController.list()),format.raw/*73.76*/("""">Gérer les utilisateurs</a>
                </li>
            </ul>
        </nav>

        <main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3" role="main">
            """),_display_(/*79.14*/content),format.raw/*79.21*/("""
        """),format.raw/*80.9*/("""</main>
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
                  DATE: Wed Jun 07 01:06:48 CEST 2017
                  SOURCE: /Users/florianeMac/Documents/GitHub/AWIAPPP/app/views/layouts/main.scala.html
                  HASH: 6ef3f2552324473811f99f7008270a666d50644b
                  MATRIX: 756->1|881->31|909->33|1232->329|1258->334|1610->659|1625->665|1692->711|3305->2297|3320->2303|3364->2326|3510->2445|3525->2451|3574->2479|3919->2797|3934->2803|3981->2829|4140->2961|4155->2967|4201->2992|4359->3123|4374->3129|4417->3151|4625->3332|4653->3339|4689->3348
                  LINES: 27->1|32->1|34->3|44->13|44->13|49->18|49->18|49->18|86->55|86->55|86->55|89->58|89->58|89->58|98->67|98->67|98->67|101->70|101->70|101->70|104->73|104->73|104->73|110->79|110->79|111->80
                  -- GENERATED --
              */
          