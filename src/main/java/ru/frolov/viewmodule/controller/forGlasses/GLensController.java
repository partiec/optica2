package ru.frolov.viewmodule.controller.forGlasses;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.frolov.viewmodule.service.forGlasses.glens_service.GLensService;


@Controller
@RequiredArgsConstructor
@RequestMapping("catalogue/glasses")
public class GLensController {

    private final GLensService service;

    @GetMapping("glenses")
    public String getGLensesList(Model model) {
        model.addAttribute("glenses", this.service.findAllGLenses());
        return "catalogue/glasses/glenses";
    }
}
