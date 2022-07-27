package com.project.crud.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.crud.boot.dao.DepartamentoDao;
import com.project.crud.boot.domain.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departamento> buscarTodos() {
		
		return dao.findAll();
	}

}
