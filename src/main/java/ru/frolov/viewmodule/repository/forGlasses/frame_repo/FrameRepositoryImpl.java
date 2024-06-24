package ru.frolov.viewmodule.repository.forGlasses.frame_repo;

import org.springframework.stereotype.Repository;
import ru.frolov.viewmodule.entity.forGlasses.Frame;
import ru.frolov.viewmodule.entity.forGlasses.GLens;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

@Repository
public class FrameRepositoryImpl implements FrameRepository {

    private final List<Frame> frames = Collections.synchronizedList(new LinkedList<>());
    private final List<GLens> glenses = Collections.synchronizedList(new LinkedList<>());

    @Override
    public List<Frame> findAll() {
        return Collections.unmodifiableList(this.frames);
    }

    @Override
    public void save(Frame frame) {
        this.frames.add(frame);
    }
}
