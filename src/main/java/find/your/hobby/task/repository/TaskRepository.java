package find.your.hobby.task.repository;

import find.your.hobby.category.domain.Category;
import find.your.hobby.task.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

/**
 * Created by Iwan on 13.05.2016.
 */
public interface TaskRepository  extends JpaRepository<Task, Long> {

    @Query("select t from Task t where t.category.category = :category group by rand()")
    Set<Task> getTasksId(@Param("category")Category.HobbyType category);

}
