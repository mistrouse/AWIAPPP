
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/bachir/AWIAPPP/conf/routes
// @DATE:Thu Jun 08 16:40:17 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseDocumentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listeFichiers"})
        }
      """
    )
  
    // @LINE:19
    def getFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getFile",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fichier/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
        }
      """
    )
  
    // @LINE:26
    def messages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.messages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/messages"})
        }
      """
    )
  
    // @LINE:25
    def groups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.groups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/groups"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def doCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doCreate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "listeUtilisateurs"})
        }
      """
    )
  
    // @LINE:15
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listeUtilisateurs"})
        }
      """
    )
  
    // @LINE:16
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "creerUtilisateur"})
        }
      """
    )
  
    // @LINE:22
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "supprimerUtilisateur/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def handleLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.handleLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:9
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:10
    def initialize: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.initialize",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "initialize"})
        }
      """
    )
  
    // @LINE:6
    def doMessageCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.doMessageCreate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseMessageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "supprimerMessage/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:18
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listeMessages"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseGroupeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupeController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "supprimerGroupe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:12
    def voirGroupe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupeController.voirGroupe",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voirGroupe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:14
    def createGroup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupeController.createGroup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "creerGroupe"})
        }
      """
    )
  
    // @LINE:13
    def myGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupeController.myGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mesGroupes"})
        }
      """
    )
  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listeDesGroupes"})
        }
      """
    )
  
  }


}
