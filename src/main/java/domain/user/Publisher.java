package domain.user;

import java.util.List;

public class Publisher {
    List<Subscriber> subscriberList;

    public void addSubscriber(Subscriber s)
    {
        subscriberList.add(s);
    }

    public void removeSubscriber(Subscriber s)
    {
        subscriberList.add(s);
    }
    public void notifySubscribers(String message){
        for(Subscriber s : subscriberList){
            s.Update(message);
        }
    }
}
