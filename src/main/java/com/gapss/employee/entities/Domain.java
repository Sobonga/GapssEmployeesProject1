package com.gapss.employee.entities;

import javax.persistence.*;

@Entity
@Table(name ="domain")
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "academic_research")
    private String academicResearch;

    @Column(name = "administration")
    private String administration;

    @Column(name = "asset_management")
    private String assetManagement;

    @Column(name = "communications")
    private String communications;

    @Column(name = "compliance")
    private String compliance;

    @Column(name = "finance")
    private String finance;

    @Column(name = "human_resources")
    private String humanResources;


    @Column(name = "marketing")
    private String marketing;

    @Column(name = "organizational_development")
    private String organizationalDevelopment;

    @Column(name = "payroll")
    private String payroll;

    @Column(name = "other")
    private String other;

    public Domain(String academicResearch, String administration, String assetManagement, String communications, String compliance, String finance, String humanResources, String marketing, String organizationalDevelopment, String payroll, String other) {
        this.academicResearch = academicResearch;
        this.administration = administration;
        this.assetManagement = assetManagement;
        this.communications = communications;
        this.compliance = compliance;
        this.finance = finance;
        this.humanResources = humanResources;
        this.marketing = marketing;
        this.organizationalDevelopment = organizationalDevelopment;
        this.payroll = payroll;
        this.other = other;
    }

    public Domain() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcademicResearch() {
        return academicResearch;
    }

    public void setAcademicResearch(String academicResearch) {
        this.academicResearch = academicResearch;
    }

    public String getAdministration() {
        return administration;
    }

    public void setAdministration(String administration) {
        this.administration = administration;
    }

    public String getAssetManagement() {
        return assetManagement;
    }

    public void setAssetManagement(String assetManagement) {
        this.assetManagement = assetManagement;
    }

    public String getCommunications() {
        return communications;
    }

    public void setCommunications(String communications) {
        this.communications = communications;
    }

    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance;
    }

    public String getHumanResources() {
        return humanResources;
    }

    public void setHumanResources(String humanResources) {
        this.humanResources = humanResources;
    }

    public String getMarketing() {
        return marketing;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    public String getOrganizationalDevelopment() {
        return organizationalDevelopment;
    }

    public void setOrganizationalDevelopment(String organizationalDevelopment) {
        this.organizationalDevelopment = organizationalDevelopment;
    }

    public String getPayroll() {
        return payroll;
    }

    public void setPayroll(String payroll) {
        this.payroll = payroll;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "id=" + id +
                ", academicResearch='" + academicResearch + '\'' +
                ", administration='" + administration + '\'' +
                ", assetManagement='" + assetManagement + '\'' +
                ", communications='" + communications + '\'' +
                ", compliance='" + compliance + '\'' +
                ", finance='" + finance + '\'' +
                ", humanResources='" + humanResources + '\'' +
                ", marketing='" + marketing + '\'' +
                ", organizationalDevelopment='" + organizationalDevelopment + '\'' +
                ", payroll='" + payroll + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
