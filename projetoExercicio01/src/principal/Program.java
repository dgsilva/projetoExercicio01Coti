package principal;

import java.io.FileNotFoundException;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setIdFuncionario(1);
		funcionario.setNome("Diego");
		funcionario.setCpf("123-456-789-00");
		funcionario.setMatricula("123852");
		funcionario.setSalario(3500.00);
		
		System.out.println("Código...." + funcionario.getIdFuncionario());
		System.out.println("Nome...." + funcionario.getNome());
		System.out.println("CPF...." + funcionario.getCpf());
		System.out.println("Matricula...." + funcionario.getMatricula());
		System.out.println("Salario...." + funcionario.getSalario());
		
		
		FuncionarioRepository funcionarioRepository= new FuncionarioRepository("F:\\Desenvolvimento Java\\Workspace-CotiSergio21\\temp\\funcionario.txt");
		try {
			funcionarioRepository.gravarArquivo(funcionario);
			System.out.println("Dados gravado com sucesso.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
