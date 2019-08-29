package com.webconstrutores.demomvc.dao;

import java.time.LocalDate;
import java.util.List;

import com.webconstrutores.demomvc.domain.Cargo;
import com.webconstrutores.demomvc.domain.Funcionario;

public interface FuncionarioDao {
	void save(Funcionario funcionario);
	void update(Funcionario funcionario);
	void delete(Long id);
	Funcionario findById(Long id);
	List<Funcionario> findAll();
	List<Funcionario> findByName(String nome);
	List<Funcionario> findByJobRoleId(Long idCargo);
	List<Funcionario> findByDates(LocalDate entrada, LocalDate saida);
}
