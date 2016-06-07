package find.your.hobby.result;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Iwan on 02.06.2016.
 */

@RestController
@RequestMapping("/answer")
public class ResultController {

    @Autowired
    @Qualifier("resultService")
    private ResultService resultService;

    private Set<Result> thisResults = new HashSet<>();

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void getAnswer(@RequestBody Set<Result> results) {
        thisResults = results;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public FullResult getResult()
    {
        return resultService.getResult(thisResults);
    }

}
