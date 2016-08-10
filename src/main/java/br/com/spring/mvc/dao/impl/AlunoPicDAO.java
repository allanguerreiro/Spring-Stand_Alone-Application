package br.com.spring.mvc.dao.impl;

import br.com.spring.mvc.dao.IAlunoPicDAO;
import br.com.spring.mvc.dao.mapper.AlunoPicRowMapper;
import br.com.spring.mvc.model.AlunoPic;
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
public class AlunoPicDAO implements IAlunoPicDAO {

    @Getter
    private JdbcTemplate jdbcTemplate;

    public List<AlunoPic> getAlunosPicByExercicio(Integer exercicio) {
        log.info("Obtendo os Alunos do PIC por exxercicio!");
        return jdbcTemplate.query(
                "SELECT * FROM alunos_historico_geral WHERE premiacao_ano = ", new Object[]{exercicio}, new AlunoPicRowMapper());
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplatePic) {
        log.info("Obtendo datasource do PIC");
        this.jdbcTemplate = jdbcTemplatePic;
    }
}
