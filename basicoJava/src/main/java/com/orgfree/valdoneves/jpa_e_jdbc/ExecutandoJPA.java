package com.orgfree.valdoneves.jpa_e_jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutandoJPA {

    public static void main(String[] args) {


        //gerenciamento com o banco de dados pelo arquivo persistence.xml
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-DIO2");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //instancias a serem adicionadas ao banco
        Estado estadoParaAdicionar = new Estado("Bahia", "BA");
        Aluno alunoParaAdicionar = new Aluno("Titan Neves", 1, estadoParaAdicionar);

        //iniciando uma transacao
        entityManager.getTransaction().begin();

        //agora devemos pesistir os dados
        entityManager.persist(estadoParaAdicionar);

        entityManager.persist(alunoParaAdicionar);

        entityManager.getTransaction().commit();

        //fechando o intityManager e tambem intityManagerFactory
        entityManager.close();
        entityManagerFactory.close();




    }
}
