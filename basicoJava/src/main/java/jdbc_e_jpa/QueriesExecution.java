package jdbc_e_jpa;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();

        //pega lista completa e armazana
        List<Aluno> alunos = alunoDAO.list();

        //imprime consulta
        alunos.stream().forEach(System.out::println);

        //---------------------------------------------
        //consulta com filtro de id
//        Aluno alunoParaConsulta = alunoDAO.getById(5);

//        System.out.println(alunoParaConsulta);
        //--------------------------------------------------
        //insercao de alunos
//        Aluno alunoParaInsercao = new Aluno(
//                "Matheus",
//                43,
//                "SP"
//        );
//
//        alunoDAO.create(alunoParaInsercao);
            //-----------------------------------------
//        deletando arquivos pelo id
//        alunoDAO.delete(1);
        //----------------------------------
//        Atualizar/ update
//        Aluno alunoParaAtualizar = alunoDAO.getById(3);
//        alunoParaAtualizar.setNome("Joao");
//        alunoParaAtualizar.setIdade(18);
//        alunoParaAtualizar.setEstado("RS");
//
//        alunoDAO.update(alunoParaAtualizar);
    }
}
