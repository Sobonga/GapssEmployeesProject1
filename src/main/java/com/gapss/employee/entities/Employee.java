package com.gapss.employee.entities;


import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;

    @Column(name="unit")
    private String unit;

    @Column(name = "firstName")
    private String firstName;

    @Column(name="Surname")
    private String surname;

    @Column(name="jobTitle")
    private String jobTitle;

    @Column(name="employmentStatus")
    private String employmentStatus;

    @Column(name="education")
    private String education;

    @Column(name="technicalTraining")
    private String technicalTraining;

    @Column(name="softSkills")
    private String softSkills;

    public Employee(String unit, String firstName, String surname, String jobTitle, String employmentStatus, String education, String technicalTraining, String softSkills) {
        this.unit = unit;
        this.firstName = firstName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.employmentStatus = employmentStatus;
        this.education = education;
        this.technicalTraining = technicalTraining;
        this.softSkills = softSkills;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getTechnicalTraining() {
        return technicalTraining;
    }

    public void setTechnicalTraining(String technicalTraining) {
        this.technicalTraining = technicalTraining;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", unit='" + unit + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", education='" + education + '\'' +
                ", technicalTraining='" + technicalTraining + '\'' +
                ", softSkills='" + softSkills + '\'' +
                '}';
    }
}
