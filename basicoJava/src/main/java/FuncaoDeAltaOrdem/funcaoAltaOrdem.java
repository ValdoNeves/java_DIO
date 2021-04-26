package FuncaoDeAltaOrdem;

public class funcaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        System.out.println(executarOperacao(soma,10,1));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }
}

interface Calculo{
    public int calculo(int a , int b);
}
