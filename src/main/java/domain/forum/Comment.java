package domain.forum;

import domain.user.User;

public class Comment {

    protected String text;
    protected User user;

    public void publish(){
            user.notify("u posted: " + text);
    }

}
