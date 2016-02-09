/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_poo_ifs;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author igor
 */
public enum OrdenarPessoa implements Comparator<Pessoa> {

    //Enum permite que possam ser adicionados diferentes comparadores
    PorNome() {
        @Override
        public int compare(Pessoa one, Pessoa other) {
            return one.getNome().compareTo(other.getNome());
        }
    };

    @Override
    public abstract int compare(Pessoa o1, Pessoa o2);

    public Comparator asc() {
        return this;
    }

    public Comparator desc() {
        return Collections.reverseOrder(this);
    }

}

