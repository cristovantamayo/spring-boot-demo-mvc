package com.webconstrutores.demomvc.dao;

import java.util.List;

import com.webconstrutores.demomvc.domain.Funcionario;

public interface FuncionalDao {
	void save(Funcionario funcionario);
	void update(Funcionario funcionario);
	void delete(Long id);
	Funcionario findById(Long id);
	List<Funcionario> findAll();
}
