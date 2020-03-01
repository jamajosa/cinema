package domain.backlog;

public class Doing implements Phase{
    private BacklogItem context = new BacklogItem();
    @Override
    public void nextPhase() {
        Done t = new Done();
        context.setCurrentPhase(t);
    }

    @Override
    public void revert() {
        ToDo t = new ToDo();
        context.setCurrentPhase(t);
    }
}
