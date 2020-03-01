package domain.reporting;

public class PNGAdapter implements Exporter {
    private PNGExporter exporter;

    @Override
    public void export() {
        exporter.exportNow();
    }
}
