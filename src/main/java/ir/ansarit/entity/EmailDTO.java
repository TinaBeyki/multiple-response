package ir.ansarit.entity;

import ir.ansarit.projection.DraftProjection;
import ir.ansarit.projection.InboxProjection;
import ir.ansarit.projection.OutboxProjection;

import java.util.ArrayList;
import java.util.List;

public class EmailDTO {

    private String username;
    private String password;

   /* List<Inbox> inboxList  = new ArrayList<Inbox>();
    List<Outbox> outboxList  = new ArrayList<Outbox>();
    List<Draft> draftList  = new ArrayList<Draft>();*/

   List<InboxProjection> inboxList = new ArrayList<InboxProjection>();
   List<OutboxProjection> outboxList = new ArrayList<OutboxProjection>();
   List<DraftProjection> draftList = new ArrayList<DraftProjection>();


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   /* public List<Inbox> getInboxList() {
        return inboxList;
    }

    public void setInboxList(List<Inbox> inboxList) {
        this.inboxList = inboxList;
    }

    public List<Outbox> getOutboxList() {
        return outboxList;
    }

    public void setOutboxList(List<Outbox> outboxList) {
        this.outboxList = outboxList;
    }

    public List<Draft> getDraftList() {
        return draftList;
    }

    public void setDraftList(List<Draft> draftList) {
        this.draftList = draftList;
    }*/

    public void setInboxList(List<InboxProjection> inboxList) {
        this.inboxList = inboxList;
    }

    public void setOutboxList(List<OutboxProjection> outboxList) {
        this.outboxList = outboxList;
    }

    public void setDraftList(List<DraftProjection> draftList) {
        this.draftList = draftList;
    }

    public List<InboxProjection> getInboxList() {
        return inboxList;
    }

    public List<OutboxProjection> getOutboxList() {
        return outboxList;
    }

    public List<DraftProjection> getDraftList() {
        return draftList;
    }
}
