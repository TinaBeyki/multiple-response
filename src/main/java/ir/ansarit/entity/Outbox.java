package ir.ansarit.entity;

import ir.ansarit.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Outbox extends BaseEntity implements Serializable {


    @Column(name = "subject")
    private String sentEmailSubject;

    public String getSentEmailSubject() {
        return sentEmailSubject;
    }

    public void setSentEmailSubject(String sentEmailSubject) {
        this.sentEmailSubject = sentEmailSubject;
    }
}
