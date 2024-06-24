package ru.frolov.viewmodule.controller.forStore;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.frolov.viewmodule.entity.forGlasses.Frame;
import ru.frolov.viewmodule.service.forGlasses.frame_service.FrameService;
import ru.frolov.viewmodule.service.forGlasses.glens_service.GLensService;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalogue")
public class StoreController {

    private final FrameService frameService;
    private final GLensService gLensService;

    @ModelAttribute
    public void frameToModel(Model model) {
        model.addAttribute("newFrame", new Frame());
    }

    @GetMapping
    public String getStore(Model model) {
        model.addAttribute("frames", this.frameService.findAllEyeFrames());
        model.addAttribute("glens", this.gLensService.findAllGLenses());
        return "catalogue/storage";
    }

    @PostMapping
    public String create(Frame frame, Model model) {
        this.frameService.saveFrame(frame);
        model.addAttribute("frames", this.frameService.findAllEyeFrames());
        return "catalogue/storage";
    }


}
