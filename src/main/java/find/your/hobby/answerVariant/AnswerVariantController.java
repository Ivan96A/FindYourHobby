package find.your.hobby.answerVariant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.util.List;

/**
 * Created by Iwan on 01.06.2016.
 */
@RestController
@RequestMapping("/answerVariant")
public class AnswerVariantController {

    @Autowired
    AnswerVariantsRepository answerVariantsRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<AnswerVariant> getAll() {
        return answerVariantsRepository.findAll();
    }

}
