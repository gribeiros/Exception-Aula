package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Numero do Cliente:");
			Integer numero = sc.nextInt();
			System.out.print("Nome do Cliente:");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Saldo inicial:");
			Double saldo = sc.nextDouble();
			System.out.print("Valor limite de saque:");
			Double saqueLimite = sc.nextDouble();
			
			Conta conta = new Conta(numero, nome, saldo, saqueLimite);

			System.out.println("");
			System.out.print("Valor do saque:");
			Double saque = sc.nextDouble();
			System.out.println("");

			conta.saque(saque);
			System.out.println("Novo saldo:$" + String.format("%.2f", conta.getSaldo()));

		} catch (InputMismatchException e) {
			System.out.print("Erro entre com uma letra: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}

		sc.close();

	}
}
