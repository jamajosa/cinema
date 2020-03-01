package domain.pipeline;

public class MavenAdapter implements BuildStrategy {
    private MavenBuild a;
    @Override
    public void run() {
        a.concreteRun();
    }
}
