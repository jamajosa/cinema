package domain.sprint;

import domain.backlog.Backlog;
import domain.pipeline.Pipeline;
import domain.reporting.BuildResult;
import domain.reporting.Report;
import domain.user.Publisher;
import domain.user.ScrumMaster;

import java.time.LocalDateTime;

public class Sprint extends Backlog {
    private Type type;
    private Pipeline pipeline;
    private LocalDateTime start;
    private LocalDateTime stop;

    private Stadia state;
    private ScrumMaster scrumMaster;
    private Report sprintReport;
    private Publisher publisher;
    private Review review;

    public void runPipeline(){
        BuildResult br = pipeline.runPipeline();
        if(br.isStatus()){
            Released r = new Released();
            this.setState(r);
        }
    }
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
    public boolean resultGood(){
       return sprintReport.resultGood();
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
