package find.your.hobby.task.controller;

import find.your.hobby.task.domain.Task;
import find.your.hobby.task.repository.TaskRepository;
import find.your.hobby.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * Created by Iwan on 13.05.2016.
 */

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    @Qualifier("taskService")
    private TaskService taskService;

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Task> getTaskById() {
        return taskRepository.findAll();
    }


    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Task getOne(@PathVariable Long id) {
        return taskRepository.findOne(id);
    }

}
