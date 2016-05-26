package find.your.hobby.task.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import find.your.hobby.answerVariant.AnswerVariant;
import find.your.hobby.category.Category;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
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

    @Column(name = "image", length = 30000000)
    private String image;

    @ManyToOne
    @JoinColumn(name = "categories_id", nullable = false)
    private Category category;

    @OneToMany(targetEntity = AnswerVariant.class, cascade = CascadeType.ALL, mappedBy = "task")
    private Set<AnswerVariant> answerVariants = new HashSet<>();

    @Column(name = "correct_answer")
    private String correctAnswer;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
