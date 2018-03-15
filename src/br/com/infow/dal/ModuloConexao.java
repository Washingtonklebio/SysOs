package br.com.infow.dal;
import java.sql.*;

/**
 *
 * @author Washington Klébio
 */
public class ModuloConexao {

    //Metodo responsavel por estabelecer a conexão com o banco.
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // A linha abaixo chama o drive importado para biblioteca.
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referentes ao banco.
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão com banco de dados.
        try {
            Class.forName(driver);// Executar arquivo do drive.
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve de apoio para descobrir o erro.
            //System.out.println(e);
            return null;
        }
    }
}