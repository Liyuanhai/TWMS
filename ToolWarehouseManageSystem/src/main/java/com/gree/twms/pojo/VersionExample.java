package com.gree.twms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VersionExample() {
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

        public Criteria andPcbidIsNull() {
            addCriterion("PCBID is null");
            return (Criteria) this;
        }

        public Criteria andPcbidIsNotNull() {
            addCriterion("PCBID is not null");
            return (Criteria) this;
        }

        public Criteria andPcbidEqualTo(String value) {
            addCriterion("PCBID =", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidNotEqualTo(String value) {
            addCriterion("PCBID <>", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidGreaterThan(String value) {
            addCriterion("PCBID >", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidGreaterThanOrEqualTo(String value) {
            addCriterion("PCBID >=", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidLessThan(String value) {
            addCriterion("PCBID <", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidLessThanOrEqualTo(String value) {
            addCriterion("PCBID <=", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidLike(String value) {
            addCriterion("PCBID like", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidNotLike(String value) {
            addCriterion("PCBID not like", value, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidIn(List<String> values) {
            addCriterion("PCBID in", values, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidNotIn(List<String> values) {
            addCriterion("PCBID not in", values, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidBetween(String value1, String value2) {
            addCriterion("PCBID between", value1, value2, "pcbid");
            return (Criteria) this;
        }

        public Criteria andPcbidNotBetween(String value1, String value2) {
            addCriterion("PCBID not between", value1, value2, "pcbid");
            return (Criteria) this;
        }

        public Criteria andOldversionIsNull() {
            addCriterion("oldVersion is null");
            return (Criteria) this;
        }

        public Criteria andOldversionIsNotNull() {
            addCriterion("oldVersion is not null");
            return (Criteria) this;
        }

        public Criteria andOldversionEqualTo(String value) {
            addCriterion("oldVersion =", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionNotEqualTo(String value) {
            addCriterion("oldVersion <>", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionGreaterThan(String value) {
            addCriterion("oldVersion >", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionGreaterThanOrEqualTo(String value) {
            addCriterion("oldVersion >=", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionLessThan(String value) {
            addCriterion("oldVersion <", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionLessThanOrEqualTo(String value) {
            addCriterion("oldVersion <=", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionLike(String value) {
            addCriterion("oldVersion like", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionNotLike(String value) {
            addCriterion("oldVersion not like", value, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionIn(List<String> values) {
            addCriterion("oldVersion in", values, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionNotIn(List<String> values) {
            addCriterion("oldVersion not in", values, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionBetween(String value1, String value2) {
            addCriterion("oldVersion between", value1, value2, "oldversion");
            return (Criteria) this;
        }

        public Criteria andOldversionNotBetween(String value1, String value2) {
            addCriterion("oldVersion not between", value1, value2, "oldversion");
            return (Criteria) this;
        }

        public Criteria andNewversionIsNull() {
            addCriterion("newVersion is null");
            return (Criteria) this;
        }

        public Criteria andNewversionIsNotNull() {
            addCriterion("newVersion is not null");
            return (Criteria) this;
        }

        public Criteria andNewversionEqualTo(String value) {
            addCriterion("newVersion =", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionNotEqualTo(String value) {
            addCriterion("newVersion <>", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionGreaterThan(String value) {
            addCriterion("newVersion >", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionGreaterThanOrEqualTo(String value) {
            addCriterion("newVersion >=", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionLessThan(String value) {
            addCriterion("newVersion <", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionLessThanOrEqualTo(String value) {
            addCriterion("newVersion <=", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionLike(String value) {
            addCriterion("newVersion like", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionNotLike(String value) {
            addCriterion("newVersion not like", value, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionIn(List<String> values) {
            addCriterion("newVersion in", values, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionNotIn(List<String> values) {
            addCriterion("newVersion not in", values, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionBetween(String value1, String value2) {
            addCriterion("newVersion between", value1, value2, "newversion");
            return (Criteria) this;
        }

        public Criteria andNewversionNotBetween(String value1, String value2) {
            addCriterion("newVersion not between", value1, value2, "newversion");
            return (Criteria) this;
        }

        public Criteria andIctchengeIsNull() {
            addCriterion("ICTChenge is null");
            return (Criteria) this;
        }

        public Criteria andIctchengeIsNotNull() {
            addCriterion("ICTChenge is not null");
            return (Criteria) this;
        }

        public Criteria andIctchengeEqualTo(String value) {
            addCriterion("ICTChenge =", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeNotEqualTo(String value) {
            addCriterion("ICTChenge <>", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeGreaterThan(String value) {
            addCriterion("ICTChenge >", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeGreaterThanOrEqualTo(String value) {
            addCriterion("ICTChenge >=", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeLessThan(String value) {
            addCriterion("ICTChenge <", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeLessThanOrEqualTo(String value) {
            addCriterion("ICTChenge <=", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeLike(String value) {
            addCriterion("ICTChenge like", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeNotLike(String value) {
            addCriterion("ICTChenge not like", value, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeIn(List<String> values) {
            addCriterion("ICTChenge in", values, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeNotIn(List<String> values) {
            addCriterion("ICTChenge not in", values, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeBetween(String value1, String value2) {
            addCriterion("ICTChenge between", value1, value2, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andIctchengeNotBetween(String value1, String value2) {
            addCriterion("ICTChenge not between", value1, value2, "ictchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeIsNull() {
            addCriterion("FCTChenge is null");
            return (Criteria) this;
        }

        public Criteria andFctchengeIsNotNull() {
            addCriterion("FCTChenge is not null");
            return (Criteria) this;
        }

        public Criteria andFctchengeEqualTo(String value) {
            addCriterion("FCTChenge =", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeNotEqualTo(String value) {
            addCriterion("FCTChenge <>", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeGreaterThan(String value) {
            addCriterion("FCTChenge >", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeGreaterThanOrEqualTo(String value) {
            addCriterion("FCTChenge >=", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeLessThan(String value) {
            addCriterion("FCTChenge <", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeLessThanOrEqualTo(String value) {
            addCriterion("FCTChenge <=", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeLike(String value) {
            addCriterion("FCTChenge like", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeNotLike(String value) {
            addCriterion("FCTChenge not like", value, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeIn(List<String> values) {
            addCriterion("FCTChenge in", values, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeNotIn(List<String> values) {
            addCriterion("FCTChenge not in", values, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeBetween(String value1, String value2) {
            addCriterion("FCTChenge between", value1, value2, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andFctchengeNotBetween(String value1, String value2) {
            addCriterion("FCTChenge not between", value1, value2, "fctchenge");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("arriveTime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("arriveTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(Date value) {
            addCriterion("arriveTime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(Date value) {
            addCriterion("arriveTime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(Date value) {
            addCriterion("arriveTime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arriveTime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(Date value) {
            addCriterion("arriveTime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(Date value) {
            addCriterion("arriveTime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<Date> values) {
            addCriterion("arriveTime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<Date> values) {
            addCriterion("arriveTime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(Date value1, Date value2) {
            addCriterion("arriveTime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(Date value1, Date value2) {
            addCriterion("arriveTime not between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andIctchengeidIsNull() {
            addCriterion("ICTChengeID is null");
            return (Criteria) this;
        }

        public Criteria andIctchengeidIsNotNull() {
            addCriterion("ICTChengeID is not null");
            return (Criteria) this;
        }

        public Criteria andIctchengeidEqualTo(String value) {
            addCriterion("ICTChengeID =", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidNotEqualTo(String value) {
            addCriterion("ICTChengeID <>", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidGreaterThan(String value) {
            addCriterion("ICTChengeID >", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidGreaterThanOrEqualTo(String value) {
            addCriterion("ICTChengeID >=", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidLessThan(String value) {
            addCriterion("ICTChengeID <", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidLessThanOrEqualTo(String value) {
            addCriterion("ICTChengeID <=", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidLike(String value) {
            addCriterion("ICTChengeID like", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidNotLike(String value) {
            addCriterion("ICTChengeID not like", value, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidIn(List<String> values) {
            addCriterion("ICTChengeID in", values, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidNotIn(List<String> values) {
            addCriterion("ICTChengeID not in", values, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidBetween(String value1, String value2) {
            addCriterion("ICTChengeID between", value1, value2, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andIctchengeidNotBetween(String value1, String value2) {
            addCriterion("ICTChengeID not between", value1, value2, "ictchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidIsNull() {
            addCriterion("FCTChengeID is null");
            return (Criteria) this;
        }

        public Criteria andFctchengeidIsNotNull() {
            addCriterion("FCTChengeID is not null");
            return (Criteria) this;
        }

        public Criteria andFctchengeidEqualTo(String value) {
            addCriterion("FCTChengeID =", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidNotEqualTo(String value) {
            addCriterion("FCTChengeID <>", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidGreaterThan(String value) {
            addCriterion("FCTChengeID >", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidGreaterThanOrEqualTo(String value) {
            addCriterion("FCTChengeID >=", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidLessThan(String value) {
            addCriterion("FCTChengeID <", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidLessThanOrEqualTo(String value) {
            addCriterion("FCTChengeID <=", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidLike(String value) {
            addCriterion("FCTChengeID like", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidNotLike(String value) {
            addCriterion("FCTChengeID not like", value, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidIn(List<String> values) {
            addCriterion("FCTChengeID in", values, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidNotIn(List<String> values) {
            addCriterion("FCTChengeID not in", values, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidBetween(String value1, String value2) {
            addCriterion("FCTChengeID between", value1, value2, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andFctchengeidNotBetween(String value1, String value2) {
            addCriterion("FCTChengeID not between", value1, value2, "fctchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidIsNull() {
            addCriterion("OTFChengeID is null");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidIsNotNull() {
            addCriterion("OTFChengeID is not null");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidEqualTo(String value) {
            addCriterion("OTFChengeID =", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidNotEqualTo(String value) {
            addCriterion("OTFChengeID <>", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidGreaterThan(String value) {
            addCriterion("OTFChengeID >", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidGreaterThanOrEqualTo(String value) {
            addCriterion("OTFChengeID >=", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidLessThan(String value) {
            addCriterion("OTFChengeID <", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidLessThanOrEqualTo(String value) {
            addCriterion("OTFChengeID <=", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidLike(String value) {
            addCriterion("OTFChengeID like", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidNotLike(String value) {
            addCriterion("OTFChengeID not like", value, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidIn(List<String> values) {
            addCriterion("OTFChengeID in", values, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidNotIn(List<String> values) {
            addCriterion("OTFChengeID not in", values, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidBetween(String value1, String value2) {
            addCriterion("OTFChengeID between", value1, value2, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andOtfchengeidNotBetween(String value1, String value2) {
            addCriterion("OTFChengeID not between", value1, value2, "otfchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidIsNull() {
            addCriterion("ICFTChengeID is null");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidIsNotNull() {
            addCriterion("ICFTChengeID is not null");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidEqualTo(String value) {
            addCriterion("ICFTChengeID =", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidNotEqualTo(String value) {
            addCriterion("ICFTChengeID <>", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidGreaterThan(String value) {
            addCriterion("ICFTChengeID >", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidGreaterThanOrEqualTo(String value) {
            addCriterion("ICFTChengeID >=", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidLessThan(String value) {
            addCriterion("ICFTChengeID <", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidLessThanOrEqualTo(String value) {
            addCriterion("ICFTChengeID <=", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidLike(String value) {
            addCriterion("ICFTChengeID like", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidNotLike(String value) {
            addCriterion("ICFTChengeID not like", value, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidIn(List<String> values) {
            addCriterion("ICFTChengeID in", values, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidNotIn(List<String> values) {
            addCriterion("ICFTChengeID not in", values, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidBetween(String value1, String value2) {
            addCriterion("ICFTChengeID between", value1, value2, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andIcftchengeidNotBetween(String value1, String value2) {
            addCriterion("ICFTChengeID not between", value1, value2, "icftchengeid");
            return (Criteria) this;
        }

        public Criteria andChengetimeIsNull() {
            addCriterion("chengeTime is null");
            return (Criteria) this;
        }

        public Criteria andChengetimeIsNotNull() {
            addCriterion("chengeTime is not null");
            return (Criteria) this;
        }

        public Criteria andChengetimeEqualTo(Date value) {
            addCriterion("chengeTime =", value, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeNotEqualTo(Date value) {
            addCriterion("chengeTime <>", value, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeGreaterThan(Date value) {
            addCriterion("chengeTime >", value, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chengeTime >=", value, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeLessThan(Date value) {
            addCriterion("chengeTime <", value, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeLessThanOrEqualTo(Date value) {
            addCriterion("chengeTime <=", value, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeIn(List<Date> values) {
            addCriterion("chengeTime in", values, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeNotIn(List<Date> values) {
            addCriterion("chengeTime not in", values, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeBetween(Date value1, Date value2) {
            addCriterion("chengeTime between", value1, value2, "chengetime");
            return (Criteria) this;
        }

        public Criteria andChengetimeNotBetween(Date value1, Date value2) {
            addCriterion("chengeTime not between", value1, value2, "chengetime");
            return (Criteria) this;
        }

        public Criteria andCompletionIsNull() {
            addCriterion("completion is null");
            return (Criteria) this;
        }

        public Criteria andCompletionIsNotNull() {
            addCriterion("completion is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionEqualTo(String value) {
            addCriterion("completion =", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotEqualTo(String value) {
            addCriterion("completion <>", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionGreaterThan(String value) {
            addCriterion("completion >", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionGreaterThanOrEqualTo(String value) {
            addCriterion("completion >=", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLessThan(String value) {
            addCriterion("completion <", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLessThanOrEqualTo(String value) {
            addCriterion("completion <=", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLike(String value) {
            addCriterion("completion like", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotLike(String value) {
            addCriterion("completion not like", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionIn(List<String> values) {
            addCriterion("completion in", values, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotIn(List<String> values) {
            addCriterion("completion not in", values, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionBetween(String value1, String value2) {
            addCriterion("completion between", value1, value2, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotBetween(String value1, String value2) {
            addCriterion("completion not between", value1, value2, "completion");
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