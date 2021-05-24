package FuncaoDeAltaOrdem;

public class funcaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo mult = (a, b) -> a * b;
        Calculo div = (a, b) -> a / b;
        Calculo sub = (a, b) -> a - b;

        System.out.println(executarOperacao(soma,10,1)+ " soma");
        System.out.println(executarOperacao(sub,10,1)+ " sub");
        System.out.println(executarOperacao(div,10,1) + " div");
        System.out.println(executarOperacao(mult,10,1) + " mult");
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

interface Calculo{
    int calcular(int a, int b);
}
