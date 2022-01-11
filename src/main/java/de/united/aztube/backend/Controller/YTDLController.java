package de.united.aztube.backend.Controller;

import de.united.aztube.backend.CodeGenerator;
import de.united.aztube.backend.StatusRequest;
import de.united.aztube.backend.StatusResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/ytdl")
public class YTDLController {

    @GetMapping(path = "/dosomething")
    public void doSomething() {
        System.out.println("Hello from Spring backend");
    }



}
