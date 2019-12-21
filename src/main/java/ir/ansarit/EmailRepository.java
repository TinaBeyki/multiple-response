package ir.ansarit;

import ir.ansarit.entity.BaseEntity;
import ir.ansarit.entity.Draft;
import ir.ansarit.entity.Inbox;
import ir.ansarit.entity.Outbox;
import ir.ansarit.projection.DraftProjection;
import ir.ansarit.projection.InboxProjection;
import ir.ansarit.projection.OutboxProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmailRepository extends JpaRepository<BaseEntity, Integer> {

    @Query(value = "select subject from Inbox", nativeQuery = true)
    List<InboxProjection> findInboxList();

    @Query(value = "select subject from Outbox", nativeQuery = true)
    List<OutboxProjection> findOutboxList();

    @Query(value = "select subject from Draft", nativeQuery = true)
    List<DraftProjection> findDraftList();

  /*@Query(value = "select i from Inbox i ")
    List<Inbox> findInboxList();

    @Query(value = "select o from Outbox o")
    List<Outbox> findOutboxList();

    @Query(value = "select d from Draft d")
    List<Draft> findDraftList();
*/

}
