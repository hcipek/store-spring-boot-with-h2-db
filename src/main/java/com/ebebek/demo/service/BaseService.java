package com.ebebek.demo.service;

import com.ebebek.demo.converter.BaseConverter;
import com.ebebek.demo.model.base.BaseModel;
import com.ebebek.demo.repo.BaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Slf4j
public abstract class BaseService<T extends BaseModel, U extends BaseRepository<T, Long>, V extends BaseConverter> {
	
	@Autowired
	protected U repo;

	@Autowired
	protected V converter;
	
	public T save(T t) {
		return repo.save(t);
	}
	
	public T get(Long id) {
		Optional<T> optional = repo.findById(id);

		if(!optional.isPresent())
			return null;
		else
			return optional.get();
	}
	
	public T getByName(String name) {
		return repo.findByName(name);
	}
	
	public List<T> getByNameContainingIgnoreCase(String name) {
		return repo.findByNameContainingIgnoreCase(name);
	}
	
	public Boolean existsByName(String name) {
		return repo.existsByName(name);
	}
	
	public void deleteAll() {
		repo.deleteAll();
	}

}
