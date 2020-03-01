package domain.pipeline;

public class NoPackages implements PackageStrategy {
    @Override
    public void run() {
        System.out.println("no packages");
    }
}
