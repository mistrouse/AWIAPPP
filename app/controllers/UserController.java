package controllers;

import com.avaje.ebean.Ebean;
import models.Groupe;
import models.Message;
import models.User;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import security.ActionAuthenticator;
import services.UserService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserController extends Controller {

    private UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result list() {

        List<User> allUsers = User.find.all();
        return ok(views.html.userList.render(allUsers));
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result create() {
        List<Groupe> allGroupes = Groupe.allGroupes();
        return ok(views.html.createUser.render(allGroupes));
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result doCreate() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        Map<String, String> g = dynamicForm.data();
        ArrayList<Groupe> groupIds = new ArrayList<Groupe>();
        for (Map.Entry<String, String> entry : g.entrySet())
        {
            if(entry.getKey().startsWith("groups")) {
                Long id = Long.valueOf(entry.getValue());
                groupIds.add(new Groupe(id, null));
            }
        }
        Logger.debug("groups={}", groupIds);
        String email = dynamicForm.get("email");
        String password = dynamicForm.get("password");
        String name = dynamicForm.get("name");
        User user = new User(null, name, email, password, 0);
        user.setGroupes(groupIds);
        user.save();

        return this.list();
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result delete(Long id) {
        Ebean.delete(User.find.byId(id));
        return list();
    }
}
