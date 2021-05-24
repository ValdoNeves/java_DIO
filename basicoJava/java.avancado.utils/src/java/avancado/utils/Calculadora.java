package java.avancado.utils;

import java.avancado.utils.internal.DivHelper;
import java.avancado.utils.internal.MultHelper;
import java.avancado.utils.internal.SomaHelper;
import java.avancado.utils.internal.SubHelper;

public class Calculadora {

    private final DivHelper divHelper;
    private final MultHelper multHelper;
    private final SomaHelper somaHelper;
    private final SubHelper subHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        somaHelper = new SomaHelper();
        subHelper = new SubHelper();

    }

    public int soma(int a, int b){

        return somaHelper.executavel(a, b);
    }

    public int divisao(int a, int b){

        return divHelper.executavel(a, b);
    }

    public int multiplicacao(int a, int b){

        return multHelper.executavel(a, b);
    }

    public int subtracao(int a, int b){

        return subHelper.executavel(a, b);
    }


}
