package domain.backlog;
import domain.user.*;

import java.util.ArrayList;
import java.util.List;

public class BacklogItem extends Task{
    private ArrayList<Task> activities = new ArrayList<Task>();
    private Phase currentPhase = new ToDo();
    private ArrayList<Thread> threads = new ArrayList<Thread>();
    private Publisher publisher= new Publisher();

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

    public void setActivities(ArrayList<Task> activities) {
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
