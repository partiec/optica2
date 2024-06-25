package ru.frolov.viewmodule.service.forGlasses.glens_service;

import ru.frolov.viewmodule.entity.forGlasses.Glens;

import java.util.List;

public interface GlensService {

    List<Glens> findAllGLenses();

    void saveGlens(Glens glens);
}
