package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelOperacional;

public class Trabalhador {
	private String nome;
	private NivelOperacional nivel;
	private Double salario;
	
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelOperacional nivel, Double salario, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelOperacional getNivel() {
		return nivel;
	}

	public void setNivel(NivelOperacional nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(Contrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(int ano, int mes) {
		double soma = salario;
		Calendar calendario = Calendar.getInstance();
		for (Contrato c: contratos) {
			calendario.setTime(c.getData());
			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes = 1 + calendario.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
