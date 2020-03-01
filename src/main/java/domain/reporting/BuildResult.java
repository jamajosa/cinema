package domain.reporting;

import java.time.LocalDateTime;

public class BuildResult {
    private String status;
    private LocalDateTime time;
    private String details;

    public String print() {
        return "Status: " + this.status + " Time: "  + this.time + " Details: " + this.details;
    }
}
