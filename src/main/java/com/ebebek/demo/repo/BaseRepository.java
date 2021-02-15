package com.ebebek.demo.repo;

import com.ebebek.demo.model.base.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T extends BaseModel, E extends Serializable> extends JpaRepository<T, E> {
	
	Boolean existsByName(String name);
	T findByName(String name);
	List<T> findByNameContainingIgnoreCase(String name);

}
