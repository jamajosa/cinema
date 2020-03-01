package domain.user;

public class MailAdapter implements NotifyService {
    private String email = new String();
    private MailService ms = new MailService();

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
