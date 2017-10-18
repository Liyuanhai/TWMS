package com.gree.twms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andProducerIsNull() {
            addCriterion("producer is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("producer is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("producer =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("producer <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("producer >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("producer >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("producer <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("producer <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("producer like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("producer not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("producer in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("producer not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("producer between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("producer not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProductiontimeIsNull() {
            addCriterion("productionTime is null");
            return (Criteria) this;
        }

        public Criteria andProductiontimeIsNotNull() {
            addCriterion("productionTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductiontimeEqualTo(Date value) {
            addCriterion("productionTime =", value, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeNotEqualTo(Date value) {
            addCriterion("productionTime <>", value, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeGreaterThan(Date value) {
            addCriterion("productionTime >", value, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("productionTime >=", value, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeLessThan(Date value) {
            addCriterion("productionTime <", value, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeLessThanOrEqualTo(Date value) {
            addCriterion("productionTime <=", value, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeIn(List<Date> values) {
            addCriterion("productionTime in", values, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeNotIn(List<Date> values) {
            addCriterion("productionTime not in", values, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeBetween(Date value1, Date value2) {
            addCriterion("productionTime between", value1, value2, "productiontime");
            return (Criteria) this;
        }

        public Criteria andProductiontimeNotBetween(Date value1, Date value2) {
            addCriterion("productionTime not between", value1, value2, "productiontime");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlIsNull() {
            addCriterion("enclosureURL is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlIsNotNull() {
            addCriterion("enclosureURL is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlEqualTo(String value) {
            addCriterion("enclosureURL =", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlNotEqualTo(String value) {
            addCriterion("enclosureURL <>", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlGreaterThan(String value) {
            addCriterion("enclosureURL >", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlGreaterThanOrEqualTo(String value) {
            addCriterion("enclosureURL >=", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlLessThan(String value) {
            addCriterion("enclosureURL <", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlLessThanOrEqualTo(String value) {
            addCriterion("enclosureURL <=", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlLike(String value) {
            addCriterion("enclosureURL like", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlNotLike(String value) {
            addCriterion("enclosureURL not like", value, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlIn(List<String> values) {
            addCriterion("enclosureURL in", values, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlNotIn(List<String> values) {
            addCriterion("enclosureURL not in", values, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlBetween(String value1, String value2) {
            addCriterion("enclosureURL between", value1, value2, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andEnclosureurlNotBetween(String value1, String value2) {
            addCriterion("enclosureURL not between", value1, value2, "enclosureurl");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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