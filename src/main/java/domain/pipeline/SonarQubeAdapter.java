package domain.pipeline;


public class SonarQubeAdapter implements AnalyseStrategy {
    private SonarQube a;
    @Override
    public void run() {
        a.concreteRun();
    }
}