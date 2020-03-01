package domain.backlog;

import java.util.ArrayList;
import java.util.List;

public class Backlog {
    public ArrayList<BacklogItem> items = new ArrayList<BacklogItem>();

    public void addBacklogItem(BacklogItem b){
        items.add(b);
    }
    public void removeBacklogItem(BacklogItem b){
        items.remove(b);
    }
}
