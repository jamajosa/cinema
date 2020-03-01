package domain.pipeline;

public class NoUtility implements UtilityStrategy {
    @Override
    public void run() {
        System.out.println("no utils");
    }
}
