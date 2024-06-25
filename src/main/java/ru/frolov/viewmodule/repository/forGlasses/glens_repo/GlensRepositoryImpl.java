package ru.frolov.viewmodule.repository.forGlasses.glens_repo;

import org.springframework.stereotype.Repository;
import ru.frolov.viewmodule.entity.forGlasses.Glens;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Repository
public class GlensRepositoryImpl implements GlensRepository {

    private final List<Glens> glenses = Collections.synchronizedList(new LinkedList<>());



    @Override
    public List<Glens> findAll() {
        return Collections.unmodifiableList(this.glenses);
    }

    public void save(Glens gLens) {
        this.glenses.add(gLens);
    }
}
