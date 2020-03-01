package domain.pipeline;

public class SeleniumAdapter implements TestStrategy {
    private Selenium a;
    @Override
    public void run() {
        a.concreteRun();
    }
}
