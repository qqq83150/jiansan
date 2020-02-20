package com.youzhong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andGameRoleIdIsNull() {
            addCriterion("game_role_id is null");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdIsNotNull() {
            addCriterion("game_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdEqualTo(Integer value) {
            addCriterion("game_role_id =", value, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdNotEqualTo(Integer value) {
            addCriterion("game_role_id <>", value, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdGreaterThan(Integer value) {
            addCriterion("game_role_id >", value, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_role_id >=", value, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdLessThan(Integer value) {
            addCriterion("game_role_id <", value, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_role_id <=", value, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdIn(List<Integer> values) {
            addCriterion("game_role_id in", values, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdNotIn(List<Integer> values) {
            addCriterion("game_role_id not in", values, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("game_role_id between", value1, value2, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andGameRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_role_id not between", value1, value2, "gameRoleId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdIsNull() {
            addCriterion("task_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdIsNotNull() {
            addCriterion("task_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdEqualTo(Integer value) {
            addCriterion("task_type_id =", value, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdNotEqualTo(Integer value) {
            addCriterion("task_type_id <>", value, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdGreaterThan(Integer value) {
            addCriterion("task_type_id >", value, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_type_id >=", value, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdLessThan(Integer value) {
            addCriterion("task_type_id <", value, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_type_id <=", value, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdIn(List<Integer> values) {
            addCriterion("task_type_id in", values, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdNotIn(List<Integer> values) {
            addCriterion("task_type_id not in", values, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("task_type_id between", value1, value2, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_type_id not between", value1, value2, "taskTypeId");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterionForJDBCDate("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterionForJDBCDate("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterionForJDBCDate("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdIsNull() {
            addCriterion("task_status_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdIsNotNull() {
            addCriterion("task_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdEqualTo(Integer value) {
            addCriterion("task_status_id =", value, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdNotEqualTo(Integer value) {
            addCriterion("task_status_id <>", value, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdGreaterThan(Integer value) {
            addCriterion("task_status_id >", value, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_status_id >=", value, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdLessThan(Integer value) {
            addCriterion("task_status_id <", value, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_status_id <=", value, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdIn(List<Integer> values) {
            addCriterion("task_status_id in", values, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdNotIn(List<Integer> values) {
            addCriterion("task_status_id not in", values, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("task_status_id between", value1, value2, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_status_id not between", value1, value2, "taskStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdIsNull() {
            addCriterion("pay_status_id is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdIsNotNull() {
            addCriterion("pay_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdEqualTo(Integer value) {
            addCriterion("pay_status_id =", value, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdNotEqualTo(Integer value) {
            addCriterion("pay_status_id <>", value, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdGreaterThan(Integer value) {
            addCriterion("pay_status_id >", value, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status_id >=", value, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdLessThan(Integer value) {
            addCriterion("pay_status_id <", value, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status_id <=", value, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdIn(List<Integer> values) {
            addCriterion("pay_status_id in", values, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdNotIn(List<Integer> values) {
            addCriterion("pay_status_id not in", values, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_status_id between", value1, value2, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status_id not between", value1, value2, "payStatusId");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
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