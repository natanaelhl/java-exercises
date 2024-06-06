import java.util.Scanner;

public class ex_001 {

	public static void main(String[] args) {
		// Váriaveis
		String nomeFuncionario;
		float salarioFuncionario;
		byte dependentes;
		float novoSalario = 0;
		float somaNovoSalario = 0;
		byte acima1700 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		// entrada de dados
		for (byte x = 1 ; x <= 10 ; x++) {
			System.out.print("Digite o nome do " + x +"° funcionário: ");
			nomeFuncionario = leia.next();
			
			System.out.print("Sálario: ");
			salarioFuncionario = leia.nextFloat();
			
			System.out.print("Dependentes: ");
			dependentes = leia.nextByte();
			
			//Cálculos
			
			
			if (salarioFuncionario < 1000) {
				novoSalario = salarioFuncionario + (30 * salarioFuncionario / 100);
			} else if (salarioFuncionario < 2000) {
				novoSalario = salarioFuncionario + (20 * salarioFuncionario / 100);
			} else {
				novoSalario = salarioFuncionario + (10 * salarioFuncionario / 100);
			}
			
			novoSalario += (dependentes * 50);
			
			if (novoSalario > 1700) {
				acima1700 ++;
			}
			
			// Saída de dados
			somaNovoSalario += novoSalario;
			System.out.println("Novo Salario do " + nomeFuncionario +": R$" +  novoSalario);		
			
		}
		
		// Saída de dados
		System.out.println("-----------------------------------------------------------");
		System.out.println("Soma dos novos salário: R$" + somaNovoSalario);
		System.out.println("Média dos novos salários: R$" + (somaNovoSalario / 10));
		System.out.println("Qtd de salários acima de R$1700: " + acima1700);

	}

}
