package Funcionarios;

public class Médico extends funcionario {
	private int crm;
	public Médico(String nome, String matricula, Double salario, String telefone, String endereco,
			String dataNascimento) {
		super(nome, matricula, salario, telefone, endereco, dataNascimento);

	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}


}
