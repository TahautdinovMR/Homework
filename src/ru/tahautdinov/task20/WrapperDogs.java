package ru.tahautdinov.task20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dogs {
    private String status;

    public Dogs(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "status='" + status + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
