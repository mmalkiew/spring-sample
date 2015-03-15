package mmalkiew.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mmalkiew on 2015-03-15.
 */
@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {
}
