package com.xiao.admin.entity;


import java.io.Serializable;
import java.util.Date;

public class TbTree implements Serializable {

    private String treeId;

    private String treeType;

    private String treeNodeName;

    private String treeParentId;

    private String treeImg;

    private String treeUrl;

    private String orgId;

    private String updateUser;

    private Date updateTime;

    private String createUser;

    private Date createTime;

    private String flag;

    private String treeParentName;

    private String treeSort;

    private String isDefault;

    private String postRankId;

    private String postRankName;

    private String compayId;

    private Byte num;

    private String sysCode;

    private String treeDesc;

    private String postObligation;

    private static final long serialVersionUID = 1L;

    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public String getTreeNodeName() {
        return treeNodeName;
    }

    public void setTreeNodeName(String treeNodeName) {
        this.treeNodeName = treeNodeName;
    }

    public String getTreeParentId() {
        return treeParentId;
    }

    public void setTreeParentId(String treeParentId) {
        this.treeParentId = treeParentId;
    }

    public String getTreeImg() {
        return treeImg;
    }

    public void setTreeImg(String treeImg) {
        this.treeImg = treeImg;
    }

    public String getTreeUrl() {
        return treeUrl;
    }

    public void setTreeUrl(String treeUrl) {
        this.treeUrl = treeUrl;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTreeParentName() {
        return treeParentName;
    }

    public void setTreeParentName(String treeParentName) {
        this.treeParentName = treeParentName;
    }

    public String getTreeSort() {
        return treeSort;
    }

    public void setTreeSort(String treeSort) {
        this.treeSort = treeSort;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getPostRankId() {
        return postRankId;
    }

    public void setPostRankId(String postRankId) {
        this.postRankId = postRankId;
    }

    public String getPostRankName() {
        return postRankName;
    }

    public void setPostRankName(String postRankName) {
        this.postRankName = postRankName;
    }

    public String getCompayId() {
        return compayId;
    }

    public void setCompayId(String compayId) {
        this.compayId = compayId;
    }

    public Byte getNum() {
        return num;
    }

    public void setNum(Byte num) {
        this.num = num;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getTreeDesc() {
        return treeDesc;
    }

    public void setTreeDesc(String treeDesc) {
        this.treeDesc = treeDesc;
    }

    public String getPostObligation() {
        return postObligation;
    }

    public void setPostObligation(String postObligation) {
        this.postObligation = postObligation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", treeId=").append(treeId);
        sb.append(", treeType=").append(treeType);
        sb.append(", treeNodeName=").append(treeNodeName);
        sb.append(", treeParentId=").append(treeParentId);
        sb.append(", treeImg=").append(treeImg);
        sb.append(", treeUrl=").append(treeUrl);
        sb.append(", orgId=").append(orgId);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", flag=").append(flag);
        sb.append(", treeParentName=").append(treeParentName);
        sb.append(", treeSort=").append(treeSort);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", postRankId=").append(postRankId);
        sb.append(", postRankName=").append(postRankName);
        sb.append(", compayId=").append(compayId);
        sb.append(", num=").append(num);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", treeDesc=").append(treeDesc);
        sb.append(", postObligation=").append(postObligation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}