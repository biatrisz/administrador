package Funcionarios;

public class funcionario {
private String nome;
private String matricula;
private Double salario;
private String telefone;
private String endereco;
private String dataNascimento;
public String getnumCrea;
public funcionario(String nome, String matricula, Double salario, String telefone, String endereco,
		String dataNascimento) {
	this.nome = nome;
	this.matricula = matricula;
	this.salario = salario;
	this.telefone = telefone;
	this.endereco = endereco;
	this.dataNascimento = dataNascimento;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
}
