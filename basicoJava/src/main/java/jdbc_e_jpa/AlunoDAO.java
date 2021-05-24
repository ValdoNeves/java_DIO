package jdbc_e_jpa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    //consulta
    public List<Aluno> list(){

        //prepara lista que ira retonar alunos apos consultar o banco de dados
        List<Aluno> alunos = new ArrayList<>();


        //------------------------------------------

        try (Connection conn = ConnectionFactory.getConnection()){
            //preparando consulta sql
            String sql = "SELECT id, nome, idade, estado FROM aluno";

            //preparando statement com os parametros recebidos
            PreparedStatement prst = conn.prepareStatement(sql);

            //Executando consulta e armazenando o retorno
            ResultSet rs = prst.executeQuery();

            //enquanto tiver linhas continuar o while
            while(rs.next()){
                Aluno aluno = new Aluno(rs.getInt("id"),rs.getString("nome"),rs.getInt("idade"),rs.getString("estado"));
                alunos.add(aluno);
            }

        } catch (SQLException e) {
            System.err.println("Falha, na listagem de alunos!");
            e.printStackTrace();
        }
        //------------------------------------------

        return alunos;
    }

//    consulta com filtro
    public Aluno getById(int id){
        //preparar objeto aluno para receber o valor do banco
        Aluno aluno = new Aluno();

        try(Connection conn = ConnectionFactory.getConnection()){
            //preparar consulta SQL
            String sql = "SELECT id, nome, idade, estado FROM aluno WHERE id=?";

            //preparar o statement
            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setInt(1,id);

            //executando e armazenando
            ResultSet rs = prst.executeQuery();

            //guardar o valor encontrado
            if(rs.next()){
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setEstado(rs.getString("estado"));
            }
        } catch (SQLException throwables) {
            System.err.println("Erro na listagem!");
            throwables.printStackTrace();
        }

        return aluno;
    }

    //Insercao de dados
    public void create(Aluno aluno){
        try(Connection conn = ConnectionFactory.getConnection()){

            String sql = "INSERT INTO aluno(nome, idade, estado) VALUES (?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,aluno.getNome());
            preparedStatement.setInt(2,aluno.getIdade());
            preparedStatement.setString(3,aluno.getEstado());

            //armazenar a quantidade de linhas afetadas
            int linhasAfetadas = preparedStatement.executeUpdate();

            System.out.println("Inserção Bem Sucedida. Foi adicionada "+ linhasAfetadas + " linha(s)!");
        } catch (SQLException throwables) {
            System.err.println("Inserção falhou!");
            throwables.printStackTrace();
        }
    }

    public void delete(int id){
        try(Connection conn = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM aluno WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);

            int rowAffected = ps.executeUpdate();
            System.out.println("Delete Bem Sucedida! Foi deletada " + rowAffected +" linha(s)!");
        } catch (SQLException throwables) {
            System.err.println("Delete Falhou!");
            throwables.printStackTrace();
        }
    }

    public void update(Aluno aluno){
        try(Connection conn = ConnectionFactory.getConnection()){
            String sql = "UPDATE aluno SET nome = ?, idade = ?, estado = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getIdade());
            ps.setString(3, aluno.getEstado());
            ps.setInt(4, aluno.getId());

            int rowAffected = ps.executeUpdate();

            System.out.println("Atualização Bem Sucedida! Foi atualizada: " + rowAffected+ " linha(s)!");
        } catch (SQLException throwables) {
            System.err.println("Atualização Falhou!");
            throwables.printStackTrace();
        }
    }


}
