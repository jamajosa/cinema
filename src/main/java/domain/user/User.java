package domain.user;

import java.util.ArrayList;
import java.util.List;

public abstract class User implements Subscriber{
    private String name;

    private ArrayList<NotifyService> notificationMedium = new ArrayList<NotifyService>();

    public User(String name) {
        this.name = name;
    }

    public void Update(String msg){
        notify(msg);
    }

    public void notify(String notification){
        for(NotifyService s : notificationMedium){
            s.notify(notification);
        }
    }

    public void addNotifyMedium(NotifyService notifyService){
        notificationMedium.add(notifyService);
    }
    public void removeNotifyMedium(NotifyService notifyService){
        notificationMedium.remove(notifyService);
    }
}
