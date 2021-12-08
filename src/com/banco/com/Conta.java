package com.banco.com;

import javax.swing.*;

public class Conta {
    private double saldo;
    private double deposito;

    public Conta() {

    }


    public void Depositar (){
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito:"));
        this.saldo = saldo + deposito;
        JOptionPane.showMessageDialog(null,"O valor depositado foi de" + deposito);

    }

    public Conta(double saldo, double deposito) {
        this.saldo = saldo;
        this.deposito = deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", deposito=" + deposito +
                '}';
    }
}
