package com.ucdb.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucdb.dao.CommentDAO;
import com.ucdb.dao.DisciplinaDAO;
import com.ucdb.dao.PerfilDAO;
import com.ucdb.dao.RatingDAO;
import com.ucdb.dao.UserDAO;
import com.ucdb.model.Comment;
import com.ucdb.model.Disciplina;
import com.ucdb.model.Perfil;
import com.ucdb.model.Rating;
import com.ucdb.model.Rating_Id;
import com.ucdb.model.User;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaDAO disciplinaDao;
	
	@Autowired
	private PerfilDAO perfilDAO;

	public Disciplina create(Disciplina disciplina) {

		return this.disciplinaDao.save(disciplina);
	}

	public List<Disciplina> findBySubString(String disciplina) {
		return this.disciplinaDao.findBySubString(disciplina);
	}

	public List<Disciplina> getAll() {
		return this.disciplinaDao.getAll();
	}
}
