package negocio;

public class Main {
	public static void main(String[] args) {
		
		Escola escola = new Escola("IFBA");
		
		escola.getFuncionarios().add(new Professor("Luis Fernando", 5000, 2, 8));
		escola.getFuncionarios().add(new Administrativo("Lucas Cezar", 5000, 1, 0));
		escola.getFuncionarios().add(new Professor("Iris Souza", 3000, 0, 3));
		
		
		System.out.println("Salario funcionarios: ");
		for(int i = 0; i < escola.getFuncionarios().size(); i++) {
			System.out.println(escola.getFuncionarios().get(i).valorSalarioTotal());
		}
		
		System.out.println("Folha de pagamento: ");
		System.out.println(escola.getFolhaPagamento());
	}
}
