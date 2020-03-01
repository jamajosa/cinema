package domain.pipeline;

public class GithubAdapter implements SourceStrategy {
    private Github a;
    @Override
    public void run() {
        a.concreteRun();
    }
}
