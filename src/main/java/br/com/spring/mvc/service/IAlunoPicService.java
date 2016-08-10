package br.com.spring.mvc.service;

import br.com.spring.mvc.model.AlunoPic;

import java.util.List;

/**
 * Created by allan on 09/08/16.
 */
public interface IAlunoPicService {

    public List<AlunoPic> getAlunosPicByExercicio(Integer exercicio);

}
