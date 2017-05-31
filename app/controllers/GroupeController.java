package controllers;

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

public class GroupeController extends Controller {

    private UserService userService;

    @Inject
    public GroupeController(UserService userService) {

        this.userService = userService;
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result index() {
        List<Groupe> allGroupes = Groupe.allGroupes();
        return ok(views.html.listeDesGroupes.render(allGroupes));
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result voirGroupe(Long groupId) {
        Logger.info(groupId.toString());
        Groupe g = Groupe.getGroupe(groupId);
        // g.fetchMessages();
        Logger.info(groupId.toString());
        return ok(views.html.voirGroupe.render(g));
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result myGroups() {
        User u = userService.getCurrentUser();
        u.getEmail();
        u.fetchGroups();
        List<Groupe> myGroups = u.getGroupes();
        return ok(views.html.myGroups.render(myGroups));
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result createGroup() {
        return ok(views.html.creerGroupe.render());
    }
}
