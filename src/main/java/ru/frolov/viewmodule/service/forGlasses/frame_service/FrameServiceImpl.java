package ru.frolov.viewmodule.service.forGlasses.frame_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.frolov.viewmodule.entity.forGlasses.Frame;
import ru.frolov.viewmodule.repository.forGlasses.frame_repo.FrameRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FrameServiceImpl implements FrameService {

    private final FrameRepository repository;
    @Override
    public List<Frame> findAllEyeFrames() {
        return this.repository.findAll();
    }
}
