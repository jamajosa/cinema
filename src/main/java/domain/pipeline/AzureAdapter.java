package domain.pipeline;

public class AzureAdapter implements DeployStrategy {
    private Azure a = new Azure();
    public void run() {
        a.concreteRun();
    }
}
