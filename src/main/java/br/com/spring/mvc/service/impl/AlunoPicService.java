package br.com.spring.mvc.service.impl;

import br.com.spring.mvc.dao.IAlunoPicDAO;
import br.com.spring.mvc.model.AlunoPic;
import br.com.spring.mvc.service.IAlunoPicService;
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
public class AlunoPicService implements IAlunoPicService {

    @Getter @Setter
    @Inject
    IAlunoPicDAO alunoPicDAO;

    public List<AlunoPic> getAlunosPicByExercicio(Integer exercicio) {
        return getAlunoPicDAO().getAlunosPicByExercicio(exercicio);
    }
}
