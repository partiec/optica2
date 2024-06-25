package ru.frolov.viewmodule.repository.forGlasses.frame_repo;

import org.springframework.stereotype.Repository;
import ru.frolov.viewmodule.entity.forGlasses.Frame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Repository
public class FrameRepositoryImpl implements FrameRepository {

    private final List<Frame> frames = Collections.synchronizedList(new LinkedList<>());


    @Override
    public List<Frame> findAll() {
        return Collections.unmodifiableList(this.frames);
    }

    @Override
    public void save(Frame frame) {
        this.frames.add(frame);
    }

}
