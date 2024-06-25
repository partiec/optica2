package ru.frolov.viewmodule.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.frolov.viewmodule.controller.payload.FramePayload;
import ru.frolov.viewmodule.controller.payload.GlensPayload;
import ru.frolov.viewmodule.entity.forGlasses.Frame;
import ru.frolov.viewmodule.entity.forGlasses.Glens;
import ru.frolov.viewmodule.service.forGlasses.frame_service.FrameService;
import ru.frolov.viewmodule.service.forGlasses.glens_service.GlensService;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalogue")
public class StorageController {

    private final FrameService frameService;
    private final GlensService glensService;


    @GetMapping("frame")
    public String frameOnlyName(Model model) {
        model.addAttribute("frames", this.frameService.findAllFrames());
        return "catalogue/storage";
    }

    @GetMapping("glens")
    public String glensOnlyName(Model model) {
        model.addAttribute("glenses", this.glensService.findAllGLenses());
        return "catalogue/storage";
    }


    @PostMapping("frame")
    public String createSaveFrame(FramePayload framePayload, Model model) {
        if (framePayload != null) {
            Frame frame = new Frame(
                    framePayload.id(),
                    framePayload.firm(),
                    framePayload.model(),
                    framePayload.material(),
                    framePayload.typeOfFixation(),
                    framePayload.purchasePrice(),
                    framePayload.salePrice()
            );
            frame.setId(this.frameService.findAllFrames().stream()
                    .map(Frame::getId)
                    .max(Long::compareTo)
                    .orElse(0L) + 1);
            this.frameService.saveFrame(frame);
            model.addAttribute("frames", this.frameService.findAllFrames());
            model.addAttribute("glenses", this.glensService.findAllGLenses());
        }
        return "catalogue/storage";
    }


    @PostMapping("glens")
    public String createSaveGlens(GlensPayload glensPayload, Model model) {
        if (glensPayload != null) {
            Glens glens = new Glens(
                    glensPayload.id(),
                    glensPayload.firm(),
                    glensPayload.model(),
                    glensPayload.material(),
                    glensPayload.type(),
                    glensPayload.purchasePrice(),
                    glensPayload.salePrice()
            );
            glens.setId(this.glensService.findAllGLenses().stream()
                    .map(Glens::getId)
                    .max(Long::compareTo)
                    .orElse(0L) + 1);
            this.glensService.saveGlens(glens);
            model.addAttribute("glenses", this.glensService.findAllGLenses());
            model.addAttribute("frames", this.frameService.findAllFrames());
        }
        return "catalogue/storage";
    }


}
