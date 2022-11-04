package negocio;

public class Administrativo extends Funcionario{
	
	protected static int DIAS_DO_MES = 30;
	
	public Administrativo(String nome, double salarioBase, int diasFaltantes, int quantidadeHoraExtra) {
		super(nome, salarioBase, diasFaltantes, quantidadeHoraExtra);
	}

	@Override
	public double valorDescontadoPorDia() {
		if(this.getDiasFaltantes() > 0) {
			return (this.getSalarioBase()/DIAS_DO_MES) * this.getDiasFaltantes();
		}
		return 0;
	}

	@Override
	public double valorHoraExtra() {
		if(this.getQuantidadeHoraExtra() > 0) {
			return ((this.getSalarioBase()/DIAS_DO_MES)/HORA_NORMAL_DIARIA) * 1.5 * this.getQuantidadeHoraExtra();
		}
		return 0;
	}

	@Override
	public double valorSalarioTotal() {
		return this.getSalarioBase() - this.valorDescontadoPorDia() + this.valorHoraExtra();
	}

}
