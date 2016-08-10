package br.com.spring.mvc.controller;

import br.com.spring.mvc.config.SpringContext;
import br.com.spring.mvc.model.AlunoHistorico;
import br.com.spring.mvc.model.AlunoPic;
import br.com.spring.mvc.service.IAlunoPicService;
import br.com.spring.mvc.service.IAlunoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by allan on 09/08/16.
 */
@Slf4j
@Controller
public class AlunoController {

    private static List<AlunoHistorico> historicoAlunos;
    private static List<AlunoPic> picAlunos;

    @Inject
    private static IAlunoService alunoService;

    @Inject
    private static IAlunoPicService alunoPicService;

    public static void main(String[] args) {
        GenericApplicationContext ctx = SpringContext.getContext();
        BeanFactory factory = ctx;
        alunoService = (IAlunoService) factory.getBean("alunoService");
        alunoPicService = (IAlunoPicService) factory.getBean("alunoPicService");

        historicoAlunos = new ArrayList<AlunoHistorico>();
        historicoAlunos = alunoService.selectAll();

        picAlunos = new ArrayList<AlunoPic>();
        picAlunos = alunoPicService.getAlunosPicByExercicio(2014);

        for (Map.Entry<String, DataSource> entry : SpringContext.getListDataSources().entrySet()) {
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }
    }
}
