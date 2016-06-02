package find.your.hobby.result;

import java.io.Serializable;

/**
 * Created by Iwan on 02.06.2016.
 */
public class Result implements Serializable {

    private Long id;

    private Long answer;

    public Result() {

    }

    public Result(Long id, Long answer) {
        this.id = id;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAnswer() {
        return answer;
    }

    public void setAnswer(Long answer) {
        this.answer = answer;
    }
}
