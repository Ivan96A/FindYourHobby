package find.your.hobby.task.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Iwan on 13.05.2016.
 */

@Entity
@Table(name = "tasks")
public class Task implements Serializable {

    public enum HobbyType {
        SPORT("SPORT"),
        MUSIC("MUSIC"),
        ART("ART"),
        SCIENCE("SCIENCE"),
        COMPUTER_TECHNOLOGY("COMPUTER_TECHNOLOGY");

        private final String hobbyType;

        HobbyType(String hobbyType) {
            this.hobbyType = hobbyType;
        }

        @Override
        public String toString() {
            return hobbyType;
        }
    }

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "hobby_type")
    private HobbyType hobbyType;

    public Task() {

    }

    public Task(String question, HobbyType hobbyType) {
        this.question = question;
        this.hobbyType = hobbyType;
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

    public HobbyType getHobbyType() {
        return hobbyType;
    }

    public void setHobbyType(HobbyType hobbyType) {
        this.hobbyType = hobbyType;
    }
}
