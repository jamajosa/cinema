package domain.user;

public class SlackService {

    public static String print(String notification, String account) {
        return "slack : " + notification + " for " + account;
    }
}
