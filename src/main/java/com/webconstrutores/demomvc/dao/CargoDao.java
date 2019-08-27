package com.webconstrutores.demomvc.dao;

import java.util.List;

import com.webconstrutores.demomvc.domain.Cargo;

public interface CargoDao {
	void save(Cargo departamento);
	void update(Cargo departamento);
	void delete(Long id);
	Cargo findById(Long id);
	List<Cargo> findAll();
}
