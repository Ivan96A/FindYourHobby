package find.your.hobby.result;

import find.your.hobby.answerVariant.AnswerVariantsRepository;
import find.your.hobby.category.domain.Category;
import find.your.hobby.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Iwan on 02.06.2016.
 */
@Component("resultService")
public class ResultServiceImpl implements ResultService {

    @Autowired
    AnswerVariantsRepository repository;

    @Override
    public FullResult getResult(Set<Result> results) {

        FullResult fullResult = new FullResult();
        Set<ClientResult> clientResult = new HashSet<>();
        List<Long> countByNameCategory = new LinkedList<>();
        Set<String> nameCategory = new HashSet<>();
        try {
            int count = 0;
            for (Result result : results) {
                for (String name : nameCategory) {
                    count = 0;
                    Category.HobbyType type = null;
                    type = Category.HobbyType.valueOf(name.toUpperCase());
                    if (repository.findOne(result.getId()).getTask().getCategory().getCategory() == type) count++;
                }
                if (count == 0)
                    nameCategory.add(repository.findOne(result.getId()).getTask().getCategory().getCategory().name());
            }

            int countTrue;
            for (String name : nameCategory) {
                countTrue = 0;
                for (Result result : results) {
                    if ((result.getId() == repository.findOne(result.getId()).getTask().getCorrectAnswer().getId()) &&
                            (repository.findOne(result.getId()).getTask().getCategory().getCategory().name().equals(name)))
                        countTrue++;
                }
                countByNameCategory.add((Long) new Long(countTrue));
            }


            int i = 0;
            int o = 0;
            int[] mas = new int[countByNameCategory.size()];

            for (Long element : countByNameCategory) {
                mas[i] = element.intValue();
                i++;
            }
            int max = 0;
            for (int u = 0; u < countByNameCategory.size(); u++) {

                if (mas[u] > max) max = mas[u];
            }

            for (int u = 0; u < countByNameCategory.size(); u++) {

                if (mas[u] == max) o = u + 1;
            }

            int j = 1;
            String name = "";
            for (String element : nameCategory) {
                if (j == o) {
                    name = element;
                    break;
                }
                j++;
            }
            name = "Ви дали найбільше правильних відповідей на тему " + name.toLowerCase() + ". Тому радимо вам в подальшому звернути увагу на такий вид діяльності, " +
                    "бо у вас є все для того, щоб досягнути найкращих результатів. УСПІХІВ ВАМ!!!";
            if (nameCategory.size() >= 2) fullResult.setResultText(name);

            int w = 0;
            int e = 0;
            for (String str : nameCategory) {
                ClientResult clientResult1 = new ClientResult();
                for (Long ln : countByNameCategory) {
                    if (e == w) {
                        clientResult1.setCategory(str);
                        clientResult1.setCountTrue(ln);
                        clientResult.add(clientResult1);
                    } else {
                        e++;
                        continue;
                    }
                    w++;
                    break;
                }
            }
            fullResult.setClientResults(clientResult);

        } catch (NullPointerException e) {

        }
        return fullResult;
    }
}
