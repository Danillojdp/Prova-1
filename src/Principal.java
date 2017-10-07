import java.util.ArrayList;

//  Prova 1 LTP

// Aluno: Jorge Danillo Pereira	
// RA: 21603818

public class Principal {

	public static void main(String[] args) {

		BDSimulado bds = new BDSimulado();
		
		//Questão 4
		System.out.println("\n 4 ");
		ArrayList<Ligacao> contaEmpresa = bds.contaEmpresa("LG");
		for (int i = 0; i < contaEmpresa.size(); i++) {
			System.out.println(contaEmpresa.get(i));

		}
		//Questão4b
		System.out.println("\n 3b ");

		ArrayList<Ligacao> contaEmpresaVip = bds.contaCliente("Otaviano Neves");
		for (int i = 0; i < contaEmpresaVip.size(); i++) {
			System.out.println(contaEmpresaVip.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorLigacaoCliente(contaEmpresa.get(i).getCodigo()) + " R$"));
		}

		
		//2a :
		System.out.println("2a");
		System.out.println(bds.getInfoCliente("Otaviano Neves"));

		//2b :
		System.out.println("\n 2b");
		ArrayList<Ligacao> ligacoesPorCliente = bds.ligacoesPorCliente("Otaviano Neves");
		for (int i = 0; i < ligacoesPorCliente.size(); i++) {
			System.out.println(ligacoesPorCliente.get(i));
		}

		//2c :
		System.out.println("\n  2c ");
		System.out.println("ligações por UF: " + bds.ligacoesPorUF("DF"));

		// Questão 2d :
		System.out.println("\n 2d ");
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
		for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
			System.out.println(ligacoesUFDiferente.get(i));
		}

		// -----------------------------Questão 3-----------------------------

		//3a :
		System.out.println("\n 3a ");
		ArrayList<Ligacao> contaCliente = bds.contaCliente("Otaviano Neves");
		for (int i = 0; i < contaCliente.size(); i++) {
			System.out.println(contaCliente.get(i));

		}

		// Questão 3b :
		System.out.println("\n 3b ");

		ArrayList<Ligacao> contaCliente2 = bds.contaCliente("Otaviano Neves");
		for (int i = 0; i < contaCliente2.size(); i++) {
			System.out.println(contaCliente2.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorLigacaoCliente(contaCliente.get(i).getCodigo()) + " R$"));
		}

		// Questão 3c :
		System.out.println("\n 3c ");
		ArrayList<Ligacao> contaCliente3 = bds.contaCliente("José das Couves");
		for (int i = 0; i < contaCliente3.size(); i++) {
			System.out.println(contaCliente3.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorLigacaoDesconto(contaCliente3.get(i).getCodigo()) + " R$"));
		}

		// Questão 3d :
		System.out.println("\n 3d ");
		ArrayList<Ligacao> contaCliente4 = bds.contaCliente("José das Couves");
		for (int i = 0; i < contaCliente4.size(); i++) {
			System.out.println(contaCliente4.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorDescontoIdoso(contaCliente4.get(i).getCodigo()) + " R$"));
		}

	}


}
