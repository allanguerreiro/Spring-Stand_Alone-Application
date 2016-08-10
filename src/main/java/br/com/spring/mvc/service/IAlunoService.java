package br.com.spring.mvc.service;

import br.com.spring.mvc.model.AlunoHistorico;

import java.util.List;

/**
 * Created by allan on 09/08/16.
 */
public interface IAlunoService {
    public void addAluno(AlunoHistorico alunoHistorico);

    public void updateAluno(AlunoHistorico alunoHistorico);

    public void deleteAluno(Integer idAluno);

    public AlunoHistorico getAlunoByName(String name);

    public List<AlunoHistorico> getAlunos();

    public List<AlunoHistorico> getAlunosByExercicio(Integer exercicio);

    public List<AlunoHistorico> selectAll();
}
