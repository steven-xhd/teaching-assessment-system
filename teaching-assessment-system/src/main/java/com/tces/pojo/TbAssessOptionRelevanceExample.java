package com.tces.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbAssessOptionRelevanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAssessOptionRelevanceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdIsNull() {
            addCriterion("assess_group_id is null");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdIsNotNull() {
            addCriterion("assess_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdEqualTo(Integer value) {
            addCriterion("assess_group_id =", value, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdNotEqualTo(Integer value) {
            addCriterion("assess_group_id <>", value, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdGreaterThan(Integer value) {
            addCriterion("assess_group_id >", value, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assess_group_id >=", value, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdLessThan(Integer value) {
            addCriterion("assess_group_id <", value, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("assess_group_id <=", value, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdIn(List<Integer> values) {
            addCriterion("assess_group_id in", values, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdNotIn(List<Integer> values) {
            addCriterion("assess_group_id not in", values, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("assess_group_id between", value1, value2, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assess_group_id not between", value1, value2, "assessGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdIsNull() {
            addCriterion("assess_option_group_Id is null");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdIsNotNull() {
            addCriterion("assess_option_group_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdEqualTo(Integer value) {
            addCriterion("assess_option_group_Id =", value, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdNotEqualTo(Integer value) {
            addCriterion("assess_option_group_Id <>", value, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdGreaterThan(Integer value) {
            addCriterion("assess_option_group_Id >", value, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assess_option_group_Id >=", value, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdLessThan(Integer value) {
            addCriterion("assess_option_group_Id <", value, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("assess_option_group_Id <=", value, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdIn(List<Integer> values) {
            addCriterion("assess_option_group_Id in", values, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdNotIn(List<Integer> values) {
            addCriterion("assess_option_group_Id not in", values, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("assess_option_group_Id between", value1, value2, "assessOptionGroupId");
            return (Criteria) this;
        }

        public Criteria andAssessOptionGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assess_option_group_Id not between", value1, value2, "assessOptionGroupId");
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