package br.com.spring.mvc.dao.mapper;

import br.com.spring.mvc.model.AlunoHistorico;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by allan on 09/08/16.
 */
@NoArgsConstructor
public class AlunoRowMapper implements RowMapper<AlunoHistorico> {

    public AlunoHistorico mapRow(ResultSet resultSet, int arg1) throws SQLException {
        AlunoHistorico alunoHistorico = new AlunoHistorico();
        alunoHistorico.setExercicio(resultSet.getInt("NR_EXERCICIO"));
        alunoHistorico.setCadeirante(resultSet.getBoolean("IN_CADEIRANTE"));
        alunoHistorico.setCodigoAluno(resultSet.getString("CD_CODIGO"));
        alunoHistorico.setCpf(resultSet.getString("NM_CPF"));
        alunoHistorico.setNascimento(resultSet.getDate("DT_NASCIMENTO"));
        alunoHistorico.setEmail(resultSet.getString("NM_EMAIL"));
        alunoHistorico.setCep(resultSet.getString("NM_CEP"));
        alunoHistorico.setBairro(resultSet.getString("NM_BAIRRO"));
        alunoHistorico.setComplemento(resultSet.getString("NM_COMPLEMENTO"));
        alunoHistorico.setEndereco(resultSet.getString("NM_ENDERECO"));
        alunoHistorico.setNumero(resultSet.getString("NM_NUMERO"));
        alunoHistorico.setDescricao(resultSet.getString("DS_DEF_DESCRICAO"));
        alunoHistorico.setBraile(resultSet.getBoolean("IN_PROVA_BRAILE"));
        alunoHistorico.setLibra(resultSet.getBoolean("IN_PROVA_LIBRA_DEFICIENTE_AUDITIVO"));
        alunoHistorico.setAmpliada(resultSet.getBoolean("IN_PROVA_AMPLIADA"));
        alunoHistorico.setNivel(resultSet.getInt("CD_NIVEL"));
        alunoHistorico.setNome(resultSet.getString("NM_ALUNO"));
        alunoHistorico.setNota(resultSet.getInt("VL_NOTA"));
        alunoHistorico.setOutrasDefinicoes(resultSet.getBoolean("IN_OUTRAS_DEF"));
        alunoHistorico.setPic(resultSet.getBoolean("IN_PIC"));
        alunoHistorico.setSexo(resultSet.getString("CD_SEXO"));
        alunoHistorico.setMunicipio(resultSet.getString("CD_MUNICIPIO"));
        alunoHistorico.setEscola(resultSet.getInt("CD_ESCOLA"));
        alunoHistorico.setPremio(resultSet.getInt("CD_TIPO_PREMIO"));
        alunoHistorico.setAno(resultSet.getInt("CD_ANO"));
        alunoHistorico.setTurno(resultSet.getString("CD_TURNO"));
        alunoHistorico.setAdventista(resultSet.getBoolean("IN_ADVENTISTA"));
        alunoHistorico.setDetento(resultSet.getBoolean("IN_DETENTO"));
        alunoHistorico.setDdd(resultSet.getInt("CD_DDD_FONE"));
        alunoHistorico.setFone(resultSet.getString("NM_FONE"));
        alunoHistorico.setTipoFone(resultSet.getString("CD_TIPO_FONE"));
        alunoHistorico.setDddAlternativo(resultSet.getInt("CD_DDD_FONE2"));
        alunoHistorico.setFoneAlternativo(resultSet.getString("NM_FONE2"));
        alunoHistorico.setTipoFoneAlternativo(resultSet.getString("CD_TIPO_FONE2"));

        return alunoHistorico;
    }
}