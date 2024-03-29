package ir.ansarit;

import ir.ansarit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);
}
