package services;

import models.User;
import play.Logger;

import javax.inject.Singleton;

@Singleton
public class UserService {
    User currentUser;

    public void authenticate(String email, String password) {
        currentUser = User.find.where().eq("email", email).eq("password", password).findUnique();
    }

    public void authenticate(String token) {
        currentUser = User.find.where().eq("email", token).findUnique();
    }

    public User getCurrentUser() {
        return this.currentUser;
    }
}
