package domain.backlog;

import domain.user.*;

public class Task {
    protected String text;
    protected User developer;
    protected boolean completed = false;

    public void setDeveloper(User developer) {
        this.developer = developer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCompleted() {
        this.completed = true;
    }
}
