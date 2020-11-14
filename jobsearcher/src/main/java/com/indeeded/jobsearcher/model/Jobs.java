package com.indeeded.jobsearcher.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jobs {

    @Id
    private String jobId;
    private String title;
    private String Description;
    private String location;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobId='" + jobId + '\'' +
                ", title='" + title + '\'' +
                ", Description='" + Description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
