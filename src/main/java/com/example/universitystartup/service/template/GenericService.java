package com.example.universitystartup.service.template;

import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RequiredArgsConstructor
public abstract class GenericService<E, M, R extends JpaRepository<E, Long>, MAPPER extends GenericMapper<E, M>>{

    protected final R repository;
    protected final MAPPER mapper;

    public M save(M model){
        E entity = mapper.modelToEntity(model);
        E savedEntity = repository.save(entity);
        return mapper.entityToModel(savedEntity);
    }

    public List<M> getAll(){
        return mapper.entitiesToModels(repository.findAll());
    }

    public List<M> getAll(Pageable pageable){
        Page<E> all = repository.findAll(pageable);
        return mapper.entitiesToModels(all.getContent());
    }

    public M getById(Long id){
        E entity = repository.findById(id).orElseThrow();
        return mapper.entityToModel(entity);
    }

    public M updateEntityFromModel(M model, Long id){
        E entity = repository.findById(id).orElseThrow();
        mapper.updateEntityFromModel(entity, model);
        E savedEntity = repository.save(entity);
        return mapper.entityToModel(savedEntity);
    }

    public ApiResponse deleteById(Long id){
        try{
            repository.deleteById(id);
            return new ApiResponse("Deleted", true);
        }catch (Exception e){
            return new ApiResponse("Something went wrong", false);
        }
    }
}
