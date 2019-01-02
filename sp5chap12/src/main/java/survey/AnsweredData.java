package survey;

import javax.validation.Valid;
import java.util.List;

public class AnsweredData {

    private List<String> responses;
    @Valid
    private Respondent res;

    public Respondent getRes() {
        return res;
    }

    public List<String> getResponses() {
        return responses;
    }

    public void setResponses(List<String> responses) {
        this.responses = responses;
    }

    public void setRes(Respondent res) {
        this.res = res;
    }
}
