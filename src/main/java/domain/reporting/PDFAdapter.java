package domain.reporting;

public class PDFAdapter implements Exporter {
    private PDFExporter exporter;

    @Override
    public void export() {
        System.out.println("Exported with PDF.");
    }
}
