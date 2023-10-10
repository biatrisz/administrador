package Funcionarios;

public class Principal {

	public static void main(String[] args) {
	funcionario funcionario = new funcionario("Beatriz", "3213-432",20.000,"9043-3443","rua lagos","20/09/06");
    System.out.println("funcionario:");
    System.out.println("nome:" + funcionario.getNome());
    System.out.println("matricula:" + funcionario.getMatricula());
    System.out.println("salário:" + funcionario.getSalario());
    System.out.println("telefone" + funcionario.getTelefone());
    System.out.println("endereco:" + funcionario.getEndereco());
    System.out.println("dataNascimento:" + funcionario.getDataNascimento());
    
    Administrador administrador = new Administrador("Beatriz", "3213-432",20.000,"9043-3443","rua lagos","20/09/06",1234);
    System.out.println("\nAdministrador");
    System.out.println("cra:" + administrador.getCra());
    
    Engenheiro engenheiro = new Engenheiro("Beatriz", "3213-432",20.000,"9043-3443","rua lagos","20/09/06", 1234, 3218);
    System.out.println("\nEngenheiro");
    System.out.println("numCrea:" + engenheiro.getNumCrea());
	}

}
