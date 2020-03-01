package domain.backlog;

public class Done implements Phase {
    private BacklogItem context = new BacklogItem();
    @Override
    public void nextPhase() {
        //nope
    }

    @Override
    public void revert() {
        ToDo t = new ToDo();
        context.setCurrentPhase(t);
    }
}
