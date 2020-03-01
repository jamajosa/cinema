package domain.user;

public class SlackAdapter implements NotifyService {
    private String slackaccount;
    private SlackService ss;

    @Override
    public String notify(String notification)
    {
        return ss.print(notification , this.slackaccount);
    }
    public void setCredentials(String slack){
        this.slackaccount = slack;
    }
}
