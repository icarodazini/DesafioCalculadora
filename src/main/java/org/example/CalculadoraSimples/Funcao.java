package org.example.CalculadoraSimples;

import java.util.Scanner;

public class Funcao {

    public static void calculadoraSimples() {
        String operacao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha sua operação: somar, subtrair, multiplicar, dividir.");
        operacao = entrada.nextLine();

        switch( operacao )
        {
            case "somar":
                FuncaoOperacao.somar();
                break;

            case "subtrair":
                FuncaoOperacao.subtrair();
                break;

            case "multiplicar":
                FuncaoOperacao.multiplicar();
                break;

            case "dividir":
                FuncaoOperacao.dividir();
                break;

            default:
                System.out.printf("Você digitou uma operação inválida.");
        }
    }

}