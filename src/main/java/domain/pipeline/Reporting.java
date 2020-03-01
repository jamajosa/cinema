package domain.pipeline;

public class Reporting implements UtilityStrategy {
    @Override
    public void run() {
        System.out.println("reporting on!");
    }
}
