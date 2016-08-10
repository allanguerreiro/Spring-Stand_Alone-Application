package br.com.spring.mvc.service.impl;

import br.com.spring.mvc.dao.IAlunoDAO;
import br.com.spring.mvc.model.AlunoHistorico;
import br.com.spring.mvc.service.IAlunoService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by allan on 09/08/16.
 */
@Service
@Transactional(readOnly = true)
public class AlunoService implements IAlunoService {

    @Getter @Setter
    @Inject
    IAlunoDAO alunoDAO;

    @Transactional(readOnly = false)
    public void addAluno(AlunoHistorico alunoHistorico) {
        getAlunoDAO().addAluno(alunoHistorico);
    }

    @Transactional(readOnly = false)
    public void deleteAluno(Integer idAluno) {
        getAlunoDAO().deleteAluno(idAluno);
    }

    @Transactional(readOnly = false)
    public void updateAluno(AlunoHistorico alunoHistorico) {
        getAlunoDAO().updateAluno(alunoHistorico);
    }

    public AlunoHistorico getAlunoByName(String name) {
        return getAlunoDAO().getAlunoByName(name);
    }

    public List<AlunoHistorico> getAlunos() {
        return getAlunoDAO().getAlunos();
    }

    public List<AlunoHistorico> selectAll() {
        return getAlunoDAO().selectAll();
    }

    public List<AlunoHistorico> getAlunosByExercicio(Integer exercicio) {
        return getAlunoDAO().getAlunosByExercicio(exercicio);
    }
}
