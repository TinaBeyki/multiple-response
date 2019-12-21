package ir.ansarit.entity;

import ir.ansarit.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Draft extends BaseEntity implements Serializable{

     @Column(name = "subject")
    private String unusedEmailSubject;


    public String getUnusedEmailSubject() {
        return unusedEmailSubject;
    }

    public void setUnusedEmailSubject(String unusedEmailSubject) {
        this.unusedEmailSubject = unusedEmailSubject;
    }
}
