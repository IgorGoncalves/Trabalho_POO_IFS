/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_poo_ifs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Trabalho_POO_IFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op = 0;

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(5415532595l, "Igor", "99999999"));
        pessoas.add(new Pessoa(643112422l, "Andre", "99999977"));
        pessoas.add(new Pessoa(543112422l, "Willian", "99999988"));
        pessoas.add(new Pessoa(543112427l, "Larissa", "99999944"));
        pessoas.add(new Pessoa(343112415l, "Joana", "99999966"));

        do {

            System.out.println("+Menu+");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Listar todas as pessoas");
            System.out.println("3 - Listar todas as pessoas em Ordem Alfabetica de nome");
            System.out.println("4 - Listar todas as pessoas em Ordem Crescente de CPF");
            System.out.println("5 - Listar todas as pessoas em Ordem Contaria alfabetica");
            System.out.println("6 - Excluir pessoa por CPF");
            System.out.println("0 - Sair");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Pessoa p = new Pessoa();
                    System.out.println("Digite os dados da pessoa cadastrada: ");

                    System.out.print("CPF: ");
                    p.setCPF(sc.nextLong());
                    sc.nextLine();

                    System.out.print("Nome: ");
                    p.setNome(sc.nextLine());

                    System.out.print("Fone: ");
                    p.setFone(sc.nextLine());
                    //adicionado a lista 
                    pessoas.add(p);
                    break;
                case 2:
                    System.out.println("Array");
                    System.out.println("===========================================");
                    pessoas.stream().forEach(x -> System.out.println(x.toString()));
                    System.out.println("===========================================");
                    break;
                case 3:

                    Collections.sort(pessoas, OrdenarPessoa.PorNome.asc());

                    System.out.println("Array Ordenado por nome");
                    System.out.println("===========================================");
                    pessoas.stream().forEach(x -> System.out.println(x.toString()));
                    System.out.println("===========================================");

                    break;
                case 4:

                    Collections.sort(pessoas);

                    System.out.println("Array Ordenado por CPF");
                    System.out.println("===========================================");
                    pessoas.stream().forEach(x -> System.out.println(x.toString()));
                    System.out.println("===========================================");

                    break;
                case 5:

                    Collections.sort(pessoas, OrdenarPessoa.PorNome.desc());

                    System.out.println("Array Ordenado por nome inverso");
                    System.out.println("===========================================");
                    pessoas.stream().forEach(x -> System.out.println(x.toString()));
                    System.out.println("===========================================");

                    break;
                case 6:
                    System.out.println("Digite o CPF da pessoa que você deseja Excluir");
                    long auxCPF = sc.nextLong();
                    Iterator<Pessoa> it = pessoas.iterator();
                    while (it.hasNext()) {
                        Pessoa value = it.next();
                        if (value.getCPF() == auxCPF) {
                            pessoas.remove(value);
                            break;
                        }
                    }
                    break;
            }

            System.out.println("Aperte Enter para continuar para o menu");
            sc.nextLine();
            sc.nextLine();

        } while (op != 0);

    }

}
