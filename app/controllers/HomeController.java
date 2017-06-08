package controllers;

import com.avaje.ebean.Expr;
import models.Document;
import models.Groupe;
import models.Message;
import models.User;
import play.Logger;
import play.Play;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import security.ActionAuthenticator;
import play.data.FormFactory;
import services.UserService;
import views.html.login;

import javax.inject.Inject;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    FormFactory formFactory;
    UserService authService;

    @Inject
    public HomeController(FormFactory formFactory, UserService authService) {
        this.formFactory = formFactory;
        this.authService = authService;
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result index() {
        User u = authService.getCurrentUser();
        List<Groupe> groupes = u.getGroupes();
        List<Message> messages = Message.find.where()
                .or(
                        Expr.in("groupe", groupes),
                        Expr.isNull("groupe")
                )
                .orderBy("creationDate desc")
                .findList();
        Logger.info(Play.application().path().getAbsolutePath());
        return ok(views.html.index.render(messages, groupes));
    }

    public Result login() {
        return ok(views.html.login.render());
    }

    public Result handleLogin() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        User u = User.findByPassword(dynamicForm.get("email"), dynamicForm.get("password"));
        if(u != null) {
            Logger.info(u.getEmail());
            session("userToken", u.getEmail());
            redirect(routes.HomeController.index());
        }

        return ok(views.html.login.render());
    }

    public Result logout() {
        session().remove("userToken");
        return this.login();
    }

    public Result initialize() {
        User u = new User(null, "bachir", "bachir@gmail.com","abc123", 2);
        Groupe g1 = new Groupe(null, "IG3");
        Groupe g2 = new Groupe(null, "IG4");
        Groupe g3 = new Groupe(null, "IG5");
        Groupe g4 = new Groupe(null, "AWI");
        Message m1 = new Message(null, "a", new Date(), u, g1, null);
        Message m2 = new Message(null, "b", new Date(), u, g1, null);
        Message m3 = new Message(null, "c", new Date(), u, g1, null);
        Message m4 = new Message(null, "a", new Date(), u, g2, null);
        List<Groupe> groupes = new ArrayList<Groupe>();
        groupes.add(g1);
        groupes.add(g2);
        u.setGroupes(groupes);
        g1.save();
        g2.save();
        g3.save();
        g4.save();
        u.save();
        m1.save();
        m2.save();
        m3.save();
        m4.save();
        return ok("intialized");
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result doMessageCreate() {
        User u = authService.getCurrentUser();
        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> doc = body.getFile("document");

        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String content = dynamicForm.get("content");
        String groupeId = dynamicForm.get("groupe");

        Groupe g = null;
        Document d = null;
        try {
            g = Groupe.find.byId(Long.valueOf(groupeId));
        } catch (Exception e) {
            g = null;
        }
        if(doc != null) {
            String dest = Play.application().path().getAbsolutePath() + "/public/upload/" + doc.getFilename();
            Logger.info(dest);
            doc.getFile().renameTo(new File(dest));
            d = new Document(null, doc.getFilename(), new Date(), dest);
            d.save();
        }

        Message m = new Message(null, content, new Date(), u, g, d);
        m.save();
        return index();
    }
}
