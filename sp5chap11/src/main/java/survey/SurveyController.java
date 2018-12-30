package survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    @GetMapping
    public String form(Model model) {
        List<Question> questions = createQuestions();
        model.addAttribute("questions", questions);
        return "survey/surveyForm";
    }

    private List<Question> createQuestions() {
        Question q1 = new Question("당신의 역할은?", Arrays.asList("서버", "프론트", "풀스택"));
        Question q2 = new Question("개발도구는 ?", Arrays.asList("Intellij", "Eclipse", "Sublime"));
        Question q3 = new Question("할말 ?");
        return Arrays.asList(q1, q2, q3);


    }

    @PostMapping
    public String submit(@ModelAttribute("ansData") AnsweredData data) {
        return "survey/submitted";
    }


}
