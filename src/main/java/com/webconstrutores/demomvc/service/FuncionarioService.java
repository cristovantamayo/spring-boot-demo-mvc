package com.webconstrutores.demomvc.service;

import java.time.LocalDate;
import java.util.List;

import com.webconstrutores.demomvc.domain.Cargo;
import com.webconstrutores.demomvc.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long idCargo);

	List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida);

}
