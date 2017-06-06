package controllers;

import com.avaje.ebean.Ebean;
import models.Document;
import models.Groupe;
import models.Message;
import models.User;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import security.ActionAuthenticator;
import services.UserService;

import javax.inject.Inject;
import java.util.List;

public class MessageController extends Controller {

    private UserService userService;

    @Inject
    public MessageController(UserService userService) {

        this.userService = userService;
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result index() {
        List<Message> allMessages = Message.find.all();
        return ok(views.html.listeMessages.render(allMessages));
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result delete(Long id) {
        Ebean.delete(Message.find.byId(id));
        return index();
    }
}
