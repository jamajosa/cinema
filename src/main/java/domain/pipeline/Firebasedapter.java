package domain.pipeline;

public class Firebasedapter implements DeployStrategy {
    private Firebase a;
    @Override
    public void run() {
        a.concreteRun();
    }
}
