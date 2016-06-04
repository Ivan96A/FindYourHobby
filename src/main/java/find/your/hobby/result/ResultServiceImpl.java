package find.your.hobby.result;

import find.your.hobby.answerVariant.AnswerVariantsRepository;
import find.your.hobby.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Iwan on 02.06.2016.
 */
@Component("resultService")
public class ResultServiceImpl implements ResultService {

    @Autowired
    AnswerVariantsRepository repository;

    @Override
    public int getResult(Set<Result> results) {
        int count = 0;
        try {
            for (Result result : results) {
                if (result.getId() == repository.findOne(result.getId()).getTask().getCorrectAnswer().getId())
                    count++;
            }
        }catch (NullPointerException e) {

        }
        return count;
    }

}
