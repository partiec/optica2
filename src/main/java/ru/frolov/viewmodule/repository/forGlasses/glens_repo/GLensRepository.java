package ru.frolov.viewmodule.repository.forGlasses.glens_repo;

import ru.frolov.viewmodule.entity.forGlasses.GLens;

import java.util.List;

public interface GLensRepository {
    List<GLens> findAll();
}
