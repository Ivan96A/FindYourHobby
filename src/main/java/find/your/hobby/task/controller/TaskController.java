package find.your.hobby.task.controller;

import find.your.hobby.task.domain.Task;
import find.your.hobby.task.repository.TaskRepository;
import find.your.hobby.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashSet;
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

    private Set<String> result = new HashSet<>();

    @Autowired
    private TaskRepository taskRepository;

   @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Task getOne(@PathVariable Long id) {
        return taskService.getOne(id);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void getId(@RequestBody Set<String> category) {
        result = category;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Task> getId() {
      return taskService.getTasksId(result);
    }



}
