package domain.sprint;

import domain.user.ScrumMaster;

import java.time.LocalDateTime;

public class Prepare extends Stadia{
    public void setStart(LocalDateTime dt) {
        context.setStart(dt);
    };
    public void setEnd(LocalDateTime dt) {
        context.setStop(dt);
    };
    public void setScrummaster(ScrumMaster scrummaster) {
        context.setScrumMaster(scrummaster);
    };
    public void nextState() {
        Active t = new Active();
        context.setState(t);
    };
}
