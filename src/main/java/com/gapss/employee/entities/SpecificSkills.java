package com.gapss.employee.entities;

import javax.persistence.*;

@Entity
@Table(name ="domain")
public class SpecificSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "advert_response_handling")
    private String adResponseHandling;

    @Column(name = "ccma_protocol")
    private String ccmaProtocol;

    @Column(name = "contracts")
    private String contracts;

    @Column(name = "database_management")
    private String databaseManagement;

    @Column(name = "industry_remuneration_analysis")
    private String industryRemunerationAnalysis;

    @Column(name = "Interviewing")
    private String interviewing;

    @Column(name = "job_analysis")
    private String jobAnalysis;


    @Column(name = "leave_administration")
    private String leaveAdmin;

    @Column(name = "managing_programmes")
    private String managingProgrames;

    @Column(name = "offers")
    private String offers;

    @Column(name = "org_structure")
    private String orgStructure;

    @Column(name = "reference_checking")
    private String referenceChecking;

    @Column(name = "screening_responses")
    private String screeningResponse;

    @Column(name = "surveys")
    private String surveys;

    public SpecificSkills(String adResponseHandling, String ccmaProtocol, String contracts, String databaseManagement, String industryRemunerationAnalysis, String interviewing, String jobAnalysis, String leaveAdmin, String managingProgrames, String offers, String orgStructure, String referenceChecking, String screeningResponse, String surveys) {
        this.adResponseHandling = adResponseHandling;
        this.ccmaProtocol = ccmaProtocol;
        this.contracts = contracts;
        this.databaseManagement = databaseManagement;
        this.industryRemunerationAnalysis = industryRemunerationAnalysis;
        this.interviewing = interviewing;
        this.jobAnalysis = jobAnalysis;
        this.leaveAdmin = leaveAdmin;
        this.managingProgrames = managingProgrames;
        this.offers = offers;
        this.orgStructure = orgStructure;
        this.referenceChecking = referenceChecking;
        this.screeningResponse = screeningResponse;
        this.surveys = surveys;
    }

    public SpecificSkills() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdResponseHandling() {
        return adResponseHandling;
    }

    public void setAdResponseHandling(String adResponseHandling) {
        this.adResponseHandling = adResponseHandling;
    }

    public String getCcmaProtocol() {
        return ccmaProtocol;
    }

    public void setCcmaProtocol(String ccmaProtocol) {
        this.ccmaProtocol = ccmaProtocol;
    }

    public String getContracts() {
        return contracts;
    }

    public void setContracts(String contracts) {
        this.contracts = contracts;
    }

    public String getDatabaseManagement() {
        return databaseManagement;
    }

    public void setDatabaseManagement(String databaseManagement) {
        this.databaseManagement = databaseManagement;
    }

    public String getIndustryRemunerationAnalysis() {
        return industryRemunerationAnalysis;
    }

    public void setIndustryRemunerationAnalysis(String industryRemunerationAnalysis) {
        this.industryRemunerationAnalysis = industryRemunerationAnalysis;
    }

    public String getInterviewing() {
        return interviewing;
    }

    public void setInterviewing(String interviewing) {
        this.interviewing = interviewing;
    }

    public String getJobAnalysis() {
        return jobAnalysis;
    }

    public void setJobAnalysis(String jobAnalysis) {
        this.jobAnalysis = jobAnalysis;
    }

    public String getLeaveAdmin() {
        return leaveAdmin;
    }

    public void setLeaveAdmin(String leaveAdmin) {
        this.leaveAdmin = leaveAdmin;
    }

    public String getManagingProgrames() {
        return managingProgrames;
    }

    public void setManagingProgrames(String managingProgrames) {
        this.managingProgrames = managingProgrames;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getOrgStructure() {
        return orgStructure;
    }

    public void setOrgStructure(String orgStructure) {
        this.orgStructure = orgStructure;
    }

    public String getReferenceChecking() {
        return referenceChecking;
    }

    public void setReferenceChecking(String referenceChecking) {
        this.referenceChecking = referenceChecking;
    }

    public String getScreeningResponse() {
        return screeningResponse;
    }

    public void setScreeningResponse(String screeningResponse) {
        this.screeningResponse = screeningResponse;
    }

    public String getSurveys() {
        return surveys;
    }

    public void setSurveys(String surveys) {
        this.surveys = surveys;
    }

    @Override
    public String toString() {
        return "SpecificSkills{" +
                "id=" + id +
                ", adResponseHandling='" + adResponseHandling + '\'' +
                ", ccmaProtocol='" + ccmaProtocol + '\'' +
                ", contracts='" + contracts + '\'' +
                ", databaseManagement='" + databaseManagement + '\'' +
                ", industryRemunerationAnalysis='" + industryRemunerationAnalysis + '\'' +
                ", interviewing='" + interviewing + '\'' +
                ", jobAnalysis='" + jobAnalysis + '\'' +
                ", leaveAdmin='" + leaveAdmin + '\'' +
                ", managingProgrames='" + managingProgrames + '\'' +
                ", offers='" + offers + '\'' +
                ", orgStructure='" + orgStructure + '\'' +
                ", referenceChecking='" + referenceChecking + '\'' +
                ", screeningResponse='" + screeningResponse + '\'' +
                ", surveys='" + surveys + '\'' +
                '}';
    }
}
