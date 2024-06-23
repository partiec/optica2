package ru.frolov.viewmodule.service.forGlasses.glens_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.frolov.viewmodule.entity.forGlasses.GLens;
import ru.frolov.viewmodule.repository.forGlasses.glens_repo.GLensRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GLensServiceImpl implements GLensService{

    private final GLensRepository repository;
    @Override
    public List<GLens> findAllGLenses() {
        return this.repository.findAll();
    }
}
