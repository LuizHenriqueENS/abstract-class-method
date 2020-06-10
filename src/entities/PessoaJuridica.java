package entities;

public class PessoaJuridica extends Contribuinte {

	private int numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	public double imposto() {
		double total = 0;
		if (numeroDeFuncionarios > 10) {
			total = rendaAnual * 0.14;
		} else {
			total = rendaAnual * 0.16;
		}
		return total;
	}
	
}
