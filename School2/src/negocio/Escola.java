package negocio;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	
	private String nome;
	private List<Funcionario> funcionarios;
	private double totalFolhaPagamento;
	
	public Escola(String nome) {
		this.nome = nome;
		this.funcionarios = new ArrayList<Funcionario>();
		this.totalFolhaPagamento = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public double getFolhaPagamento() {
		
		for(int i = 0; i < this.getFuncionarios().size(); i++) {
			this.totalFolhaPagamento += this.getFuncionarios().get(i).valorSalarioTotal();
		}
		return totalFolhaPagamento;
	}

}
