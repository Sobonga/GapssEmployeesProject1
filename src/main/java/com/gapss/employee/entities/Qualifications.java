package com.gapss.employee.entities;

import javax.persistence.*;

@Entity
@Table(name = "qualifications")
public class Qualifications {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "employment_status")
    private String employmentStatus;

    @Column(name = "matric")
    private Boolean matric;

    @Column(name = "certification")
    private String certificates;

    @Column(name = "diploma")
    private String diploma;

    @Column(name="degree")
    private String degree;

    @Column(name="post_graduate")
    private String postGraduate;

    public Qualifications(String employmentStatus, Boolean matric, String certificates, String diploma, String degree, String postGraduate) {
        this.employmentStatus = employmentStatus;
        this.matric = matric;
        this.certificates = certificates;
        this.diploma = diploma;
        this.degree = degree;
        this.postGraduate = postGraduate;
    }

    public Qualifications() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Boolean getMatric() {
        return matric;
    }

    public void setMatric(Boolean matric) {
        this.matric = matric;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPostGraduate() {
        return postGraduate;
    }

    public void setPostGraduate(String postGraduate) {
        this.postGraduate = postGraduate;
    }

    @Override
    public String toString() {
        return "Qualifications{" +
                "id=" + id +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", matric=" + matric +
                ", certificates='" + certificates + '\'' +
                ", diploma='" + diploma + '\'' +
                ", degree='" + degree + '\'' +
                ", postGraduate='" + postGraduate + '\'' +
                '}';
    }
}
