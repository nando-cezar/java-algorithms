package negocio;

public abstract class Funcionario {
	
	private String nome;
	private double salarioBase;
	private int diasFaltantes;
	private int quantidadeHoraExtra;
	
	protected static int HORA_NORMAL_DIARIA = 8;
	
	public Funcionario(String nome, double salarioBase, int diasFaltantes, int quantidadeHoraExtra) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.diasFaltantes = diasFaltantes;
		this.quantidadeHoraExtra = quantidadeHoraExtra;
	}
	
	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public int getDiasFaltantes() {
		return diasFaltantes;
	}

	public int getQuantidadeHoraExtra() {
		return quantidadeHoraExtra;
	}

	public abstract double valorDescontadoPorDia() throws Exception;
	
	public abstract double valorHoraExtra();
	
	public abstract double valorSalarioTotal();
	
}
