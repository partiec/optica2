package ru.frolov.viewmodule.repository.forGlasses.frame_repo;

import org.springframework.stereotype.Repository;
import ru.frolov.viewmodule.entity.forGlasses.Frame;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

@Repository
public class FrameRepositoryImpl implements FrameRepository {

    private final List<Frame> frames = Collections.synchronizedList(new LinkedList<>());

    public FrameRepositoryImpl() {
        LongStream.range(1, 4)
                .forEach(i->this.frames.add(new Frame( i,  "Ferre", "модель-№%d".formatted(i), "пластик", "ободок")));
    }

    @Override
    public List<Frame> findAll() {
        return Collections.unmodifiableList(this.frames);
    }
}
