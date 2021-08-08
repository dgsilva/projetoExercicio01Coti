package repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	private String path;

	public FuncionarioRepository(String path) {
		super();
		this.path = path;
	}


	/**
	 * Método para gravar um arquivo TXT contendo os dados do Funcionario
	 */
	public void gravarArquivo(Funcionario funcionario) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter(new File(path));
		printWriter.write(funcionario.toString());
		printWriter.flush();
		printWriter.close();

	}

}
