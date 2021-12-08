package com.banco.com;

import javax.swing.*;

public class BancoVander {
    public static void main(String[] args) {
        Conta conta = new Conta();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Meno eletrônico: " +
                "\n 1 - Depósito" +
                "\n 0 - Sair"));
        while (op != 0){

            if (op == 1){
                conta.Depositar();

            }
            if (op == 0){
                break;
            }
        }
    }
}
