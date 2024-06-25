package ru.frolov.viewmodule.service.forGlasses.glens_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.frolov.viewmodule.entity.forGlasses.Glens;
import ru.frolov.viewmodule.repository.forGlasses.glens_repo.GlensRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class GlensServiceImpl implements GlensService {

    private final GlensRepository glensRepository;
    @Override
    public List<Glens> findAllGLenses() {
        return this.glensRepository.findAll();
    }

    @Override
    public void saveGlens(Glens glens) {
        this.glensRepository.save(glens);
    }
}
