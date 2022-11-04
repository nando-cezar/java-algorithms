package negocio;

public class Professor extends Funcionario{
	
	protected static int DIAS_DO_MES = 12;
	
	public Professor(String nome, double salarioBase, int diasFaltantes, int quantidadeHoraExtra) {
		super(nome, salarioBase, diasFaltantes, quantidadeHoraExtra);
	}

	@Override
	public double valorDescontadoPorDia() throws Exception{
		throw new Exception("Não existe desconto por causa de faltas, "
				+ "que os professores terão que repor as aulas não ministradas.");
	}

	@Override
	public double valorHoraExtra() {
		if(this.getQuantidadeHoraExtra() > 0) {
			return ((this.getSalarioBase()/DIAS_DO_MES)/HORA_NORMAL_DIARIA) * 2.5 * this.getQuantidadeHoraExtra();
		}
		return 0;
	}

	@Override
	public double valorSalarioTotal() {
		return this.getSalarioBase() + this.valorHoraExtra();
	}
	
	
}
