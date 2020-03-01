package domain.pipeline;

public class AzureAdapter implements DeployStrategy {
    private Azure a;
    public void run() {
        a.concreteRun();
    }
}
