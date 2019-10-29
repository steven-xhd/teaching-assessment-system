package com.tces.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TbBatch {
    private Integer id;

    private String batchName;

    private String batchStatus;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date batchStart;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date batchEnd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus == null ? null : batchStatus.trim();
    }

    public Date getBatchStart() {
        return batchStart;
    }

    public void setBatchStart(Date batchStart) {
        this.batchStart = batchStart;
    }

    public Date getBatchEnd() {
        return batchEnd;
    }

    public void setBatchEnd(Date batchEnd) {
        this.batchEnd = batchEnd;
    }
}