package ir.ansarit.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Inbox extends BaseEntity implements Serializable {

    @Column(name = "subject")
    private String receivedEmailSubject;

    public String getReceivedEmailSubject() {
        return receivedEmailSubject;
    }

    public void setReceivedEmailSubject(String receivedEmailSubject) {
        this.receivedEmailSubject = receivedEmailSubject;
    }
}
