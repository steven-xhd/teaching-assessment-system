package com.tces.pojo;

public class TbAction {
    private Integer id;

    private String actionName;

    private String actionLink;

    private Integer actionOrder;

    private Integer actionParent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public String getActionLink() {
        return actionLink;
    }

    public void setActionLink(String actionLink) {
        this.actionLink = actionLink == null ? null : actionLink.trim();
    }

    public Integer getActionOrder() {
        return actionOrder;
    }

    public void setActionOrder(Integer actionOrder) {
        this.actionOrder = actionOrder;
    }

    public Integer getActionParent() {
        return actionParent;
    }

    public void setActionParent(Integer actionParent) {
        this.actionParent = actionParent;
    }
}