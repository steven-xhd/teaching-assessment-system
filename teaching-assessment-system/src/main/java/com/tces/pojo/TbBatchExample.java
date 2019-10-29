package com.tces.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBatchExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andBatchNameIsNull() {
            addCriterion("batch_name is null");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNotNull() {
            addCriterion("batch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNameEqualTo(String value) {
            addCriterion("batch_name =", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotEqualTo(String value) {
            addCriterion("batch_name <>", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThan(String value) {
            addCriterion("batch_name >", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("batch_name >=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThan(String value) {
            addCriterion("batch_name <", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThanOrEqualTo(String value) {
            addCriterion("batch_name <=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLike(String value) {
            addCriterion("batch_name like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotLike(String value) {
            addCriterion("batch_name not like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIn(List<String> values) {
            addCriterion("batch_name in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotIn(List<String> values) {
            addCriterion("batch_name not in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameBetween(String value1, String value2) {
            addCriterion("batch_name between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotBetween(String value1, String value2) {
            addCriterion("batch_name not between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchStatusIsNull() {
            addCriterion("batch_status is null");
            return (Criteria) this;
        }

        public Criteria andBatchStatusIsNotNull() {
            addCriterion("batch_status is not null");
            return (Criteria) this;
        }

        public Criteria andBatchStatusEqualTo(String value) {
            addCriterion("batch_status =", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotEqualTo(String value) {
            addCriterion("batch_status <>", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusGreaterThan(String value) {
            addCriterion("batch_status >", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusGreaterThanOrEqualTo(String value) {
            addCriterion("batch_status >=", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusLessThan(String value) {
            addCriterion("batch_status <", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusLessThanOrEqualTo(String value) {
            addCriterion("batch_status <=", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusLike(String value) {
            addCriterion("batch_status like", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotLike(String value) {
            addCriterion("batch_status not like", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusIn(List<String> values) {
            addCriterion("batch_status in", values, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotIn(List<String> values) {
            addCriterion("batch_status not in", values, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusBetween(String value1, String value2) {
            addCriterion("batch_status between", value1, value2, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotBetween(String value1, String value2) {
            addCriterion("batch_status not between", value1, value2, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStartIsNull() {
            addCriterion("batch_start is null");
            return (Criteria) this;
        }

        public Criteria andBatchStartIsNotNull() {
            addCriterion("batch_start is not null");
            return (Criteria) this;
        }

        public Criteria andBatchStartEqualTo(Date value) {
            addCriterionForJDBCDate("batch_start =", value, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("batch_start <>", value, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartGreaterThan(Date value) {
            addCriterionForJDBCDate("batch_start >", value, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("batch_start >=", value, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartLessThan(Date value) {
            addCriterionForJDBCDate("batch_start <", value, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("batch_start <=", value, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartIn(List<Date> values) {
            addCriterionForJDBCDate("batch_start in", values, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("batch_start not in", values, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("batch_start between", value1, value2, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("batch_start not between", value1, value2, "batchStart");
            return (Criteria) this;
        }

        public Criteria andBatchEndIsNull() {
            addCriterion("batch_end is null");
            return (Criteria) this;
        }

        public Criteria andBatchEndIsNotNull() {
            addCriterion("batch_end is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEndEqualTo(Date value) {
            addCriterionForJDBCDate("batch_end =", value, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("batch_end <>", value, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndGreaterThan(Date value) {
            addCriterionForJDBCDate("batch_end >", value, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("batch_end >=", value, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndLessThan(Date value) {
            addCriterionForJDBCDate("batch_end <", value, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("batch_end <=", value, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndIn(List<Date> values) {
            addCriterionForJDBCDate("batch_end in", values, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("batch_end not in", values, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("batch_end between", value1, value2, "batchEnd");
            return (Criteria) this;
        }

        public Criteria andBatchEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("batch_end not between", value1, value2, "batchEnd");
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