package jdbc_e_jpa;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private ConnectionFactory(){
        throw new UnsupportedOperationException();
    }


    public static Connection getConnection(){
        Connection connection = null;

        //lendo arquivo de propriedades
        try(InputStream input = org.postgresql.core.ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")) {
            //parametros para conectar ao banco postgresql
            Properties properties = new Properties();
            properties.load(input);

            String driver = properties.getProperty("jdbc.driver");
            String dataBaseAddress = properties.getProperty("db.address");
            String dataBaseName = properties.getProperty("db.name");
            String user = properties.getProperty("db.user.login");
            String password = properties.getProperty("db.user.password");

            //construcao da string de conexao
            StringBuilder stringBuilder = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(dataBaseAddress).append("/")
                    .append(dataBaseName);

            String connectionUrl = stringBuilder.toString();
            //criando conexao
            try {

            connection = DriverManager.getConnection(connectionUrl, user, password);
            } catch (SQLException e) {
                System.err.println("FALHA DE CONEXAO");
                e.printStackTrace();
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.err.println("FALHA AO CARREGAR ARQUIVOS DE PROPRIEDADES");
            e.printStackTrace();
        }

        return connection;
    }
}
