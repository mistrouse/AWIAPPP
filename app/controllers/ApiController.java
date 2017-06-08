package controllers;

import models.Message;
import play.mvc.Result;
import com.avaje.ebean.Ebean;
import models.Document;
import models.Groupe;
import models.User;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.libs.Json;

public class ApiController extends Controller {


    public Result users() {
        //this.initializeProduct();
        return ok(Json.toJson(User.find.all()));
    }

    public Result groups() {
        return ok(Json.toJson(Groupe.find.all()));
    }

    public Result messages() {
        return ok(Json.toJson(Message.find.all()));
    }
}
