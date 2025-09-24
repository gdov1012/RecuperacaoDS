/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstituiçãoFinanceiraConstrutor;

/**
 *
 * @author Administrador
 */
public class ContaBancaria {

    public ContaBancaria(double saldo, double limiteCredito) {
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }
    double saldo;
    double limiteCredito;
        
    public void verificarSaque(double saque){
        
    double somaTotal = (this.saldo + this.limiteCredito);
    
        if(saque <= (somaTotal)){
            System.out.println("Voce pode sacar R$" + saque);
        }else {
            System.out.println("Voce nao pode sacar R$" + saque);
        }
       
    }
    public void exibirInfo(){
        System.out.println("--- Conta Bancaria ---");
        System.out.println("Seu saldo e de: " + saldo);
        System.out.println("Seu limite de credito e de: " + limiteCredito);
        System.out.println("----------------------");
    }
}
