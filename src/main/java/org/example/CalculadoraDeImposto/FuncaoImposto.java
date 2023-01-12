package org.example.CalculadoraDeImposto;

import java.util.Scanner;

public class FuncaoImposto {

    public static void impostoRenda () {

        System.out.println("Digite seu salário bruto mensal: ");

        Scanner digiteosalario = new Scanner(System.in);

        double salario = digiteosalario.nextInt();


        if ( salario < 1903.98)
            System.out.print("Você está isento de imposto de renda");
        else
        if ((salario>1903.98)&&(salario<2826.65))
            System.out.print("Você está com 7,50% de imposto de renda");
        else
        if ((salario>2826.66)&&(salario<3751.05))
            System.out.print("Você está com 15,00% de imposto de renda");
        else
        if ((salario>3751.06)&&(salario<4664.68))
            System.out.print("Você está com 22,50% de imposto de renda");
        else
        if (salario>4664.68)
            System.out.print("Você está com 27,50% de imposto de renda");
        {
            double imposto = salario * 0.075;

            double salariodeduzido = salario - imposto;

            System.out.printf(" que é equivalente a R$ %.2f, e receberá o salário líquido de %.2f", imposto, salariodeduzido);

        }

    }
}
