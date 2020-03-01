package domain.pipeline;

public class NoAnalysis implements AnalyseStrategy {
    @Override
    public void run() {
        System.out.println("no analyse!");
    }
}
