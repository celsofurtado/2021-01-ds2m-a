package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		Conta contaAnaGomes = new Conta();
		Conta contaDoJoao = new Conta();
		
		//contaAnaGomes.setTitular("Ana Gomes");
		contaAnaGomes.setNumero("111-98");
		contaAnaGomes.setTipo("Poupan�a");
		contaAnaGomes.setAtiva(true);
		contaAnaGomes.setChequeEspecial(200);
		contaAnaGomes.depositar(100);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.depositar(30);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(50);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(500);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(50);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(80);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.depositar(100);
		contaAnaGomes.mostrarSaldoDaConta();
		
		
		double a = contaAnaGomes.getSaldo();
		System.out.println("****" + contaAnaGomes.getSaldo());
		
		//System.out.println("Nome: " + contaAnaGomes.getTitular());
		System.out.println("Tipo: " + contaAnaGomes.getTipo());
		System.out.println("Conta: " + contaAnaGomes.getNumero());
		System.out.println("Limite: " + contaAnaGomes.getChequeEspecial());
		
		
		Cliente cliente = new Cliente();
		
		contaAnaGomes.isAtiva();
	}
	

}
