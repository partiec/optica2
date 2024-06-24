package ru.frolov.viewmodule.repository.forGlasses.glens_repo;

import org.springframework.stereotype.Repository;
import ru.frolov.viewmodule.entity.forGlasses.GLens;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

@Repository
public class GLensRepositoryImpl implements GLensRepository {

    private final List<GLens> glenses = Collections.synchronizedList(new LinkedList<>());



    @Override
    public List<GLens> findAll() {
        return Collections.unmodifiableList(this.glenses);
    }
}
