package survey16;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/survey16")
public class SurveyController {

    /*@GetMapping
    public String form(Model model) {
        List<Question> questions = createQuestions();
        model.addAttribute("questions", questions);
        return "survey/surveyForm";
    }*/

    @GetMapping
    public ModelAndView form() {
        List<Question> questions = createQuestions();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("questions",questions);
        modelAndView.setViewName("survey133/surveyForm");
        return modelAndView;
    }

    private List<Question> createQuestions() {
        Question q1 = new Question("당신의 역할은?", Arrays.asList("서버", "프론트", "풀스택"));
        Question q2 = new Question("개발도구는 ?", Arrays.asList("Intellij", "Eclipse", "Sublime"));
        Question q3 = new Question("할말 ?");
        return Arrays.asList(q1, q2, q3);


    }

    @PostMapping
    public String submit(@ModelAttribute("ansData") @Valid AnsweredData data/*, Errors errors*/) {

        return "survey133/submitted";
    }


}
