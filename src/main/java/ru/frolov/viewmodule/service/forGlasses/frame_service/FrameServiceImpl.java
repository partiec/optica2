package ru.frolov.viewmodule.service.forGlasses.frame_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.frolov.viewmodule.entity.forGlasses.Frame;
import ru.frolov.viewmodule.repository.forGlasses.frame_repo.FrameRepository;
import ru.frolov.viewmodule.repository.forGlasses.glens_repo.GLensRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FrameServiceImpl implements FrameService {

    private final FrameRepository frameRepository;
    private final GLensRepository gLensRepository;
    @Override
    public List<Frame> findAllEyeFrames() {
        return this.frameRepository.findAll();
    }

    @Override
    public void saveFrame(Frame frame) {
        this.frameRepository.save(frame);
    }
}
