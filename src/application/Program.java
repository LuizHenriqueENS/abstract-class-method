package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i / c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastosComSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			} else {
				System.out.print("Number of employees: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for(Contribuinte cont : list) {
			System.out.println(cont.getNome() + ": $ " + String.format("%.2f", cont.imposto()));
		}
		
		double soma = 0;
		for (Contribuinte cont : list) {
			soma += cont.imposto();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", soma));
		
		
		sc.close();
	}

}
