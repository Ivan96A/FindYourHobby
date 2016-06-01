package find.your.hobby.task.service;

import find.your.hobby.task.domain.Task;

import java.util.List;
import java.util.Set;

/**
 * Created by Iwan on 13.05.2016.
 */
public interface TaskService {

     Task getOne(Long id);

     Set<Long> getTasksId(Set<String> categories);
}
