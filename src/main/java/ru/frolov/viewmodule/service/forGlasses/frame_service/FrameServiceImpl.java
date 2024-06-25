package ru.frolov.viewmodule.service.forGlasses.frame_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.frolov.viewmodule.entity.forGlasses.Frame;
import ru.frolov.viewmodule.repository.forGlasses.frame_repo.FrameRepository;
import ru.frolov.viewmodule.repository.forGlasses.glens_repo.GlensRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FrameServiceImpl implements FrameService {

    private final FrameRepository frameRepository;
    private final GlensRepository gLensRepository;
    @Override
    public List<Frame> findAllFrames() {
        return this.frameRepository.findAll();
    }

    @Override
    public void saveFrame(Frame frame) {
        this.frameRepository.save(frame);
    }
}
