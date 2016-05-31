package find.your.hobby.task.service.impl;

import find.your.hobby.task.domain.Task;
import find.your.hobby.task.repository.TaskRepository;
import find.your.hobby.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Iwan on 13.05.2016.
 */
@Component("taskService")
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task getOne(Long id) {

        return taskRepository.findOne(id);
    }

}
