package controllers;

import akka.stream.impl.io.OutputStreamSourceStage;
import models.Document;
import models.Groupe;
import models.User;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import security.ActionAuthenticator;
import services.UserService;

import javax.inject.Inject;
import java.util.List;

public class DocumentController extends Controller {


    @Security.Authenticated(ActionAuthenticator.class)
    public Result getFile(Long id) {
        Document doc = Document.find.byId(id);
        return ok(new java.io.File(doc.getPath()));
    }
}
