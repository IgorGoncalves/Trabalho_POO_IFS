/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_poo_ifs;

/**
 *
 * @author igor
 */
public class Pessoa implements Comparable<Pessoa> {

    private long CPF;
    private String nome;
    private String fone;

    // <editor-fold defaultstate="collapsed" desc="Construtores">    
    public Pessoa() {
    }

    public Pessoa(long CPF, String nome, String fone) {
        this.CPF = CPF;
        this.nome = nome;
        this.fone = fone;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Nome"> 
    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Fone"> 
    /**
     * Get the value of fone
     *
     * @return the value of fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * Set the value of fone
     *
     * @param fone new value of fone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="CPF"> 
    /**
     * Get the value of CPF
     *
     * @
     * return the value of CPF
     *
     */
    public long getCPF() {
        return CPF;
    }

    /**
     * Set the value of CPF
     *
     * @param CPF new value of CPF
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Comparação para ordenação"> 
    @Override
    public int compareTo(Pessoa o) {
        if (this.CPF > o.CPF) {
            return -1;
        }
        if (this.CPF < o.CPF) {
            return 1;
        }
        return 0;
    }
    // </editor-fold>

    //Sobrescrita desse metodo permite uma apresentação do objeto na forma de uma string
    @Override
    public String toString() {
        return String.format("CPF: %011d; Nome: %s; Fone: %s; \n", this.CPF, this.nome, this.fone);
    }

    
}
