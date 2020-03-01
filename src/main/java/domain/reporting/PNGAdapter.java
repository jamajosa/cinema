package domain.reporting;

public class PNGAdapter implements Exporter {
    private PNGExporter exporter;

    @Override
    public void export() {
        System.out.println("Exported with PNG.");
    }
}
