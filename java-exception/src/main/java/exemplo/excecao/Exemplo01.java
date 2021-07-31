package exemplo.excecao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo01 {

    public static void main(String[] args) {
        // Checked Exceptions
        try {
            PreparedStatement stmt = con.prepareStatement(query);
        } catch (SQLException e) {
            throw new AcessoADadosException("Problema na criação do Statement");
        }

        // Unchecked Exceptions
        try {
            CarroVo carro = new CarroVo();
            carro.getPlaca();
        } catch (IntegrationException e) {
            throw new BusinessException("Erro na criação do objeto", e);
        }

        // Finally
        try {
            PreparedStatement stmt = con.prepareStatement(query);
        } catch (SQLException e) {
            throw new AcessoADadosException("Problema na criação do Statement");
        } finally {
            stmt.close();
        }

        // Throw e Throws
        public String recuperarIdUsuario(String query) throws AcessoADadosException {

            try {
                PreparedStatement stmt = con.prepareStatement(query);
            } catch (SQLException e) {
                throw new AcessoADadosException("Problema na criação do Statement");
            } finally {
                stmt.close();
            }
        }
    }
}
