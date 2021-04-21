package com.orgfree.valdoneves.comparator;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudantes> {
    @Override
    public int compare(Estudantes o1, Estudantes o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
