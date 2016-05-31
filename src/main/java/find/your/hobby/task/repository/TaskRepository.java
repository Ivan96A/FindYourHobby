package find.your.hobby.task.repository;

import find.your.hobby.task.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Iwan on 13.05.2016.
 */
public interface TaskRepository  extends JpaRepository<Task, Long> {

}
