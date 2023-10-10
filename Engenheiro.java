package Funcionarios;

public class Engenheiro extends funcionario{
public Engenheiro(String nome, String matricula, Double salario, String telefone, String endereco,
			String dataNascimento, int i, int j) {
		super(nome, matricula, salario, telefone, endereco, dataNascimento);
		
	}

private int numCrea;
	public int getNumCrea() {
	return numCrea;
}
public void setNumCrea(int numCrea) {
	this.numCrea = numCrea;
}
public int getnumCrea() {
	return numCrea;
}

public void setnumCrea(int numCrea) {
	this.numCrea = numCrea;

}
}