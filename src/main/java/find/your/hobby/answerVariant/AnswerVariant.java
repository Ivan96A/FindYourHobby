package find.your.hobby.answerVariant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import find.your.hobby.task.domain.Task;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Iwan on 26.05.2016.
 */
@Entity
@Table(name = "answer_variants")
public class AnswerVariant implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "answer")
    private String answer;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tasks_id", nullable = false)
    private Task task;

    private AnswerVariant() {

    }

    public AnswerVariant(String answer) {
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

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
