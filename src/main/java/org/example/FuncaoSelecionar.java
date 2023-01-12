package org.example;

import org.example.CalculadoraDeImposto.FuncaoImposto;
import org.example.CalculadoraIMC.FuncaoIMC;
import org.example.CalculadoraSimples.Funcao;
import org.example.FuncaoGasolina.Gasolina;

import java.util.Scanner;

public class FuncaoSelecionar {

    public static void selecionarCalculadoraDesejada() {
        int selecionar;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha sua calculadora");
        System.out.println("1 imc");
        System.out.println("2 simples");
        System.out.println("3 viagem");
        System.out.println("4 imposto");
        selecionar = entrada.nextInt();

        switch (selecionar) {
            case 1 -> FuncaoIMC.IMC();
            case 2 -> Funcao.calculadoraSimples();
            case 3 -> Gasolina.gasolina();
            case 4 -> FuncaoImposto.impostoRenda();
        }
    }
}