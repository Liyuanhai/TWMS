package com.gree.twms.pojo;

import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("tID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tID like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tID not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tName is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tName is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tName =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tName <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tName >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tName >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tName <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tName <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tName like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tName not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tName in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tName not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tName between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tName not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTmodelIsNull() {
            addCriterion("tModel is null");
            return (Criteria) this;
        }

        public Criteria andTmodelIsNotNull() {
            addCriterion("tModel is not null");
            return (Criteria) this;
        }

        public Criteria andTmodelEqualTo(String value) {
            addCriterion("tModel =", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelNotEqualTo(String value) {
            addCriterion("tModel <>", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelGreaterThan(String value) {
            addCriterion("tModel >", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelGreaterThanOrEqualTo(String value) {
            addCriterion("tModel >=", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelLessThan(String value) {
            addCriterion("tModel <", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelLessThanOrEqualTo(String value) {
            addCriterion("tModel <=", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelLike(String value) {
            addCriterion("tModel like", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelNotLike(String value) {
            addCriterion("tModel not like", value, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelIn(List<String> values) {
            addCriterion("tModel in", values, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelNotIn(List<String> values) {
            addCriterion("tModel not in", values, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelBetween(String value1, String value2) {
            addCriterion("tModel between", value1, value2, "tmodel");
            return (Criteria) this;
        }

        public Criteria andTmodelNotBetween(String value1, String value2) {
            addCriterion("tModel not between", value1, value2, "tmodel");
            return (Criteria) this;
        }

        public Criteria andVersionnumIsNull() {
            addCriterion("versionNum is null");
            return (Criteria) this;
        }

        public Criteria andVersionnumIsNotNull() {
            addCriterion("versionNum is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnumEqualTo(String value) {
            addCriterion("versionNum =", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumNotEqualTo(String value) {
            addCriterion("versionNum <>", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumGreaterThan(String value) {
            addCriterion("versionNum >", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumGreaterThanOrEqualTo(String value) {
            addCriterion("versionNum >=", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumLessThan(String value) {
            addCriterion("versionNum <", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumLessThanOrEqualTo(String value) {
            addCriterion("versionNum <=", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumLike(String value) {
            addCriterion("versionNum like", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumNotLike(String value) {
            addCriterion("versionNum not like", value, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumIn(List<String> values) {
            addCriterion("versionNum in", values, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumNotIn(List<String> values) {
            addCriterion("versionNum not in", values, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumBetween(String value1, String value2) {
            addCriterion("versionNum between", value1, value2, "versionnum");
            return (Criteria) this;
        }

        public Criteria andVersionnumNotBetween(String value1, String value2) {
            addCriterion("versionNum not between", value1, value2, "versionnum");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("team like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("team not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pName is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pName is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pName =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pName <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pName >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pName >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pName <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pName <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pName like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pName not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pName in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pName not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pName between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pName not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("returnTime is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("returnTime is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(String value) {
            addCriterion("returnTime =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(String value) {
            addCriterion("returnTime <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(String value) {
            addCriterion("returnTime >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(String value) {
            addCriterion("returnTime >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(String value) {
            addCriterion("returnTime <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(String value) {
            addCriterion("returnTime <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLike(String value) {
            addCriterion("returnTime like", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotLike(String value) {
            addCriterion("returnTime not like", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<String> values) {
            addCriterion("returnTime in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<String> values) {
            addCriterion("returnTime not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(String value1, String value2) {
            addCriterion("returnTime between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(String value1, String value2) {
            addCriterion("returnTime not between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeIsNull() {
            addCriterion("borrowTime is null");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeIsNotNull() {
            addCriterion("borrowTime is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeEqualTo(String value) {
            addCriterion("borrowTime =", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeNotEqualTo(String value) {
            addCriterion("borrowTime <>", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeGreaterThan(String value) {
            addCriterion("borrowTime >", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeGreaterThanOrEqualTo(String value) {
            addCriterion("borrowTime >=", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeLessThan(String value) {
            addCriterion("borrowTime <", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeLessThanOrEqualTo(String value) {
            addCriterion("borrowTime <=", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeLike(String value) {
            addCriterion("borrowTime like", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeNotLike(String value) {
            addCriterion("borrowTime not like", value, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeIn(List<String> values) {
            addCriterion("borrowTime in", values, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeNotIn(List<String> values) {
            addCriterion("borrowTime not in", values, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeBetween(String value1, String value2) {
            addCriterion("borrowTime between", value1, value2, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andBorrowtimeNotBetween(String value1, String value2) {
            addCriterion("borrowTime not between", value1, value2, "borrowtime");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNull() {
            addCriterion("remarks1 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNotNull() {
            addCriterion("remarks1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks1EqualTo(String value) {
            addCriterion("remarks1 =", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotEqualTo(String value) {
            addCriterion("remarks1 <>", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThan(String value) {
            addCriterion("remarks1 >", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThanOrEqualTo(String value) {
            addCriterion("remarks1 >=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThan(String value) {
            addCriterion("remarks1 <", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThanOrEqualTo(String value) {
            addCriterion("remarks1 <=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Like(String value) {
            addCriterion("remarks1 like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotLike(String value) {
            addCriterion("remarks1 not like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1In(List<String> values) {
            addCriterion("remarks1 in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotIn(List<String> values) {
            addCriterion("remarks1 not in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Between(String value1, String value2) {
            addCriterion("remarks1 between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotBetween(String value1, String value2) {
            addCriterion("remarks1 not between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks2IsNull() {
            addCriterion("remarks2 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks2IsNotNull() {
            addCriterion("remarks2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks2EqualTo(String value) {
            addCriterion("remarks2 =", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotEqualTo(String value) {
            addCriterion("remarks2 <>", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2GreaterThan(String value) {
            addCriterion("remarks2 >", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2GreaterThanOrEqualTo(String value) {
            addCriterion("remarks2 >=", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2LessThan(String value) {
            addCriterion("remarks2 <", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2LessThanOrEqualTo(String value) {
            addCriterion("remarks2 <=", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2Like(String value) {
            addCriterion("remarks2 like", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotLike(String value) {
            addCriterion("remarks2 not like", value, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2In(List<String> values) {
            addCriterion("remarks2 in", values, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotIn(List<String> values) {
            addCriterion("remarks2 not in", values, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2Between(String value1, String value2) {
            addCriterion("remarks2 between", value1, value2, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks2NotBetween(String value1, String value2) {
            addCriterion("remarks2 not between", value1, value2, "remarks2");
            return (Criteria) this;
        }

        public Criteria andRemarks3IsNull() {
            addCriterion("remarks3 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks3IsNotNull() {
            addCriterion("remarks3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks3EqualTo(String value) {
            addCriterion("remarks3 =", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotEqualTo(String value) {
            addCriterion("remarks3 <>", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3GreaterThan(String value) {
            addCriterion("remarks3 >", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3GreaterThanOrEqualTo(String value) {
            addCriterion("remarks3 >=", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3LessThan(String value) {
            addCriterion("remarks3 <", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3LessThanOrEqualTo(String value) {
            addCriterion("remarks3 <=", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3Like(String value) {
            addCriterion("remarks3 like", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotLike(String value) {
            addCriterion("remarks3 not like", value, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3In(List<String> values) {
            addCriterion("remarks3 in", values, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotIn(List<String> values) {
            addCriterion("remarks3 not in", values, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3Between(String value1, String value2) {
            addCriterion("remarks3 between", value1, value2, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks3NotBetween(String value1, String value2) {
            addCriterion("remarks3 not between", value1, value2, "remarks3");
            return (Criteria) this;
        }

        public Criteria andRemarks4IsNull() {
            addCriterion("remarks4 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks4IsNotNull() {
            addCriterion("remarks4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks4EqualTo(String value) {
            addCriterion("remarks4 =", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotEqualTo(String value) {
            addCriterion("remarks4 <>", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4GreaterThan(String value) {
            addCriterion("remarks4 >", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4GreaterThanOrEqualTo(String value) {
            addCriterion("remarks4 >=", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4LessThan(String value) {
            addCriterion("remarks4 <", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4LessThanOrEqualTo(String value) {
            addCriterion("remarks4 <=", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4Like(String value) {
            addCriterion("remarks4 like", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotLike(String value) {
            addCriterion("remarks4 not like", value, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4In(List<String> values) {
            addCriterion("remarks4 in", values, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotIn(List<String> values) {
            addCriterion("remarks4 not in", values, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4Between(String value1, String value2) {
            addCriterion("remarks4 between", value1, value2, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks4NotBetween(String value1, String value2) {
            addCriterion("remarks4 not between", value1, value2, "remarks4");
            return (Criteria) this;
        }

        public Criteria andRemarks5IsNull() {
            addCriterion("remarks5 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks5IsNotNull() {
            addCriterion("remarks5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks5EqualTo(String value) {
            addCriterion("remarks5 =", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotEqualTo(String value) {
            addCriterion("remarks5 <>", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5GreaterThan(String value) {
            addCriterion("remarks5 >", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5GreaterThanOrEqualTo(String value) {
            addCriterion("remarks5 >=", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5LessThan(String value) {
            addCriterion("remarks5 <", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5LessThanOrEqualTo(String value) {
            addCriterion("remarks5 <=", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5Like(String value) {
            addCriterion("remarks5 like", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotLike(String value) {
            addCriterion("remarks5 not like", value, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5In(List<String> values) {
            addCriterion("remarks5 in", values, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotIn(List<String> values) {
            addCriterion("remarks5 not in", values, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5Between(String value1, String value2) {
            addCriterion("remarks5 between", value1, value2, "remarks5");
            return (Criteria) this;
        }

        public Criteria andRemarks5NotBetween(String value1, String value2) {
            addCriterion("remarks5 not between", value1, value2, "remarks5");
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