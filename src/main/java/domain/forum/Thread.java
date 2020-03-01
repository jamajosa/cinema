package domain.forum;

import java.util.List;

public class Thread extends Comment{
    private List<Comment> replies;

    public void addReply(Comment t){
        replies.add(t);
        this.user.notify("u got a reply: "+t);
    }
    public void deleteReply(Comment t){
        replies.remove(t);
    }
}
