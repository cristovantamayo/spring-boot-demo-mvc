package com.webconstrutores.demomvc.dao;

import org.springframework.stereotype.Repository;

import com.webconstrutores.demomvc.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionalDao {

}
