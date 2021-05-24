package ThreadsTestes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {

    private static final ExecutorService pessoasParaExecutarAtividades = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());

        //Erro não restreavel nesse metodo inteiro
//        List<? extends Future<String>> futuros =
//                new CopyOnWriteArrayList<?>(casa.obterAfazeresDeCasa().stream()
//            .map(atividade -> pessoasParaExecutarAtividades.submit(() -> {
//                try{
//                    return atividade.realizar();
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//                return null;
//                    }
//
//            )).collect(Collectors.toList()));


//        while (!futuros.stream().allMatch(Future::isDone)){
//            int numeroDeAtividadesNaoFinalizadas = 0;
//            for(Future<?> futuro : futuros){
//                if(futuro.isDone()){
//                    try{
//                        System.out.println("Parabens você terminou de " + futuro.get());
//                        futuros.remove(futuro);
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }else{
//                    numeroDeAtividadesNaoFinalizadas++;
//                }
//            }
//            System.out.println("Numero de atividades não finalizadas ::"+numeroDeAtividadesNaoFinalizadas);
//            Thread.sleep(500);
//        }


        pessoasParaExecutarAtividades.shutdown();
    }

}

class Casa{
    private final List<Comodo> comodos;

    Casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDeCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
            pivo.addAll(atividades);
            return pivo;
        });
    }
}

interface Atividade{
    void realizar() throws InterruptedException;
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo{

    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::getArrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }
    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        String arrumarRoupas = "Arrumar o guarda roupa";
        System.out.println(arrumarRoupas);
        return arrumarRoupas;
    }
    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(5000);
        String varrer = "Varrer o quarto";
        System.out.println(varrer);
        return varrer;
    }
    private String getArrumarACama() throws InterruptedException {
        Thread.sleep(5000);
        String arrumarCama = "Arrumar a cama";
        System.out.println(arrumarCama);
        return arrumarCama;
    }
}