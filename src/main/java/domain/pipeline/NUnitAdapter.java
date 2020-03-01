package domain.pipeline;

public class NUnitAdapter implements TestStrategy {
    private NUnit a;
    @Override
    public void run() {
        a.concreteRun();
    }
}
