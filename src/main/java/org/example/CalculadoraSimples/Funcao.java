package org.example;

import org.example.CalculadoraSimples.FuncaoDividir;
import org.example.CalculadoraSimples.FuncaoMultiplicar;
import org.example.CalculadoraSimples.FuncaoSoma;
import org.example.CalculadoraSimples.FuncaoSubtrair;

import java.util.Scanner;

public class Funcao {

    public static void funcao() {
        String operacao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha sua operação: somar, subtrair, multiplicar, dividir.");
        operacao = entrada.nextLine();

        switch( operacao )
        {
            case "somar":
                FuncaoSoma.somar();
                break;

            case "subtrair":
                FuncaoSubtrair.subtrair();
                break;

            case "multiplicar":
                FuncaoMultiplicar.multiplicar();
                break;

            case "dividir":
                FuncaoDividir.dividir();
                break;

            default:
                System.out.printf("Você digitou uma operação inválida.");
        }
    }
}