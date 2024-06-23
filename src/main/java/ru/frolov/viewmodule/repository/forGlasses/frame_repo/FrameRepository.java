package ru.frolov.viewmodule.repository.forGlasses.frame_repo;

import ru.frolov.viewmodule.entity.forGlasses.Frame;


import java.util.List;

public interface FrameRepository {
    List<Frame> findAll();
}
