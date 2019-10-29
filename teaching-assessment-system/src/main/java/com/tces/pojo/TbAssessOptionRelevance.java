package com.tces.pojo;

public class TbAssessOptionRelevance {
    private Integer id;

    private Integer assessGroupId;

    private Integer assessOptionGroupId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssessGroupId() {
        return assessGroupId;
    }

    public void setAssessGroupId(Integer assessGroupId) {
        this.assessGroupId = assessGroupId;
    }

    public Integer getAssessOptionGroupId() {
        return assessOptionGroupId;
    }

    public void setAssessOptionGroupId(Integer assessOptionGroupId) {
        this.assessOptionGroupId = assessOptionGroupId;
    }
}