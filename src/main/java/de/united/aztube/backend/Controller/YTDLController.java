package de.united.aztube.backend.Controller;

import de.united.aztube.backend.CodeGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/ytdl")
public class YTDLController {

    @GetMapping(path = "/dosomething")
    public @ResponseBody
    String doSomething() {
        System.out.println("Hello from Spring backend");
        return "Hello Frontend";
    }

}