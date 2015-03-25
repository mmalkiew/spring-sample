package pl.mmalkiew.app.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.mmalkiew.app.model.User;

/**
 * Created by mmalkiew on 2015-03-25.
 */
@Repository
@Qualifier(value = "userRepository")
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByUsername(String username);
}
