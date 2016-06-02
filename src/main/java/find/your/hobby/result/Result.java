package find.your.hobby.result;

import java.io.Serializable;

/**
 * Created by Iwan on 02.06.2016.
 */
public class Result implements Serializable {

    private Long id;

    private String answer;

    public Result() {

    }

    public Result(Long id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
