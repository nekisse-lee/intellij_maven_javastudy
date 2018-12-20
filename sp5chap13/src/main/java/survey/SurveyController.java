package survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    @GetMapping
    public String form(Model model) {
        List<Question> questions = createQustions();
        model.addAttribute("questions", questions);
        return "survey/surveyForm";
    }

    @PostMapping
    public String submit(@ModelAttribute("ansData") AnsweredData data) {

        return "survey/submitted";
    }


    private List<Question> createQustions() {
        Question q1 = new Question("당신의 역할은 ?", Arrays.asList("서버", "프론트", "풀스택"));
        Question q2 = new Question("개발 툴은 무엇?", Arrays.asList("Eclipse", "intellij", "sublime"));
        Question q3 = new Question("할말");
        return Arrays.asList(q1, q2, q3);
    }


}
