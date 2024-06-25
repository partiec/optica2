package ru.frolov.viewmodule.service.forGlasses.frame_service;

import ru.frolov.viewmodule.entity.forGlasses.Frame;
import java.util.List;


public interface FrameService {
    List<Frame> findAllFrames();

    void saveFrame(Frame frame);
}
