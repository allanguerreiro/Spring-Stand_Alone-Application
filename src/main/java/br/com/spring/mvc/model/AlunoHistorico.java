package br.com.spring.mvc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by allan on 09/08/16.
 */
@Entity
@Data
@EqualsAndHashCode(exclude={"idAluno"})
@Table(name = "OBMEP_ALUNO")
public class AlunoHistorico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CD_ALUNO")
    private Integer idAluno;

    @Column(name = "IN_ADVENTISTA")
    private Boolean adventista;

    @Column(name = "CD_ANO")
    private Integer ano;

    @Column(name = "IN_CADEIRANTE")
    private Boolean cadeirante;

    @Column(name = "CD_CODIGO")
    private String codigoAluno;

    @Column(name = "NM_CPF")
    private String cpf;

    @Column(name = "DT_NASCIMENTO")
    private Date nascimento;

    @Column(name = "IN_DETENTO")
    private Boolean detento;

    @Column(name = "NM_EMAIL")
    private String email;

    @Column(name = "NM_CEP")
    private String cep;

    @Column(name = "NM_BAIRRO")
    private String bairro;

    @Column(name = "NM_COMPLEMENTO")
    private String complemento;

    @Column(name = "NM_ENDERECO")
    private String endereco;

    @Column(name = "NM_NUMERO")
    private String numero;

    @Column(name = "DS_DEF_DESCRICAO")
    private String descricao;

    @Column(name = "IN_PROVA_BRAILE")
    private Boolean braile;

    @Column(name = "IN_PROVA_LIBRA_DEFICIENTE_AUDITIVO")
    private Boolean libra;

    @Column(name = "IN_PROVA_AMPLIADA")
    private Boolean ampliada;

    @Column(name = "CD_NIVEL")
    private Integer nivel;

    @Column(name = "NM_ALUNO")
    private String nome;

    @Column(name = "VL_NOTA")
    private Integer nota;

    @Column(name = "IN_OUTRAS_DEF")
    private Boolean outrasDefinicoes;

    @Column(name = "IN_PIC")
    private Boolean pic;

    @Column(name = "CD_SEXO")
    private String sexo;

    @Column(name = "CD_DDD_FONE")
    private Integer ddd;

    @Column(name = "NM_FONE")
    private String fone;

    @Column(name = "CD_TIPO_FONE")
    private String tipoFone;

    @Column(name = "CD_DDD_FONE2")
    private Integer dddAlternativo;

    @Column(name = "NM_FONE2")
    private String foneAlternativo;

    @Column(name = "CD_TIPO_FONE2")
    private String tipoFoneAlternativo;

    @Column(name = "CD_TURNO")
    private String turno;

    @Column(name = "NR_EXERCICIO")
    private Integer exercicio;

    @Column(name = "CD_MUNICIPIO")
    private String municipio;

    @Column(name = "CD_ESCOLA")
    private Integer escola;

    @Column(name = "CD_TIPO_PREMIO")
    private Integer premio;

    @Column(name = "NM_MAE_ALUNO")
    private String nomeMae;
}
