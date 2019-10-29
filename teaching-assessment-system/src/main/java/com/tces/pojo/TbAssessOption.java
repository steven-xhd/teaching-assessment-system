package com.tces.pojo;

public class TbAssessOption {
    private Integer id;

    private Integer optionParent;

    private String optionName;

    private Integer optionScore;

    private Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOptionParent() {
        return optionParent;
    }

    public void setOptionParent(Integer optionParent) {
        this.optionParent = optionParent;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public Integer getOptionScore() {
        return optionScore;
    }

    public void setOptionScore(Integer optionScore) {
        this.optionScore = optionScore;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}