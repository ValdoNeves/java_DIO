package jdbc_e_jpa;

import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private int idade;

    @ManyToOne(fetch = FetchType.LAZY)
    private Estado estado;

    public Aluno(){}

    public Aluno(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public Aluno(String nome, int idade, Estado estado){
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }



    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno { ");
            sb.append("id = ").append(id);
            sb.append(", nome = ").append(nome);
            sb.append(", idade = ").append(idade);
            sb.append(", estado = ").append(estado);
            sb.append(" }");
        return sb.toString();
    }
}
