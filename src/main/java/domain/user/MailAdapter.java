package domain.user;

public class MailAdapter implements NotifyService {
    private String email;
    private MailService ms;

    public void setCredentials (String email)
    {
      this.email=email;
    }
    @Override
    public String notify(String notification)
    {
        return ms.printOut(notification,this.email);
    }
}
