package find.your.hobby.category.repository;

import find.your.hobby.category.domain.Category;
import find.your.hobby.task.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Iwan on 01.06.2016.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
