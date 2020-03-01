package domain.backlog;

import java.util.List;

public class Backlog {
    private List<BacklogItem> items;

    public void addBacklogItem(BacklogItem b){
        items.add(b);
    }
    public void removeBacklogItem(BacklogItem b){
        items.remove(b);
    }
}
