package domain.pipeline;

public class GithubAdapter implements SourceStrategy {
    private Github a = new Github();
    @Override
    public void run() {
        a.concreteRun();
    }
}
