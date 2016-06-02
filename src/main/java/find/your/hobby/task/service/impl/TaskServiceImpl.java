package find.your.hobby.task.service.impl;

import find.your.hobby.category.domain.Category;
import find.your.hobby.task.domain.Task;
import find.your.hobby.task.repository.TaskRepository;
import find.your.hobby.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOError;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Iwan on 13.05.2016.
 */
@Component("taskService")
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    private Set<Task> tasks = new HashSet<>();

    private Set<Task> fiveTasks = new HashSet<>();

    @Override
    public Task getOne(Long id) {

        return taskRepository.findOne(id);
    }

    @Override
    public Set<Task> getTasksId(Set<String> categories) {

        try {
            for(String category : categories) {
                Category.HobbyType type = Category.HobbyType.valueOf(category.toUpperCase());
                tasks = taskRepository.getTasksId(type);
                int i = 1;
                for (Task task : tasks) {
                    fiveTasks.add(task);
                    if (i == 5) break;
                    i++;
                }
                i = 1;
                tasks.clear();
            }

        }catch (NullPointerException e) {

        }
        return fiveTasks;
    }
}
