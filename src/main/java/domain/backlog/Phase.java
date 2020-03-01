package domain.backlog;

public interface Phase {
    public void nextPhase();
    public void revert();
}
