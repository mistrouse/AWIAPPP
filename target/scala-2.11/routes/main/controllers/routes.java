
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/florianeMac/Documents/GitHub/AWIAPPP/conf/routes
// @DATE:Wed Jun 07 01:29:40 CEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDocumentController DocumentController = new controllers.ReverseDocumentController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMessageController MessageController = new controllers.ReverseMessageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseGroupeController GroupeController = new controllers.ReverseGroupeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDocumentController DocumentController = new controllers.javascript.ReverseDocumentController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMessageController MessageController = new controllers.javascript.ReverseMessageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseGroupeController GroupeController = new controllers.javascript.ReverseGroupeController(RoutesPrefix.byNamePrefix());
  }

}
