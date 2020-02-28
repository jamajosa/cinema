package domain.users;

public class MailAdapter implements NotifyService {
    @Override
    public void update(String notification) {
        MailAdaptee.printOut(notification);
    }
}
