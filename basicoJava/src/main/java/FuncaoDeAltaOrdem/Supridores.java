package FuncaoDeAltaOrdem;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {

        Supplier<Pessoa> pessoa = () -> new Pessoa();
        Supplier<Pessoa> pessoa2 = Pessoa::new;

        System.out.println(pessoa.get());
        System.out.println(pessoa2.get());


    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Eu";
        idade = 32;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", idade= " + idade + " ";
    }
}
