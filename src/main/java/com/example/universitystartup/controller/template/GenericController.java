package com.example.universitystartup.controller.template;

import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.ApiResponse;
import com.example.universitystartup.service.template.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public abstract class GenericController<E, M, R extends JpaRepository<E, Long>, MAPPER extends GenericMapper<E, M>, S extends GenericService<E, M, R, MAPPER>> {

    protected final S service;

    @PostMapping
    public M add(@RequestBody M model){
        return service.save(model);
    }

    @GetMapping("/{id}")
    public M getById(@PathVariable Long id){
        return service.getById(id);
    }

    public List<M> getAll(){
        return service.getAll();
    }

    public List<M> getAll(Pageable pageable){
        return service.getAll(pageable);
    }

    @PutMapping("/{id}")
    public M update(@RequestBody M model, @PathVariable Long id){
        return service.updateEntityFromModel(model, id);
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
}
