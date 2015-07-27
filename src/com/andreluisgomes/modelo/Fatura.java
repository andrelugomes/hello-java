package com.andreluisgomes.modelo;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by agomes on 27/07/15.
 */
public class Fatura {
	
	private String emailDevedor;
	private double valor;
	private LocalDate dataVencimento;

	public Fatura(String emailDevedor, double valor, LocalDate dataVencimento) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public double getValor() {
		return valor;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public String getEmailDevedor() {
		return emailDevedor;
	}

	public String  resumo(){
		String dataVencimento = this.dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return  String.format("Valor R$ : %s, vencimento : %s", this.valor, dataVencimento);
	}
}