package domain.users;

public class MailAdapter implements NotifyService {
    private String email;
    private MailService ms;

    public void setCredentials (String email)
    {
      this.email=email;
    }
    @Override
    public void notify(String notification)
    {
        ms.printOut(notification,this.email);
    }
}
