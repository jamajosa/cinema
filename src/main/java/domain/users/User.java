package domain.users;

import java.util.List;

public abstract class User implements Notify {
    private String name;

    List<NotifyService> notificationMedium;

    public User(String name) {
        this.name = name;
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
