package ru.frolov.viewmodule.repository.forGlasses.glens_repo;

import ru.frolov.viewmodule.entity.forGlasses.Glens;

import java.util.List;

public interface GlensRepository {
    List<Glens> findAll();

    void save(Glens glens);
}
