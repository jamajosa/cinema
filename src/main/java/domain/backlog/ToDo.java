package domain.backlog;

public class ToDo implements Phase {
    private BacklogItem context;

    @Override
    public void nextPhase() {
        ToDo t = new ToDo();
        context.setCurrentPhase(t);
    }

    @Override
    public void revert() {
        //do nothing
    }
}
