package find.your.hobby.task.controller;

import find.your.hobby.task.domain.Task;
import find.your.hobby.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Iwan on 13.05.2016.
 */

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    @Qualifier("taskService")
    private TaskService taskService;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Task getTaskById(@PathVariable Long id) {
        return taskService.findById(id);
    }

}
