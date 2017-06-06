package security;

import controllers.routes;
import models.User;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import play.Logger;
import services.UserService;

import javax.inject.Inject;

public class ActionAuthenticator extends Security.Authenticator {

    public UserService userService;

    @Inject
    public ActionAuthenticator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getUsername(Http.Context ctx) {
        String token = getTokenFromCookies(ctx);
        if(token != null) {
            userService.authenticate(token);
        }
        User currentUser = userService.getCurrentUser();
        if(currentUser != null) {
            return currentUser.getEmail();
        }
        else {
            return null;
        }
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return redirect(routes.HomeController.login());
    }

    private String getTokenFromCookies(Http.Context ctx) {
        Http.Session s = ctx.session();
        String token = s.get("userToken");
        return token;
    }
}
