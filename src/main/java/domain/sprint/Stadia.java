package domain.sprint;

import domain.user.ScrumMaster;

import java.time.LocalDateTime;

public abstract class Stadia {
    Sprint context = new Sprint();
    public void setStart(LocalDateTime dt) {
        System.out.println("cannot implement");
    };
    public void setEnd(LocalDateTime dt) {
        System.out.println("cannot implement");
    };
    public void setScrummaster(ScrumMaster scrummaster) {
        System.out.println("cannot implement");
    };
    public void nextState() {
        System.out.println("cannot implement");
    };
    public void cancel() {
        Cancelled t = new Cancelled();
        context.setState(t);
    };
    public void finish() {
        Finished t = new Finished();
        context.setState(t);
    };

    public void publish(){
        context.notify("state"+ context.getState());
    }
}
