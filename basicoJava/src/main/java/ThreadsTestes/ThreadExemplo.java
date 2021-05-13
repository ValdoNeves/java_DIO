package ThreadsTestes;

/*
    para trabalhar com threads temos duas formar criar uma classe que extends da classe "Thread"
    como no exemplo da barraDeCarregamento2

    ou com a implementacao do metodo run, utilizando Runnable como nos demais exemplos

 */
public class ThreadExemplo {

    public static void main(String[] args) {
        //nomes com iniciar pois threads indicam uma ação
        GeradorPDF iniciarGeradorPDF = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        iniciarBarraDeCarregamento.start();

    }
}


class GeradorPDF extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado!");
    }
}

class BarraDeCarregamento extends Thread{


    private GeradorPDF iniciarGeradorPDF;

    public BarraDeCarregamento(GeradorPDF iniciarGeradorPDF) {
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(500);
                if(!iniciarGeradorPDF.isAlive()){
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


/*
Dois exemplos de implementacao de Tread, mas utilizar o extends Thread nos da
uma maior gama de metodos pra utilizar
 */

//class BarraDeCarregamento implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("Loading...");
//    }
//}
//
//class BarraDeCarregamento2 extends Thread{
//
//    @Override
//    public void run() {
//        super.run();
//        System.out.println("rodei - " + this.getName());
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}