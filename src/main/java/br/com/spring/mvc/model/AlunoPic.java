package br.com.spring.mvc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by allan on 10/08/16.
 */
@Entity
@Data
@EqualsAndHashCode(exclude={"idAlunoPic", "idPrograma"})
@Table(name = "alunos_historico_geral")
public class AlunoPic {

    @Column(name = "programa_id")
    private Integer idPrograma;

    @Column(name = "id")
    private Integer idAlunoPic;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "endereco_cep")
    private String cep;

    @Column(name = "endereco_bairro")
    private String bairro;

    @Column(name = "endereco_complemento")
    private String complemento;

    @Column(name = "endereco_logradouro")
    private String logradouro;

    @Column(name = "endereco_numero")
    private String numero;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "telefone_alt")
    private String telefoneAlternativo;

    @Column(name = "premiacao_ano")
    private Integer anoPremiacao;

}
