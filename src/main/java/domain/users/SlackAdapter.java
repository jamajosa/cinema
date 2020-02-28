package domain.users;

public class SlackAdapter implements NotifyService {

    private String notification;

    @Override
    public void update(String notification)
    {
        SlackAdaptee.print(notification);
    }
}
