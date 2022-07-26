package com.project.crud.boot.dao;

import org.springframework.stereotype.Repository;

import com.project.crud.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
