package br.com.spring.mvc.dao.impl;

import br.com.spring.mvc.dao.IAlunoDAO;
import br.com.spring.mvc.dao.mapper.AlunoRowMapper;
import br.com.spring.mvc.model.AlunoHistorico;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 09/08/16.
 */
@Slf4j
@Repository
public class AlunoDAO implements IAlunoDAO {

    @Getter
    private JdbcTemplate jdbcTemplate;

    public void addAluno(AlunoHistorico alunoHistorico) {
    }

    public void updateAluno(AlunoHistorico alunoHistorico) {
    }

    public void deleteAluno(Integer idAluno) {
    }

    public AlunoHistorico getAlunoByName(String name) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM OBMEP_ALUNO WHERE NM_ALUNO = ", new Object[]{name}, new AlunoRowMapper());
    }

    public List<AlunoHistorico> getAlunos() {
        log.info("Select all users!");
        return null;
    }

    public List<AlunoHistorico> selectAll() {
        return jdbcTemplate.query(
                "SELECT * FROM OBMEP_ALUNO", new AlunoRowMapper());
    }

    public List<AlunoHistorico> getAlunosByExercicio(Integer exercicio) {
        return jdbcTemplate.query(
                "SELECT * FROM OBMEP_ALUNO WHERE NR_EXERCICIO = ", new Object[]{exercicio}, new AlunoRowMapper());
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplateHistorico) {
        log.info("Obtendo datasource do Historico");
        this.jdbcTemplate = jdbcTemplateHistorico;
    }
}
