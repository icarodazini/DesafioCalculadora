package org.example;

import org.example.CalculadoraDeImposto.FuncaoImposto;
import org.example.CalculadoraIMC.FuncaoOperacao;
import org.example.CalculadoraSimples.Funcao;
import org.example.FuncaoGasolina.Gasolina;

public class Main {

    public static void main(String[] args) {

        FuncaoSelecionar.selecionarCalculadoraDesejada();
        Funcao.calculadoraSimples();
        FuncaoOperacao.IMC();
        Gasolina.gasolina();
        FuncaoImposto.impostoRenda();
    }
}