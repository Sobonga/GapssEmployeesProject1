package com.gapss.employee.entities;

import javax.persistence.*;

@Entity
@Table(name ="skill_area")
public class SkillsArea {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "id")
        private Integer id;

        @Column(name = "advertising")
        private String advertising;

        @Column(name = "assessment")
        private String assessment;

        @Column(name = "benefits")
        private String benefits;

        @Column(name = "company_law")
        private String companyLaw;

        @Column(name = "budget")
        private String budget;

        @Column(name = "communications_strategy")
        private String commuStrategy;

        @Column(name = "labour_law")
        private String labourLaw;


        @Column(name = "events_management")
        private String eventsManagement;

        @Column(name = "external_communications")
        private String externalComm;

        @Column(name = "health_and_safety")
        private String healthAndSafety;

    @Column(name = "internal_communications")
    private String internalComm;

    @Column(name = "market_research")
    private String marketResearch;

    @Column(name = "policies_and_procedure")
    private String policyAndProcedure;

    @Column(name = "print_media")
    private String printMedia;

    @Column(name = "promotions")
    private String promos;

    @Column(name = "public_relations")
    private String publicRelations;

    @Column(name = "recruitment")
    private String recruitment;


    @Column(name = "skills_development")
    private String skillsDev;

    @Column(name = "social_networks")
    private String socialNetworks;

    @Column(name = "tax")
    private String tax;

    @Column(name = "website_design")
    private String websiteDesign;

        @Column(name = "other")
        private String other;

    public SkillsArea(String advertising, String assessment, String benefits, String companyLaw, String budget, String commuStrategy, String labourLaw, String eventsManagement, String externalComm, String healthAndSafety, String internalComm, String marketResearch, String policyAndProcedure, String printMedia, String promos, String publicRelations, String recruitment, String skillsDev, String socialNetworks, String tax, String websiteDesign, String other) {
        this.advertising = advertising;
        this.assessment = assessment;
        this.benefits = benefits;
        this.companyLaw = companyLaw;
        this.budget = budget;
        this.commuStrategy = commuStrategy;
        this.labourLaw = labourLaw;
        this.eventsManagement = eventsManagement;
        this.externalComm = externalComm;
        this.healthAndSafety = healthAndSafety;
        this.internalComm = internalComm;
        this.marketResearch = marketResearch;
        this.policyAndProcedure = policyAndProcedure;
        this.printMedia = printMedia;
        this.promos = promos;
        this.publicRelations = publicRelations;
        this.recruitment = recruitment;
        this.skillsDev = skillsDev;
        this.socialNetworks = socialNetworks;
        this.tax = tax;
        this.websiteDesign = websiteDesign;
        this.other = other;
    }

    public SkillsArea() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvertising() {
        return advertising;
    }

    public void setAdvertising(String advertising) {
        this.advertising = advertising;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getCompanyLaw() {
        return companyLaw;
    }

    public void setCompanyLaw(String companyLaw) {
        this.companyLaw = companyLaw;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getCommuStrategy() {
        return commuStrategy;
    }

    public void setCommuStrategy(String commuStrategy) {
        this.commuStrategy = commuStrategy;
    }

    public String getLabourLaw() {
        return labourLaw;
    }

    public void setLabourLaw(String labourLaw) {
        this.labourLaw = labourLaw;
    }

    public String getEventsManagement() {
        return eventsManagement;
    }

    public void setEventsManagement(String eventsManagement) {
        this.eventsManagement = eventsManagement;
    }

    public String getExternalComm() {
        return externalComm;
    }

    public void setExternalComm(String externalComm) {
        this.externalComm = externalComm;
    }

    public String getHealthAndSafety() {
        return healthAndSafety;
    }

    public void setHealthAndSafety(String healthAndSafety) {
        this.healthAndSafety = healthAndSafety;
    }

    public String getInternalComm() {
        return internalComm;
    }

    public void setInternalComm(String internalComm) {
        this.internalComm = internalComm;
    }

    public String getMarketResearch() {
        return marketResearch;
    }

    public void setMarketResearch(String marketResearch) {
        this.marketResearch = marketResearch;
    }

    public String getPolicyAndProcedure() {
        return policyAndProcedure;
    }

    public void setPolicyAndProcedure(String policyAndProcedure) {
        this.policyAndProcedure = policyAndProcedure;
    }

    public String getPrintMedia() {
        return printMedia;
    }

    public void setPrintMedia(String printMedia) {
        this.printMedia = printMedia;
    }

    public String getPromos() {
        return promos;
    }

    public void setPromos(String promos) {
        this.promos = promos;
    }

    public String getPublicRelations() {
        return publicRelations;
    }

    public void setPublicRelations(String publicRelations) {
        this.publicRelations = publicRelations;
    }

    public String getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(String recruitment) {
        this.recruitment = recruitment;
    }

    public String getSkillsDev() {
        return skillsDev;
    }

    public void setSkillsDev(String skillsDev) {
        this.skillsDev = skillsDev;
    }

    public String getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(String socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getWebsiteDesign() {
        return websiteDesign;
    }

    public void setWebsiteDesign(String websiteDesign) {
        this.websiteDesign = websiteDesign;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "SkillsArea{" +
                "id=" + id +
                ", advertising='" + advertising + '\'' +
                ", assessment='" + assessment + '\'' +
                ", benefits='" + benefits + '\'' +
                ", companyLaw='" + companyLaw + '\'' +
                ", budget='" + budget + '\'' +
                ", commuStrategy='" + commuStrategy + '\'' +
                ", labourLaw='" + labourLaw + '\'' +
                ", eventsManagement='" + eventsManagement + '\'' +
                ", externalComm='" + externalComm + '\'' +
                ", healthAndSafety='" + healthAndSafety + '\'' +
                ", internalComm='" + internalComm + '\'' +
                ", marketResearch='" + marketResearch + '\'' +
                ", policyAndProcedure='" + policyAndProcedure + '\'' +
                ", printMedia='" + printMedia + '\'' +
                ", promos='" + promos + '\'' +
                ", publicRelations='" + publicRelations + '\'' +
                ", recruitment='" + recruitment + '\'' +
                ", skillsDev='" + skillsDev + '\'' +
                ", socialNetworks='" + socialNetworks + '\'' +
                ", tax='" + tax + '\'' +
                ", websiteDesign='" + websiteDesign + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
