package domain.pipeline;

public class AntAdapter implements BuildStrategy {
    private AntBuild a = new AntBuild();
    @Override
    public void run() {
        a.concreteRun();
    }
}
