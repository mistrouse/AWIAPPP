package controllers;

import akka.stream.impl.io.OutputStreamSourceStage;
import com.avaje.ebean.Expr;
import models.Document;
import models.Groupe;
import models.Message;
import models.User;
import play.Logger;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import security.ActionAuthenticator;
import services.UserService;

import javax.inject.Inject;
import java.util.List;

public class DocumentController extends Controller {

    UserService authService;

    @Inject
    public DocumentController(UserService authService) {
        this.authService = authService;
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result getFile(Long id) {
        Document doc = Document.find.byId(id);
        return ok(new java.io.File(doc.getPath()));
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result index() {
        User u = authService.getCurrentUser();
        List<Groupe> groupes = u.getGroupes();
        List<Document> docs = Document.find.all();

        return ok(views.html.listeDocuments.render(docs));
    }
}
