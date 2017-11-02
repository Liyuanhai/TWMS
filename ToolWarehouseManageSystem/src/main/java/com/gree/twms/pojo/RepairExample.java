package com.gree.twms.pojo;

import java.util.ArrayList;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andShiftIsNull() {
            addCriterion("shift is null");
            return (Criteria) this;
        }

        public Criteria andShiftIsNotNull() {
            addCriterion("shift is not null");
            return (Criteria) this;
        }

        public Criteria andShiftEqualTo(String value) {
            addCriterion("shift =", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotEqualTo(String value) {
            addCriterion("shift <>", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftGreaterThan(String value) {
            addCriterion("shift >", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftGreaterThanOrEqualTo(String value) {
            addCriterion("shift >=", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftLessThan(String value) {
            addCriterion("shift <", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftLessThanOrEqualTo(String value) {
            addCriterion("shift <=", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftLike(String value) {
            addCriterion("shift like", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotLike(String value) {
            addCriterion("shift not like", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftIn(List<String> values) {
            addCriterion("shift in", values, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotIn(List<String> values) {
            addCriterion("shift not in", values, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftBetween(String value1, String value2) {
            addCriterion("shift between", value1, value2, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotBetween(String value1, String value2) {
            addCriterion("shift not between", value1, value2, "shift");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(String value) {
            addCriterion("sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(String value) {
            addCriterion("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(String value) {
            addCriterion("sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(String value) {
            addCriterion("sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(String value) {
            addCriterion("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLike(String value) {
            addCriterion("sendTime like", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotLike(String value) {
            addCriterion("sendTime not like", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<String> values) {
            addCriterion("sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<String> values) {
            addCriterion("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(String value1, String value2) {
            addCriterion("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(String value1, String value2) {
            addCriterion("sendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendpeopleIsNull() {
            addCriterion("sendPeople is null");
            return (Criteria) this;
        }

        public Criteria andSendpeopleIsNotNull() {
            addCriterion("sendPeople is not null");
            return (Criteria) this;
        }

        public Criteria andSendpeopleEqualTo(String value) {
            addCriterion("sendPeople =", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleNotEqualTo(String value) {
            addCriterion("sendPeople <>", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleGreaterThan(String value) {
            addCriterion("sendPeople >", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("sendPeople >=", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleLessThan(String value) {
            addCriterion("sendPeople <", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleLessThanOrEqualTo(String value) {
            addCriterion("sendPeople <=", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleLike(String value) {
            addCriterion("sendPeople like", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleNotLike(String value) {
            addCriterion("sendPeople not like", value, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleIn(List<String> values) {
            addCriterion("sendPeople in", values, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleNotIn(List<String> values) {
            addCriterion("sendPeople not in", values, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleBetween(String value1, String value2) {
            addCriterion("sendPeople between", value1, value2, "sendpeople");
            return (Criteria) this;
        }

        public Criteria andSendpeopleNotBetween(String value1, String value2) {
            addCriterion("sendPeople not between", value1, value2, "sendpeople");
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

        public Criteria andSendfaultdescriptionIsNull() {
            addCriterion("sendFaultDescription is null");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionIsNotNull() {
            addCriterion("sendFaultDescription is not null");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionEqualTo(String value) {
            addCriterion("sendFaultDescription =", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionNotEqualTo(String value) {
            addCriterion("sendFaultDescription <>", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionGreaterThan(String value) {
            addCriterion("sendFaultDescription >", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("sendFaultDescription >=", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionLessThan(String value) {
            addCriterion("sendFaultDescription <", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionLessThanOrEqualTo(String value) {
            addCriterion("sendFaultDescription <=", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionLike(String value) {
            addCriterion("sendFaultDescription like", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionNotLike(String value) {
            addCriterion("sendFaultDescription not like", value, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionIn(List<String> values) {
            addCriterion("sendFaultDescription in", values, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionNotIn(List<String> values) {
            addCriterion("sendFaultDescription not in", values, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionBetween(String value1, String value2) {
            addCriterion("sendFaultDescription between", value1, value2, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andSendfaultdescriptionNotBetween(String value1, String value2) {
            addCriterion("sendFaultDescription not between", value1, value2, "sendfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionIsNull() {
            addCriterion("repairFaultDescription is null");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionIsNotNull() {
            addCriterion("repairFaultDescription is not null");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionEqualTo(String value) {
            addCriterion("repairFaultDescription =", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionNotEqualTo(String value) {
            addCriterion("repairFaultDescription <>", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionGreaterThan(String value) {
            addCriterion("repairFaultDescription >", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("repairFaultDescription >=", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionLessThan(String value) {
            addCriterion("repairFaultDescription <", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionLessThanOrEqualTo(String value) {
            addCriterion("repairFaultDescription <=", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionLike(String value) {
            addCriterion("repairFaultDescription like", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionNotLike(String value) {
            addCriterion("repairFaultDescription not like", value, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionIn(List<String> values) {
            addCriterion("repairFaultDescription in", values, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionNotIn(List<String> values) {
            addCriterion("repairFaultDescription not in", values, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionBetween(String value1, String value2) {
            addCriterion("repairFaultDescription between", value1, value2, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andRepairfaultdescriptionNotBetween(String value1, String value2) {
            addCriterion("repairFaultDescription not between", value1, value2, "repairfaultdescription");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresIsNull() {
            addCriterion("handMeasures is null");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresIsNotNull() {
            addCriterion("handMeasures is not null");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresEqualTo(String value) {
            addCriterion("handMeasures =", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresNotEqualTo(String value) {
            addCriterion("handMeasures <>", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresGreaterThan(String value) {
            addCriterion("handMeasures >", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("handMeasures >=", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresLessThan(String value) {
            addCriterion("handMeasures <", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresLessThanOrEqualTo(String value) {
            addCriterion("handMeasures <=", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresLike(String value) {
            addCriterion("handMeasures like", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresNotLike(String value) {
            addCriterion("handMeasures not like", value, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresIn(List<String> values) {
            addCriterion("handMeasures in", values, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresNotIn(List<String> values) {
            addCriterion("handMeasures not in", values, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresBetween(String value1, String value2) {
            addCriterion("handMeasures between", value1, value2, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andHandmeasuresNotBetween(String value1, String value2) {
            addCriterion("handMeasures not between", value1, value2, "handmeasures");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleIsNull() {
            addCriterion("repairPeople is null");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleIsNotNull() {
            addCriterion("repairPeople is not null");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleEqualTo(String value) {
            addCriterion("repairPeople =", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleNotEqualTo(String value) {
            addCriterion("repairPeople <>", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleGreaterThan(String value) {
            addCriterion("repairPeople >", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("repairPeople >=", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleLessThan(String value) {
            addCriterion("repairPeople <", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleLessThanOrEqualTo(String value) {
            addCriterion("repairPeople <=", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleLike(String value) {
            addCriterion("repairPeople like", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleNotLike(String value) {
            addCriterion("repairPeople not like", value, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleIn(List<String> values) {
            addCriterion("repairPeople in", values, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleNotIn(List<String> values) {
            addCriterion("repairPeople not in", values, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleBetween(String value1, String value2) {
            addCriterion("repairPeople between", value1, value2, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andRepairpeopleNotBetween(String value1, String value2) {
            addCriterion("repairPeople not between", value1, value2, "repairpeople");
            return (Criteria) this;
        }

        public Criteria andSendmethodIsNull() {
            addCriterion("sendMethod is null");
            return (Criteria) this;
        }

        public Criteria andSendmethodIsNotNull() {
            addCriterion("sendMethod is not null");
            return (Criteria) this;
        }

        public Criteria andSendmethodEqualTo(String value) {
            addCriterion("sendMethod =", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodNotEqualTo(String value) {
            addCriterion("sendMethod <>", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodGreaterThan(String value) {
            addCriterion("sendMethod >", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodGreaterThanOrEqualTo(String value) {
            addCriterion("sendMethod >=", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodLessThan(String value) {
            addCriterion("sendMethod <", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodLessThanOrEqualTo(String value) {
            addCriterion("sendMethod <=", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodLike(String value) {
            addCriterion("sendMethod like", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodNotLike(String value) {
            addCriterion("sendMethod not like", value, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodIn(List<String> values) {
            addCriterion("sendMethod in", values, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodNotIn(List<String> values) {
            addCriterion("sendMethod not in", values, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodBetween(String value1, String value2) {
            addCriterion("sendMethod between", value1, value2, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andSendmethodNotBetween(String value1, String value2) {
            addCriterion("sendMethod not between", value1, value2, "sendmethod");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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