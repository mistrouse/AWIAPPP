
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/bachir/AWIAPPP/conf/routes
// @DATE:Thu Jun 08 16:40:17 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_2: controllers.HomeController,
  // @LINE:11
  GroupeController_1: controllers.GroupeController,
  // @LINE:15
  UserController_3: controllers.UserController,
  // @LINE:18
  MessageController_0: controllers.MessageController,
  // @LINE:19
  DocumentController_5: controllers.DocumentController,
  // @LINE:24
  ApiController_6: controllers.ApiController,
  // @LINE:29
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_2: controllers.HomeController,
    // @LINE:11
    GroupeController_1: controllers.GroupeController,
    // @LINE:15
    UserController_3: controllers.UserController,
    // @LINE:18
    MessageController_0: controllers.MessageController,
    // @LINE:19
    DocumentController_5: controllers.DocumentController,
    // @LINE:24
    ApiController_6: controllers.ApiController,
    // @LINE:29
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_2, GroupeController_1, UserController_3, MessageController_0, DocumentController_5, ApiController_6, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, GroupeController_1, UserController_3, MessageController_0, DocumentController_5, ApiController_6, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix, """controllers.HomeController.doMessageCreate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.handleLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """initialize""", """controllers.HomeController.initialize"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listeDesGroupes""", """controllers.GroupeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voirGroupe/""" + "$" + """id<[^/]+>""", """controllers.GroupeController.voirGroupe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mesGroupes""", """controllers.GroupeController.myGroups()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """creerGroupe""", """controllers.GroupeController.createGroup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listeUtilisateurs""", """controllers.UserController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """creerUtilisateur""", """controllers.UserController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listeUtilisateurs""", """controllers.UserController.doCreate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listeMessages""", """controllers.MessageController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fichier/""" + "$" + """id<[^/]+>""", """controllers.DocumentController.getFile(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listeFichiers""", """controllers.DocumentController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """supprimerMessage/""" + "$" + """id<[^/]+>""", """controllers.MessageController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """supprimerUtilisateur/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """supprimerGroupe/""" + "$" + """id<[^/]+>""", """controllers.GroupeController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.ApiController.users()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/groups""", """controllers.ApiController.groups()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/messages""", """controllers.ApiController.messages()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_doMessageCreate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_doMessageCreate1_invoker = createInvoker(
    HomeController_2.doMessageCreate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "doMessageCreate",
      Nil,
      "POST",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_2.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_handleLogin3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_handleLogin3_invoker = createInvoker(
    HomeController_2.handleLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "handleLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout4_invoker = createInvoker(
    HomeController_2.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_initialize5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("initialize")))
  )
  private[this] lazy val controllers_HomeController_initialize5_invoker = createInvoker(
    HomeController_2.initialize,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "initialize",
      Nil,
      "GET",
      """""",
      this.prefix + """initialize"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_GroupeController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listeDesGroupes")))
  )
  private[this] lazy val controllers_GroupeController_index6_invoker = createInvoker(
    GroupeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """listeDesGroupes"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_GroupeController_voirGroupe7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voirGroupe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GroupeController_voirGroupe7_invoker = createInvoker(
    GroupeController_1.voirGroupe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupeController",
      "voirGroupe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """voirGroupe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_GroupeController_myGroups8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mesGroupes")))
  )
  private[this] lazy val controllers_GroupeController_myGroups8_invoker = createInvoker(
    GroupeController_1.myGroups(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupeController",
      "myGroups",
      Nil,
      "GET",
      """""",
      this.prefix + """mesGroupes"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_GroupeController_createGroup9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("creerGroupe")))
  )
  private[this] lazy val controllers_GroupeController_createGroup9_invoker = createInvoker(
    GroupeController_1.createGroup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupeController",
      "createGroup",
      Nil,
      "GET",
      """""",
      this.prefix + """creerGroupe"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_list10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listeUtilisateurs")))
  )
  private[this] lazy val controllers_UserController_list10_invoker = createInvoker(
    UserController_3.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """listeUtilisateurs"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_create11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("creerUtilisateur")))
  )
  private[this] lazy val controllers_UserController_create11_invoker = createInvoker(
    UserController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """creerUtilisateur"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_doCreate12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listeUtilisateurs")))
  )
  private[this] lazy val controllers_UserController_doCreate12_invoker = createInvoker(
    UserController_3.doCreate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doCreate",
      Nil,
      "POST",
      """""",
      this.prefix + """listeUtilisateurs"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MessageController_index13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listeMessages")))
  )
  private[this] lazy val controllers_MessageController_index13_invoker = createInvoker(
    MessageController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """listeMessages"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_DocumentController_getFile14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fichier/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocumentController_getFile14_invoker = createInvoker(
    DocumentController_5.getFile(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getFile",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """fichier/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_DocumentController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listeFichiers")))
  )
  private[this] lazy val controllers_DocumentController_index15_invoker = createInvoker(
    DocumentController_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """listeFichiers"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_MessageController_delete16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("supprimerMessage/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MessageController_delete16_invoker = createInvoker(
    MessageController_0.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """supprimerMessage/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UserController_delete17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("supprimerUtilisateur/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete17_invoker = createInvoker(
    UserController_3.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """supprimerUtilisateur/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_GroupeController_delete18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("supprimerGroupe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GroupeController_delete18_invoker = createInvoker(
    GroupeController_1.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupeController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """supprimerGroupe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ApiController_users19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_ApiController_users19_invoker = createInvoker(
    ApiController_6.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "users",
      Nil,
      "GET",
      """""",
      this.prefix + """api/users"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ApiController_groups20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/groups")))
  )
  private[this] lazy val controllers_ApiController_groups20_invoker = createInvoker(
    ApiController_6.groups(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "groups",
      Nil,
      "GET",
      """""",
      this.prefix + """api/groups"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ApiController_messages21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/messages")))
  )
  private[this] lazy val controllers_ApiController_messages21_invoker = createInvoker(
    ApiController_6.messages(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "messages",
      Nil,
      "GET",
      """""",
      this.prefix + """api/messages"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned22_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:6
    case controllers_HomeController_doMessageCreate1_route(params) =>
      call { 
        controllers_HomeController_doMessageCreate1_invoker.call(HomeController_2.doMessageCreate())
      }
  
    // @LINE:7
    case controllers_HomeController_login2_route(params) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_2.login)
      }
  
    // @LINE:8
    case controllers_HomeController_handleLogin3_route(params) =>
      call { 
        controllers_HomeController_handleLogin3_invoker.call(HomeController_2.handleLogin)
      }
  
    // @LINE:9
    case controllers_HomeController_logout4_route(params) =>
      call { 
        controllers_HomeController_logout4_invoker.call(HomeController_2.logout)
      }
  
    // @LINE:10
    case controllers_HomeController_initialize5_route(params) =>
      call { 
        controllers_HomeController_initialize5_invoker.call(HomeController_2.initialize)
      }
  
    // @LINE:11
    case controllers_GroupeController_index6_route(params) =>
      call { 
        controllers_GroupeController_index6_invoker.call(GroupeController_1.index)
      }
  
    // @LINE:12
    case controllers_GroupeController_voirGroupe7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GroupeController_voirGroupe7_invoker.call(GroupeController_1.voirGroupe(id))
      }
  
    // @LINE:13
    case controllers_GroupeController_myGroups8_route(params) =>
      call { 
        controllers_GroupeController_myGroups8_invoker.call(GroupeController_1.myGroups())
      }
  
    // @LINE:14
    case controllers_GroupeController_createGroup9_route(params) =>
      call { 
        controllers_GroupeController_createGroup9_invoker.call(GroupeController_1.createGroup())
      }
  
    // @LINE:15
    case controllers_UserController_list10_route(params) =>
      call { 
        controllers_UserController_list10_invoker.call(UserController_3.list())
      }
  
    // @LINE:16
    case controllers_UserController_create11_route(params) =>
      call { 
        controllers_UserController_create11_invoker.call(UserController_3.create())
      }
  
    // @LINE:17
    case controllers_UserController_doCreate12_route(params) =>
      call { 
        controllers_UserController_doCreate12_invoker.call(UserController_3.doCreate())
      }
  
    // @LINE:18
    case controllers_MessageController_index13_route(params) =>
      call { 
        controllers_MessageController_index13_invoker.call(MessageController_0.index())
      }
  
    // @LINE:19
    case controllers_DocumentController_getFile14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocumentController_getFile14_invoker.call(DocumentController_5.getFile(id))
      }
  
    // @LINE:20
    case controllers_DocumentController_index15_route(params) =>
      call { 
        controllers_DocumentController_index15_invoker.call(DocumentController_5.index())
      }
  
    // @LINE:21
    case controllers_MessageController_delete16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MessageController_delete16_invoker.call(MessageController_0.delete(id))
      }
  
    // @LINE:22
    case controllers_UserController_delete17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_delete17_invoker.call(UserController_3.delete(id))
      }
  
    // @LINE:23
    case controllers_GroupeController_delete18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GroupeController_delete18_invoker.call(GroupeController_1.delete(id))
      }
  
    // @LINE:24
    case controllers_ApiController_users19_route(params) =>
      call { 
        controllers_ApiController_users19_invoker.call(ApiController_6.users())
      }
  
    // @LINE:25
    case controllers_ApiController_groups20_route(params) =>
      call { 
        controllers_ApiController_groups20_invoker.call(ApiController_6.groups())
      }
  
    // @LINE:26
    case controllers_ApiController_messages21_route(params) =>
      call { 
        controllers_ApiController_messages21_invoker.call(ApiController_6.messages())
      }
  
    // @LINE:29
    case controllers_Assets_versioned22_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned22_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
