package find.your.hobby.result;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Iwan on 07.06.2016.
 */
public class FullResult {

    private Set<ClientResult> clientResults = new HashSet<>();

    private String resultText;

    FullResult() {

    }

    public Set<ClientResult> getClientResults() {
        return clientResults;
    }

    public void setClientResults(Set<ClientResult> clientResults) {
        this.clientResults = clientResults;
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }
}
