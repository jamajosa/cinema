package domain.users;

public class SlackAdapter implements NotifyService {
    private String slackaccount;
    private SlackService ss;

    @Override
    public void notify(String notification)
    {
        ss.print(notification , this.slackaccount);
    }
    public void setCredentials(String slack){
        this.slackaccount = slack;
    }
}
