package domain.sprint;

import domain.backlog.Backlog;
import domain.user.Publisher;
import domain.user.ScrumMaster;

import java.time.LocalDateTime;

public class Sprint extends Backlog {
    private Type type;
    //private Pipeline pipeline;
    private LocalDateTime start;
    private LocalDateTime stop;

    private Stadia state;
    private ScrumMaster scrumMaster;
    //private Report sprintReport
    private Publisher publisher;
    private Review review;

    public void setState(Stadia state) {
        this.state = state;
    }
    public Stadia getState() {
        return state;
    }

    public void notify(String s) {
        publisher.notifySubscribers(s);
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getStop() {
        return stop;
    }

    public void setStop(LocalDateTime stop) {
        this.stop = stop;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }
}
