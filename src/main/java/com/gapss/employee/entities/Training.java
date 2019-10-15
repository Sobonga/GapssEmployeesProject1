package com.gapss.employee.entities;

import javax.persistence.*;

@Entity
@Table(name="Training")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;

    @Column(name = "technical_training")
    private String technicalTraining;

    @Column(name = "soft_skill")
    private String softSkill;

    public Training(String technicalTraining, String softSkill) {
        this.technicalTraining = technicalTraining;
        this.softSkill = softSkill;
    }

    public Training(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTechnicalTraining() {
        return technicalTraining;
    }

    public void setTechnicalTraining(String technicalTraining) {
        this.technicalTraining = technicalTraining;
    }

    public String getSoftSkill() {
        return softSkill;
    }

    public void setSoftSkill(String softSkill) {
        this.softSkill = softSkill;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", technicalTraining='" + technicalTraining + '\'' +
                ", softSkill='" + softSkill + '\'' +
                '}';
    }
}
