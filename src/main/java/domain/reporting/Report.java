package domain.reporting;

public class Report {
    private Exporter exporter;
    private BuildResult buildResult;

    public void addHeader() {

    }
    public void addTeamDetails() {

    }
    public void addBurnDownChart() {

    }
    public void addEfforts() {

    }
    public void addFooter() {

    }

    public void exportReport() {
        this.exporter.export();
    }
}
