package domain.users;

import java.util.List;

public abstract class Person implements Notify {
    private String name;
    private String email;
    private String slack;
    List<NotifyService> notificationMedium;

    protected Person(String name, String email, String slack) {
        this.name = name;
        this.email = email;
        this.slack = slack;
    }

    public void notify(String notification){
        for(NotifyService s : notificationMedium){
            s.update(notification);
        }
    }

    public void addNotifyMedium(NotifyService notifyService){
        notificationMedium.add(notifyService);
    }
    public void removeNotifyMedium(NotifyService notifyService){
        notificationMedium.remove(notifyService);
    }
}
