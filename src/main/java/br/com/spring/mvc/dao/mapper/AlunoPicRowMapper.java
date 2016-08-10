package br.com.spring.mvc.dao.mapper;

import br.com.spring.mvc.model.AlunoPic;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by allan on 09/08/16.
 */
@NoArgsConstructor
public class AlunoPicRowMapper implements RowMapper<AlunoPic> {

    public AlunoPic mapRow(ResultSet resultSet, int arg1) throws SQLException {
        AlunoPic alunoPic = new AlunoPic();

        alunoPic.setIdPrograma(resultSet.getInt("programa_id"));
        alunoPic.setIdAlunoPic(resultSet.getInt("id"));
        alunoPic.setCpf(resultSet.getString("cpf"));
        alunoPic.setEmail(resultSet.getString("email"));
        alunoPic.setCep(resultSet.getString("endereco_cep"));
        alunoPic.setBairro(resultSet.getString("endereco_bairro"));
        alunoPic.setComplemento(resultSet.getString("endereco_complemento"));
        alunoPic.setLogradouro(resultSet.getString("endereco_logradouro"));
        alunoPic.setNumero(resultSet.getString("endereco_numero"));
        alunoPic.setNome(resultSet.getString("nome"));
        alunoPic.setSexo(resultSet.getString("sexo"));
        alunoPic.setTelefone(resultSet.getString("telefone"));
        alunoPic.setTelefoneAlternativo(resultSet.getString("telefone_alt"));
        alunoPic.setAnoPremiacao(resultSet.getInt("premiacao_ano"));

        return alunoPic;
    }
}