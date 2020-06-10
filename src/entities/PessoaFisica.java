package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	public double imposto() {
		double total = 0;
		if (rendaAnual < 20000 && gastosComSaude <= 0) {
			total = rendaAnual * 0.15;
		} else if (rendaAnual < 20000 && gastosComSaude >= 1) {
			total = (rendaAnual * 0.15) - (gastosComSaude * 0.5);
		} else if (rendaAnual >= 20000 && gastosComSaude < 0) {
			total = rendaAnual * 0.25;
		} else {
			total = (rendaAnual * 0.25) - (gastosComSaude * 0.5);
		}
		return total;
	}
	
}
