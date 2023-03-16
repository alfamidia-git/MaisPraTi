package com.maisprati.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String placa;
	private String cor;
	private String marca;
	private String modelo;
	private int ano;
	private Segmento segmento;
	private Combustivel combustivel;
	private Status status;
	private LocalDate dataEntrega;
	private double valorDiario;
	
	@OneToMany(mappedBy = "veiculo")
	private List<Aluguel> alugueis;
	
	
	
	public enum Segmento{
		CARRO,
		MOTO,
		CAMINHAO
	}
	
	public enum Combustivel{
		GASOLINA,
		ALCOOL,
		HIBRIDO,
		ELETRICO
	}
	
	public enum Status{
		LIVRE,
		ALUGADO
	}
	
}
