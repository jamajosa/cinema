package domain.scm;

import domain.backlog.Backlog;
import domain.sprint.Sprint;
import domain.user.User;

import java.util.List;

public class Board {
    private Backlog backlog;
    private List<Sprint> sprints;
    private User productOwner;

    public void addSprint(Sprint newSprint){
        this.sprints.add(newSprint);
    }
}
