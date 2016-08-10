package br.com.spring.mvc.dao;

import br.com.spring.mvc.model.AlunoPic;

import java.util.List;

/**
 * Created by allan on 09/08/16.
 */
public interface IAlunoPicDAO {

    public List<AlunoPic> getAlunosPicByExercicio(Integer exercicio);

}
