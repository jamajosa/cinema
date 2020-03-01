package domain.pipeline;

public class NUnitAdapter implements TestStrategy {
    private NUnit a = new NUnit();
    @Override
    public void run() {
        a.concreteRun();
    }
}
