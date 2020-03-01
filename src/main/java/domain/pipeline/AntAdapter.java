package domain.pipeline;

public class AntAdapter implements BuildStrategy {
    private AntBuild a;
    @Override
    public void run() {
        a.concreteRun();
    }
}
