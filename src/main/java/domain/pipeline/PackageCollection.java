package domain.pipeline;

public class PackageCollection implements PackageStrategy {
    @Override
    public void run() {
        System.out.println("running packages");
    }
}
