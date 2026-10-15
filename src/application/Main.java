package application;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);
        ArrayList<Contribuintes> pagantes = new ArrayList<>();

        System.out.println("Insira o número de contribuintes");
        int n = valor.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do " + i + "° contribuinte");
            System.out.println("Fisica ou Juridica? (f/j)");
            char ch = string.next().charAt(0);
            string.nextLine();
            System.out.println("Name: ");
            String name = string.nextLine();
            System.out.println("Renda anual: ");
            Double rendaAnual = valor.nextDouble();

            if(ch == 'f'){
                System.out.println("Despesas médicas: ");
                Double gastosSaude = valor.nextDouble();
                pagantes.add(new PessoaFisica(name, rendaAnual, gastosSaude));
            } else{
                System.out.println("Quantidade de funcionários: ");
                Integer numerosFuncionarios = valor.nextInt();
                pagantes.add(new PessoaJuridica(name, rendaAnual, numerosFuncionarios));
            }
        }

        for (Contribuintes cont : pagantes){
            System.out.println(cont.toString());
        }

        Double sum = 0.0;
        for (Contribuintes cont : pagantes){
           sum += cont.valorImposto();
        }

        System.out.println("TOTAL DE IMPOSTO " + sum);
    }
}