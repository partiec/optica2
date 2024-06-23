package ru.frolov.viewmodule.controller.forGlasses;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.frolov.viewmodule.service.forGlasses.frame_service.FrameService;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalogue/glasses")
public class FrameController {

    private final FrameService service;

    @GetMapping("frames")
    public String getFramesList(Model model) {
        model.addAttribute("frames", this.service.findAllEyeFrames());
        return "catalogue/glasses/frames";
    }


}
