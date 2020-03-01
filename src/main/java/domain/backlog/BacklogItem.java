package domain.backlog;
import domain.user.*;
import java.util.List;

public class BacklogItem extends Task{
    private List<Task> activities;
    private Phase currentPhase = new ToDo();
    private List<Thread> threads;
    private Publisher publisher;

    public void addActivity(Task t){
        activities.add(t);
    }
    public void deleteActivity(Task t){
        activities.remove(t);
    }

    public void addThread(Thread t){
        threads.add(t);
    }

    public void publish(){
        if(this.completed) {
            publisher.notifySubscribers("Backlogitem completed");
        }
    }

    public List<Task> getActivities() {
        return activities;
    }

    public void setActivities(List<Task> activities) {
        this.activities = activities;
    }

    public Phase getCurrentPhase() {
        return currentPhase;
    }

    public void setCurrentPhase(Phase currentPhase) {
        this.currentPhase = currentPhase;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
