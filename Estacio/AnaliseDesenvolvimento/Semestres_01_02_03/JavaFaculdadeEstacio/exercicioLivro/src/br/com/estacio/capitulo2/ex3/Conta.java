/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo2.ex3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Conta {

    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public Conta(String nome, int conta, double saldo_inical) {
        this.nome = nome;
        this.conta = conta;
        saques = 0;
        saldo = saldo_inical;
    }

    public void extrato() {
        System.out.println("\tExtratos");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n", this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }

    public void iniciar() {
        int opcao;
        do {
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);

        } while (opcao != 4);

    }

    public void exibeMenu() {
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");
    }

    public void escolheOpcao(int opcao) {
        double valor;
        switch (opcao) {
            case 1:
                extrato();
                break;
            case 2:
                if (saques < 3) {
                    System.out.print("Quanto deseja sacar: ");
                    valor = entrada.nextDouble();
                    sacar(valor);
                } else {
                    System.out.println("Limite de saques diários atingidos.\n");
                }
                break;
            case 3:
                System.out.print("Quanto deseja depositar: ");
                valor = entrada.nextDouble();
                depositar(valor);
                break;
            case 4:
                System.out.println("Sistema encerrado.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
