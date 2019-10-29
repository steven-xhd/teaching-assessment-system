package com.tces.pojo;

/**
 * 用户的拓展类
 */
public class TbUserCustom extends TbUser {
    private String depName;
    private String className;
    private String roleName;

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
