package find.your.hobby.task.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import find.your.hobby.answerVariant.AnswerVariant;
import find.your.hobby.category.domain.Category;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Iwan on 13.05.2016.
 */

@Entity
@Table(name = "tasks")
public class Task implements Serializable {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "question")
    private String question;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categories_id", nullable = false)
    private Category category;

    @OneToMany(targetEntity = AnswerVariant.class, cascade = CascadeType.ALL, mappedBy = "task")
    private Set<AnswerVariant> answerVariants = new HashSet<>();

    @OneToOne
    private AnswerVariant correctAnswer;

    public Task() {

    }

    public Task(String question) {
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<AnswerVariant> getAnswerVariants() {
        return answerVariants;
    }

    public void setAnswerVariants(Set<AnswerVariant> answerVariants) {
        this.answerVariants = answerVariants;
    }

    public AnswerVariant getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(AnswerVariant correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
