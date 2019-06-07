package com.xiao.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTreeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTreeIdIsNull() {
            addCriterion("tree_id is null");
            return (Criteria) this;
        }

        public Criteria andTreeIdIsNotNull() {
            addCriterion("tree_id is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIdEqualTo(String value) {
            addCriterion("tree_id =", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotEqualTo(String value) {
            addCriterion("tree_id <>", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThan(String value) {
            addCriterion("tree_id >", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("tree_id >=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThan(String value) {
            addCriterion("tree_id <", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThanOrEqualTo(String value) {
            addCriterion("tree_id <=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLike(String value) {
            addCriterion("tree_id like", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotLike(String value) {
            addCriterion("tree_id not like", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdIn(List<String> values) {
            addCriterion("tree_id in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotIn(List<String> values) {
            addCriterion("tree_id not in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdBetween(String value1, String value2) {
            addCriterion("tree_id between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotBetween(String value1, String value2) {
            addCriterion("tree_id not between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNull() {
            addCriterion("tree_type is null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNotNull() {
            addCriterion("tree_type is not null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeEqualTo(String value) {
            addCriterion("tree_type =", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotEqualTo(String value) {
            addCriterion("tree_type <>", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThan(String value) {
            addCriterion("tree_type >", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tree_type >=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThan(String value) {
            addCriterion("tree_type <", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThanOrEqualTo(String value) {
            addCriterion("tree_type <=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLike(String value) {
            addCriterion("tree_type like", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotLike(String value) {
            addCriterion("tree_type not like", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIn(List<String> values) {
            addCriterion("tree_type in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotIn(List<String> values) {
            addCriterion("tree_type not in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeBetween(String value1, String value2) {
            addCriterion("tree_type between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotBetween(String value1, String value2) {
            addCriterion("tree_type not between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameIsNull() {
            addCriterion("tree_node_name is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameIsNotNull() {
            addCriterion("tree_node_name is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameEqualTo(String value) {
            addCriterion("tree_node_name =", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotEqualTo(String value) {
            addCriterion("tree_node_name <>", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameGreaterThan(String value) {
            addCriterion("tree_node_name >", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_name >=", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameLessThan(String value) {
            addCriterion("tree_node_name <", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameLessThanOrEqualTo(String value) {
            addCriterion("tree_node_name <=", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameLike(String value) {
            addCriterion("tree_node_name like", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotLike(String value) {
            addCriterion("tree_node_name not like", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameIn(List<String> values) {
            addCriterion("tree_node_name in", values, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotIn(List<String> values) {
            addCriterion("tree_node_name not in", values, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameBetween(String value1, String value2) {
            addCriterion("tree_node_name between", value1, value2, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotBetween(String value1, String value2) {
            addCriterion("tree_node_name not between", value1, value2, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdIsNull() {
            addCriterion("tree_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdIsNotNull() {
            addCriterion("tree_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdEqualTo(String value) {
            addCriterion("tree_parent_id =", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdNotEqualTo(String value) {
            addCriterion("tree_parent_id <>", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdGreaterThan(String value) {
            addCriterion("tree_parent_id >", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("tree_parent_id >=", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdLessThan(String value) {
            addCriterion("tree_parent_id <", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdLessThanOrEqualTo(String value) {
            addCriterion("tree_parent_id <=", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdLike(String value) {
            addCriterion("tree_parent_id like", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdNotLike(String value) {
            addCriterion("tree_parent_id not like", value, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdIn(List<String> values) {
            addCriterion("tree_parent_id in", values, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdNotIn(List<String> values) {
            addCriterion("tree_parent_id not in", values, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdBetween(String value1, String value2) {
            addCriterion("tree_parent_id between", value1, value2, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeParentIdNotBetween(String value1, String value2) {
            addCriterion("tree_parent_id not between", value1, value2, "treeParentId");
            return (Criteria) this;
        }

        public Criteria andTreeImgIsNull() {
            addCriterion("tree_img is null");
            return (Criteria) this;
        }

        public Criteria andTreeImgIsNotNull() {
            addCriterion("tree_img is not null");
            return (Criteria) this;
        }

        public Criteria andTreeImgEqualTo(String value) {
            addCriterion("tree_img =", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgNotEqualTo(String value) {
            addCriterion("tree_img <>", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgGreaterThan(String value) {
            addCriterion("tree_img >", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgGreaterThanOrEqualTo(String value) {
            addCriterion("tree_img >=", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgLessThan(String value) {
            addCriterion("tree_img <", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgLessThanOrEqualTo(String value) {
            addCriterion("tree_img <=", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgLike(String value) {
            addCriterion("tree_img like", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgNotLike(String value) {
            addCriterion("tree_img not like", value, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgIn(List<String> values) {
            addCriterion("tree_img in", values, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgNotIn(List<String> values) {
            addCriterion("tree_img not in", values, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgBetween(String value1, String value2) {
            addCriterion("tree_img between", value1, value2, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeImgNotBetween(String value1, String value2) {
            addCriterion("tree_img not between", value1, value2, "treeImg");
            return (Criteria) this;
        }

        public Criteria andTreeUrlIsNull() {
            addCriterion("tree_url is null");
            return (Criteria) this;
        }

        public Criteria andTreeUrlIsNotNull() {
            addCriterion("tree_url is not null");
            return (Criteria) this;
        }

        public Criteria andTreeUrlEqualTo(String value) {
            addCriterion("tree_url =", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlNotEqualTo(String value) {
            addCriterion("tree_url <>", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlGreaterThan(String value) {
            addCriterion("tree_url >", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("tree_url >=", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlLessThan(String value) {
            addCriterion("tree_url <", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlLessThanOrEqualTo(String value) {
            addCriterion("tree_url <=", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlLike(String value) {
            addCriterion("tree_url like", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlNotLike(String value) {
            addCriterion("tree_url not like", value, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlIn(List<String> values) {
            addCriterion("tree_url in", values, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlNotIn(List<String> values) {
            addCriterion("tree_url not in", values, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlBetween(String value1, String value2) {
            addCriterion("tree_url between", value1, value2, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andTreeUrlNotBetween(String value1, String value2) {
            addCriterion("tree_url not between", value1, value2, "treeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameIsNull() {
            addCriterion("tree_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameIsNotNull() {
            addCriterion("tree_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameEqualTo(String value) {
            addCriterion("tree_parent_name =", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameNotEqualTo(String value) {
            addCriterion("tree_parent_name <>", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameGreaterThan(String value) {
            addCriterion("tree_parent_name >", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("tree_parent_name >=", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameLessThan(String value) {
            addCriterion("tree_parent_name <", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameLessThanOrEqualTo(String value) {
            addCriterion("tree_parent_name <=", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameLike(String value) {
            addCriterion("tree_parent_name like", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameNotLike(String value) {
            addCriterion("tree_parent_name not like", value, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameIn(List<String> values) {
            addCriterion("tree_parent_name in", values, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameNotIn(List<String> values) {
            addCriterion("tree_parent_name not in", values, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameBetween(String value1, String value2) {
            addCriterion("tree_parent_name between", value1, value2, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeParentNameNotBetween(String value1, String value2) {
            addCriterion("tree_parent_name not between", value1, value2, "treeParentName");
            return (Criteria) this;
        }

        public Criteria andTreeSortIsNull() {
            addCriterion("tree_sort is null");
            return (Criteria) this;
        }

        public Criteria andTreeSortIsNotNull() {
            addCriterion("tree_sort is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSortEqualTo(String value) {
            addCriterion("tree_sort =", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortNotEqualTo(String value) {
            addCriterion("tree_sort <>", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortGreaterThan(String value) {
            addCriterion("tree_sort >", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortGreaterThanOrEqualTo(String value) {
            addCriterion("tree_sort >=", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortLessThan(String value) {
            addCriterion("tree_sort <", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortLessThanOrEqualTo(String value) {
            addCriterion("tree_sort <=", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortLike(String value) {
            addCriterion("tree_sort like", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortNotLike(String value) {
            addCriterion("tree_sort not like", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortIn(List<String> values) {
            addCriterion("tree_sort in", values, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortNotIn(List<String> values) {
            addCriterion("tree_sort not in", values, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortBetween(String value1, String value2) {
            addCriterion("tree_sort between", value1, value2, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortNotBetween(String value1, String value2) {
            addCriterion("tree_sort not between", value1, value2, "treeSort");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andPostRankIdIsNull() {
            addCriterion("post_rank_id is null");
            return (Criteria) this;
        }

        public Criteria andPostRankIdIsNotNull() {
            addCriterion("post_rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostRankIdEqualTo(String value) {
            addCriterion("post_rank_id =", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdNotEqualTo(String value) {
            addCriterion("post_rank_id <>", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdGreaterThan(String value) {
            addCriterion("post_rank_id >", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_rank_id >=", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdLessThan(String value) {
            addCriterion("post_rank_id <", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdLessThanOrEqualTo(String value) {
            addCriterion("post_rank_id <=", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdLike(String value) {
            addCriterion("post_rank_id like", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdNotLike(String value) {
            addCriterion("post_rank_id not like", value, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdIn(List<String> values) {
            addCriterion("post_rank_id in", values, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdNotIn(List<String> values) {
            addCriterion("post_rank_id not in", values, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdBetween(String value1, String value2) {
            addCriterion("post_rank_id between", value1, value2, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankIdNotBetween(String value1, String value2) {
            addCriterion("post_rank_id not between", value1, value2, "postRankId");
            return (Criteria) this;
        }

        public Criteria andPostRankNameIsNull() {
            addCriterion("post_rank_name is null");
            return (Criteria) this;
        }

        public Criteria andPostRankNameIsNotNull() {
            addCriterion("post_rank_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostRankNameEqualTo(String value) {
            addCriterion("post_rank_name =", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameNotEqualTo(String value) {
            addCriterion("post_rank_name <>", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameGreaterThan(String value) {
            addCriterion("post_rank_name >", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_rank_name >=", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameLessThan(String value) {
            addCriterion("post_rank_name <", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameLessThanOrEqualTo(String value) {
            addCriterion("post_rank_name <=", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameLike(String value) {
            addCriterion("post_rank_name like", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameNotLike(String value) {
            addCriterion("post_rank_name not like", value, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameIn(List<String> values) {
            addCriterion("post_rank_name in", values, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameNotIn(List<String> values) {
            addCriterion("post_rank_name not in", values, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameBetween(String value1, String value2) {
            addCriterion("post_rank_name between", value1, value2, "postRankName");
            return (Criteria) this;
        }

        public Criteria andPostRankNameNotBetween(String value1, String value2) {
            addCriterion("post_rank_name not between", value1, value2, "postRankName");
            return (Criteria) this;
        }

        public Criteria andCompayIdIsNull() {
            addCriterion("compay_id is null");
            return (Criteria) this;
        }

        public Criteria andCompayIdIsNotNull() {
            addCriterion("compay_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompayIdEqualTo(String value) {
            addCriterion("compay_id =", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdNotEqualTo(String value) {
            addCriterion("compay_id <>", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdGreaterThan(String value) {
            addCriterion("compay_id >", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdGreaterThanOrEqualTo(String value) {
            addCriterion("compay_id >=", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdLessThan(String value) {
            addCriterion("compay_id <", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdLessThanOrEqualTo(String value) {
            addCriterion("compay_id <=", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdLike(String value) {
            addCriterion("compay_id like", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdNotLike(String value) {
            addCriterion("compay_id not like", value, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdIn(List<String> values) {
            addCriterion("compay_id in", values, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdNotIn(List<String> values) {
            addCriterion("compay_id not in", values, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdBetween(String value1, String value2) {
            addCriterion("compay_id between", value1, value2, "compayId");
            return (Criteria) this;
        }

        public Criteria andCompayIdNotBetween(String value1, String value2) {
            addCriterion("compay_id not between", value1, value2, "compayId");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Byte value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Byte value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Byte value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Byte value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Byte value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Byte> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Byte> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Byte value1, Byte value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Byte value1, Byte value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sys_code =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sys_code <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sys_code like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sys_code not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sys_code in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sysCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}