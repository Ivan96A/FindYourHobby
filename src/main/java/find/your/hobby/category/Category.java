package find.your.hobby.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import find.your.hobby.task.domain.Task;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Iwan on 26.05.2016.
 */

@Entity
@Table(name = "categories")
public class Category implements Serializable {

    public enum HobbyType {
        SPORT("SPORT"),
        MUSIC("MUSIC"),
        ART("ART"),
        SCIENCE("SCIENCE"),
        COMPUTER_TECHNOLOGY("COMPUTER_TECHNOLOGY"),
        COOKING("COOKING"),
        BUSINESS("BUSINESS"),
        LITERATURE("LITERATURE");

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
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "category")
    private HobbyType category;

    @JsonIgnore
    @OneToMany(targetEntity = Task.class, cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Task> tasks = new HashSet<>();

    public Category() {

    }

    public Category(HobbyType category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HobbyType getCategory() {
        return category;
    }

    public void setCategory(HobbyType category) {
        this.category = category;
    }
}
