package domain.reporting;

import java.time.LocalDateTime;

public class BuildResult {


    private boolean status;
    private LocalDateTime time;
    private String details;
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    public String print() {
        return "Status: " + this.status + " Time: "  + this.time + " Details: " + this.details;
    }
}
