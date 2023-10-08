package com.mycompany.saquebanco;
import java.util.Scanner;

public class SaqueBanco {
    // Declaração de Variáveis de instância
    private float saldoAnterior;
    private float valorSaque;
    private float saldoAtual;
    
    public static void main(String[] args) {
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);

        // Instancia a Classe SaqueBanco
        SaqueBanco saqueBanco = new SaqueBanco();

        // Capturar Dados
        System.out.println("\n----------SAQUE BANCO----------\n");
        System.out.print("Digite o seu Salário: ");
        saqueBanco.saldoAnterior = sc.nextFloat();
        System.out.print("Digite o quanto você quer sacar: ");
        saqueBanco.valorSaque = sc.nextFloat();

        // Realiza o Saque
        if (saqueBanco.valorSaque <= saqueBanco.saldoAnterior) {
            saqueBanco.saldoAtual = saqueBanco.saldoAnterior - saqueBanco.valorSaque;
            System.out.println("\nO seu Saldo Anterior era: " + saqueBanco.saldoAnterior +" R$");
            System.out.println("O seu Saldo Atual é: " + saqueBanco.saldoAtual + " R$");
        } else {
            System.out.println("\nSaldo Insuficiente!!!");
        }
        System.out.println("\n---------- FIM ----------");
    }
}
