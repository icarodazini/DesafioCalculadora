package org.example;

import org.example.CalculadoraSimples.Funcao;
import org.example.CalculadoraSimples.FuncaoOperacao;

import java.util.Scanner;

public class FuncaoSelecionar {

    public static void selecionarCalculadoraDesejada() {
        String selecionar;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha sua cauculadora: imc, simples.");
        selecionar = entrada.nextLine();

        switch (selecionar) {
            case "calculadora de imc" -> FuncaoOperacao.somar();
            case "calculadora simples" -> FuncaoOperacao.subtrair();
            case "calculadora de viagem" -> FuncaoOperacao.multiplicar();
            case "calculadora de imposto" -> FuncaoOperacao.dividir();
        }
    }
}