package domain.reporting;

public class PDFAdapter implements Exporter {
    private PDFExporter exporter;

    @Override
    public void export() {
        exporter.exprt();
    }
}
