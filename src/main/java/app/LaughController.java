package app;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.*;

@Controller
public class LaughController {

    @Autowired
    LaughRepository laughRepository;

    @GetMapping("/")
    public String getHome(Model model) {
        Laugh laugh = laughRepository.findFirstByOrderByIdDesc();
        model.addAttribute("count", laugh.getId());
        return "home";
    }

    @GetMapping("/laugh")
    public void justLaugh() {
        laughRepository.save(new Laugh());
    }

}
