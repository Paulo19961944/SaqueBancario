package com.mycompany.saquebanco;
import java.util.Scanner;

public class SaqueBanco {
    // Declaração de Variáveis
    private float saldoAtual;
    private float saldoAnterior;
    private float valorSaque;
    
    public static void main(String[] args) {
        // Instanciar a Classe Banco
        SaqueBanco banco = new SaqueBanco();
        
        // Instanciar a Classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Capturar os Dados
        System.out.println("\n---------- BANCO ----------\n");
        System.out.print("\nDigite o seu Salario: ");
        banco.saldoAtual = scanner.nextFloat();
        System.out.print("\nDigite o valor do Saque: ");
        banco.valorSaque = scanner.nextFloat();
        
        // Realiza o Saque
        if(banco.valorSaque <= banco.saldoAtual){
            banco.saldoAtual -= banco.valorSaque;
            banco.saldoAnterior = banco.saldoAtual + banco.valorSaque;
            System.out.println("\nTransação bem sucedida!!!\n");
            System.out.println("O Valor do Saque foi: " + banco.valorSaque + " R$");
            System.out.println("O Valor Atual é: " + banco.saldoAtual + " R$");
            System.out.println("O Valor Anterior era: " + banco.saldoAnterior + " R$");
        }else{
            System.out.println("\nSaldo Insuficiente!!!");
        }
    }
}
