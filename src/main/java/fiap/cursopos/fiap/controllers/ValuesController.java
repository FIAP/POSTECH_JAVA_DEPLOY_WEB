package fiap.cursopos.fiap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValuesController {

    @GetMapping("/")
    public String Index(){
        return "index";
    }
}