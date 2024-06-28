package iPhone.internet;

import java.util.Scanner;
import java.util.Arrays;
import iPhone.FuncionalidadeIphone2007;
import iPhone.Iphone2007;

public class FuncionalidadeInternet implements Internet{
	Scanner scanner = new Scanner(System.in);
	public void verPagina() {
		System.out.print("Digite o nome do site: ");
		String  url = scanner.next();
		System.out.println("Você está navegando http://"+url+".com.br");
		System.out.println("Nova Pesquisa?... Digite 1");
		int escolher =scanner.nextInt();
		if (escolher == 1) verNovaAba();
		else atualizar();
	}
	public void verNovaAba() {
		System.out.print("Digite o nome do site: ");
		String  url = scanner.next();
		System.out.println("Você está navegando http://"+url+".com.br");
	}
	public void atualizar() {
		System.out.println("PAGINA ATUALIZADA");
	}
}
