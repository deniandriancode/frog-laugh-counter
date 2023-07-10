package app;

import org.springframework.stereotype.*;
import org.springframework.boot.web.servlet.error.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping("/*")
    public String handleError() {
        return "error";
    }

}
