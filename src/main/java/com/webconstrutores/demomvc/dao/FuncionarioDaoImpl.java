package com.webconstrutores.demomvc.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.webconstrutores.demomvc.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	@Override
	public List<Funcionario> findByName(String nome) {
		return createQuery("select f from Funcionario f WHERE f.nome like concat('%', ?1, '%')", nome);
	}

	@Override
	public List<Funcionario> findByJobRoleId(Long idCargo) {
		return createQuery("select f from Funcionario f WHERE f.cargo.id = ?1", idCargo);
	}

	@Override
	public List<Funcionario> findByDates(LocalDate entrada, LocalDate saida) {
		StringBuilder jpql = new StringBuilder("select f from Funcionario f WHERE ");
		List<LocalDate> params = new ArrayList<>();
		
		if(entrada != null && saida != null) {
			jpql.append("f.dataEntrada >= ?1 and f.dataSaida <= ?2 ");
			params.add(entrada);
			params.add(saida);
		} else if(entrada != null) {
			jpql.append("f.dataEntrada >= ?1 ");
			params.add(entrada);
		} else {
			jpql.append("f.dataSaida >= ?1 ");
			params.add(saida);
		}
		
		return createQuery(jpql.append("order by f.dataEntrada asc").toString(), params);
	}

}
