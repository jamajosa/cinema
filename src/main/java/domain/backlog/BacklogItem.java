package domain.backlog;
import domain.user.*;
import java.util.List;

public class BacklogItem extends Task{
    private List<Task> activities;
    private Phase currentPhase;
    //private List<Thread> threads;
    private Publisher publisher;

    public void addActivity(Task t){
        activities.add(t);
    }
    public void deleteActivity(Task t){
        activities.remove(t);
    }

//    public void addThread(Thread t){
//        threads.add(t);
//    }
    public void publish(){
        if(this.completed == true) {
            publisher.notify();
        }
    }

    public void setCurrentPhase(Phase p){
        p = currentPhase;
    }
}
