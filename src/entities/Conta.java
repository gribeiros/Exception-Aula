package entities;

import exceptions.DomainException;

public class Conta {

		Integer numero;
		String nome;
		Double saldo;
		Double saqueLimite;
		
		public Conta(Integer numero, String nome, Double saldo, Double saqueLimite) {
			this.numero = numero;
			this.nome = nome;
			this.saldo = saldo;
			this.saqueLimite = saqueLimite;
		}

		public Integer getNumero() {
			return numero;
		}

		public void setNumero(Integer numero) {
			this.numero = numero;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getSaldo() {
			return saldo;
		}


		public Double getSaqueLimite() {
			return saqueLimite;
		}

		public void setSaqueLimite(Double saqueLimite) {
			this.saqueLimite = saqueLimite;
		}
		
		
		public void deposito(double depo) {
			saldo+=depo;
		}
		
		public void saque(double saque) throws DomainException {
			if(saque > saqueLimite) {
				throw new DomainException("Passou o saque limite");
			}
			if(saque > saldo) {
				throw new DomainException("Saldo insuficiente");
			}
			saldo-=saque;
		}
}
