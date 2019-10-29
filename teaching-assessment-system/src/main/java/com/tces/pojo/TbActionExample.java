package com.tces.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbActionExample() {
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

        public Criteria andActionNameIsNull() {
            addCriterion("action_name is null");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNotNull() {
            addCriterion("action_name is not null");
            return (Criteria) this;
        }

        public Criteria andActionNameEqualTo(String value) {
            addCriterion("action_name =", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotEqualTo(String value) {
            addCriterion("action_name <>", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThan(String value) {
            addCriterion("action_name >", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThanOrEqualTo(String value) {
            addCriterion("action_name >=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThan(String value) {
            addCriterion("action_name <", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThanOrEqualTo(String value) {
            addCriterion("action_name <=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLike(String value) {
            addCriterion("action_name like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotLike(String value) {
            addCriterion("action_name not like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameIn(List<String> values) {
            addCriterion("action_name in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotIn(List<String> values) {
            addCriterion("action_name not in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameBetween(String value1, String value2) {
            addCriterion("action_name between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotBetween(String value1, String value2) {
            addCriterion("action_name not between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionLinkIsNull() {
            addCriterion("action_link is null");
            return (Criteria) this;
        }

        public Criteria andActionLinkIsNotNull() {
            addCriterion("action_link is not null");
            return (Criteria) this;
        }

        public Criteria andActionLinkEqualTo(String value) {
            addCriterion("action_link =", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkNotEqualTo(String value) {
            addCriterion("action_link <>", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkGreaterThan(String value) {
            addCriterion("action_link >", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkGreaterThanOrEqualTo(String value) {
            addCriterion("action_link >=", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkLessThan(String value) {
            addCriterion("action_link <", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkLessThanOrEqualTo(String value) {
            addCriterion("action_link <=", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkLike(String value) {
            addCriterion("action_link like", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkNotLike(String value) {
            addCriterion("action_link not like", value, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkIn(List<String> values) {
            addCriterion("action_link in", values, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkNotIn(List<String> values) {
            addCriterion("action_link not in", values, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkBetween(String value1, String value2) {
            addCriterion("action_link between", value1, value2, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionLinkNotBetween(String value1, String value2) {
            addCriterion("action_link not between", value1, value2, "actionLink");
            return (Criteria) this;
        }

        public Criteria andActionOrderIsNull() {
            addCriterion("action_order is null");
            return (Criteria) this;
        }

        public Criteria andActionOrderIsNotNull() {
            addCriterion("action_order is not null");
            return (Criteria) this;
        }

        public Criteria andActionOrderEqualTo(Integer value) {
            addCriterion("action_order =", value, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderNotEqualTo(Integer value) {
            addCriterion("action_order <>", value, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderGreaterThan(Integer value) {
            addCriterion("action_order >", value, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_order >=", value, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderLessThan(Integer value) {
            addCriterion("action_order <", value, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderLessThanOrEqualTo(Integer value) {
            addCriterion("action_order <=", value, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderIn(List<Integer> values) {
            addCriterion("action_order in", values, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderNotIn(List<Integer> values) {
            addCriterion("action_order not in", values, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderBetween(Integer value1, Integer value2) {
            addCriterion("action_order between", value1, value2, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("action_order not between", value1, value2, "actionOrder");
            return (Criteria) this;
        }

        public Criteria andActionParentIsNull() {
            addCriterion("action_parent is null");
            return (Criteria) this;
        }

        public Criteria andActionParentIsNotNull() {
            addCriterion("action_parent is not null");
            return (Criteria) this;
        }

        public Criteria andActionParentEqualTo(Integer value) {
            addCriterion("action_parent =", value, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentNotEqualTo(Integer value) {
            addCriterion("action_parent <>", value, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentGreaterThan(Integer value) {
            addCriterion("action_parent >", value, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_parent >=", value, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentLessThan(Integer value) {
            addCriterion("action_parent <", value, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentLessThanOrEqualTo(Integer value) {
            addCriterion("action_parent <=", value, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentIn(List<Integer> values) {
            addCriterion("action_parent in", values, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentNotIn(List<Integer> values) {
            addCriterion("action_parent not in", values, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentBetween(Integer value1, Integer value2) {
            addCriterion("action_parent between", value1, value2, "actionParent");
            return (Criteria) this;
        }

        public Criteria andActionParentNotBetween(Integer value1, Integer value2) {
            addCriterion("action_parent not between", value1, value2, "actionParent");
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