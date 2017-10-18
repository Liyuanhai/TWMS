package com.gree.twms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andPcbmodelIsNull() {
            addCriterion("PCBModel is null");
            return (Criteria) this;
        }

        public Criteria andPcbmodelIsNotNull() {
            addCriterion("PCBModel is not null");
            return (Criteria) this;
        }

        public Criteria andPcbmodelEqualTo(String value) {
            addCriterion("PCBModel =", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelNotEqualTo(String value) {
            addCriterion("PCBModel <>", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelGreaterThan(String value) {
            addCriterion("PCBModel >", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelGreaterThanOrEqualTo(String value) {
            addCriterion("PCBModel >=", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelLessThan(String value) {
            addCriterion("PCBModel <", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelLessThanOrEqualTo(String value) {
            addCriterion("PCBModel <=", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelLike(String value) {
            addCriterion("PCBModel like", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelNotLike(String value) {
            addCriterion("PCBModel not like", value, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelIn(List<String> values) {
            addCriterion("PCBModel in", values, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelNotIn(List<String> values) {
            addCriterion("PCBModel not in", values, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelBetween(String value1, String value2) {
            addCriterion("PCBModel between", value1, value2, "pcbmodel");
            return (Criteria) this;
        }

        public Criteria andPcbmodelNotBetween(String value1, String value2) {
            addCriterion("PCBModel not between", value1, value2, "pcbmodel");
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

        public Criteria andReviewtimeIsNull() {
            addCriterion("reviewTime is null");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIsNotNull() {
            addCriterion("reviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewtimeEqualTo(Date value) {
            addCriterion("reviewTime =", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotEqualTo(Date value) {
            addCriterion("reviewTime <>", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeGreaterThan(Date value) {
            addCriterion("reviewTime >", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reviewTime >=", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeLessThan(Date value) {
            addCriterion("reviewTime <", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("reviewTime <=", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIn(List<Date> values) {
            addCriterion("reviewTime in", values, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotIn(List<Date> values) {
            addCriterion("reviewTime not in", values, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeBetween(Date value1, Date value2) {
            addCriterion("reviewTime between", value1, value2, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("reviewTime not between", value1, value2, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNull() {
            addCriterion("conclusion is null");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNotNull() {
            addCriterion("conclusion is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionEqualTo(String value) {
            addCriterion("conclusion =", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotEqualTo(String value) {
            addCriterion("conclusion <>", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThan(String value) {
            addCriterion("conclusion >", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("conclusion >=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThan(String value) {
            addCriterion("conclusion <", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThanOrEqualTo(String value) {
            addCriterion("conclusion <=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLike(String value) {
            addCriterion("conclusion like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotLike(String value) {
            addCriterion("conclusion not like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionIn(List<String> values) {
            addCriterion("conclusion in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotIn(List<String> values) {
            addCriterion("conclusion not in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionBetween(String value1, String value2) {
            addCriterion("conclusion between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotBetween(String value1, String value2) {
            addCriterion("conclusion not between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andCountersignIsNull() {
            addCriterion("countersign is null");
            return (Criteria) this;
        }

        public Criteria andCountersignIsNotNull() {
            addCriterion("countersign is not null");
            return (Criteria) this;
        }

        public Criteria andCountersignEqualTo(String value) {
            addCriterion("countersign =", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignNotEqualTo(String value) {
            addCriterion("countersign <>", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignGreaterThan(String value) {
            addCriterion("countersign >", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignGreaterThanOrEqualTo(String value) {
            addCriterion("countersign >=", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignLessThan(String value) {
            addCriterion("countersign <", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignLessThanOrEqualTo(String value) {
            addCriterion("countersign <=", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignLike(String value) {
            addCriterion("countersign like", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignNotLike(String value) {
            addCriterion("countersign not like", value, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignIn(List<String> values) {
            addCriterion("countersign in", values, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignNotIn(List<String> values) {
            addCriterion("countersign not in", values, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignBetween(String value1, String value2) {
            addCriterion("countersign between", value1, value2, "countersign");
            return (Criteria) this;
        }

        public Criteria andCountersignNotBetween(String value1, String value2) {
            addCriterion("countersign not between", value1, value2, "countersign");
            return (Criteria) this;
        }

        public Criteria andExamineIsNull() {
            addCriterion("examine is null");
            return (Criteria) this;
        }

        public Criteria andExamineIsNotNull() {
            addCriterion("examine is not null");
            return (Criteria) this;
        }

        public Criteria andExamineEqualTo(String value) {
            addCriterion("examine =", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotEqualTo(String value) {
            addCriterion("examine <>", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThan(String value) {
            addCriterion("examine >", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThanOrEqualTo(String value) {
            addCriterion("examine >=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThan(String value) {
            addCriterion("examine <", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThanOrEqualTo(String value) {
            addCriterion("examine <=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLike(String value) {
            addCriterion("examine like", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotLike(String value) {
            addCriterion("examine not like", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineIn(List<String> values) {
            addCriterion("examine in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotIn(List<String> values) {
            addCriterion("examine not in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineBetween(String value1, String value2) {
            addCriterion("examine between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotBetween(String value1, String value2) {
            addCriterion("examine not between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNull() {
            addCriterion("approval is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNotNull() {
            addCriterion("approval is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalEqualTo(String value) {
            addCriterion("approval =", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotEqualTo(String value) {
            addCriterion("approval <>", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThan(String value) {
            addCriterion("approval >", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("approval >=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThan(String value) {
            addCriterion("approval <", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThanOrEqualTo(String value) {
            addCriterion("approval <=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLike(String value) {
            addCriterion("approval like", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotLike(String value) {
            addCriterion("approval not like", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalIn(List<String> values) {
            addCriterion("approval in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotIn(List<String> values) {
            addCriterion("approval not in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalBetween(String value1, String value2) {
            addCriterion("approval between", value1, value2, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotBetween(String value1, String value2) {
            addCriterion("approval not between", value1, value2, "approval");
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