package find.your.hobby.result;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Iwan on 06.06.2016.
 */
public class ClientResult implements Serializable{

    private String category;

    private Long countTrue;

    ClientResult() {

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getCountTrue() {
        return countTrue;
    }

    public void setCountTrue(Long countTrue) {
        this.countTrue = countTrue;
    }

}
