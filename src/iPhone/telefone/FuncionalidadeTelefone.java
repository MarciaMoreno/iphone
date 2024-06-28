package iPhone.telefone;

import java.util.Scanner;
import java.util.Arrays;
import iPhone.FuncionalidadeIphone2007;
import iPhone.Iphone2007;

public class FuncionalidadeTelefone implements Telefone{
	
	Scanner scanner = new Scanner(System.in);
	int escolha, encerrar;		
	String [] contato1 = {"Contato 1. Ana Maria", "cel (11)99753-4125"};
	String [] contato2 = {"Contato 2. Bia Sesamo", "cel (11)99371-5363"};
	String [] contato3 = {"Contato 3. Carla Farias", "cel (11)99871-1212"};
	String [] contato4 = {"Contato 4. Daiana Frias", "cel (11)99881-5859"};
	String [] contato5 = {"Contato 5. Guto", "cel (11)99471-4144"};
	String [] contato6 = {"Contato 6. Pedro Maria", "cel (11)99871-3355"};
	String [] contato7 = {"Contato 7. Padaria do Zé", "cel (11)99873-2853"};
	String [] contato8 = {"Contato 8. Farmacia da Nina", "cel (11)99547-4125"};
	
	public void verContatos() {
		System.out.println(Arrays.toString(contato1));
		System.out.println(Arrays.toString(contato2));
		System.out.println(Arrays.toString(contato3));
		System.out.println(Arrays.toString(contato4));
		System.out.println(Arrays.toString(contato5));
		System.out.println(Arrays.toString(contato6));
		System.out.println(Arrays.toString(contato7));
		System.out.println(Arrays.toString(contato8));
		escolherContato();
	}
	
	public void escolherContato() {
		System.out.println("\n\nEscolha um contato...");
		escolha = scanner.nextInt();
		if( escolha == 1)System.out.println(Arrays.toString(contato1));
		if( escolha == 2)System.out.println(Arrays.toString(contato2));
		if( escolha == 3)System.out.println(Arrays.toString(contato3));
		if( escolha == 4)System.out.println(Arrays.toString(contato4));
		if( escolha == 5)System.out.println(Arrays.toString(contato5));
		if( escolha == 6)System.out.println(Arrays.toString(contato6));
		if( escolha == 7)System.out.println(Arrays.toString(contato7));
		if( escolha == 8)System.out.println(Arrays.toString(contato8));
			System.out.println("\n\n1 LIGAR / 2 MENSAGEM ");
			int checar = scanner.nextInt();			
			if(checar ==1)discar(); 
			else if(checar == 2)enviarMensagem();
			else verContatos();
	}
	
	public void discar() {
		System.out.print("LIGANDO PARA ");
		if( escolha == 1)System.out.println(Arrays.toString(contato1));
		if( escolha == 2)System.out.println(Arrays.toString(contato2));
		if( escolha == 3)System.out.println(Arrays.toString(contato3));
		if( escolha == 4)System.out.println(Arrays.toString(contato4));
		if( escolha == 5)System.out.println(Arrays.toString(contato5));
		if( escolha == 6)System.out.println(Arrays.toString(contato6));
		if( escolha == 7)System.out.println(Arrays.toString(contato7));
		if( escolha == 8)System.out.println(Arrays.toString(contato8));
		System.out.println("\nDigite 0 para encerrar... ");
		encerrar = scanner.nextInt();
		if (encerrar ==0) {
			System.out.println("Chamada encerrada");
			System.out.println("RETORNAR AO MENU - DIGITE 9");
			int ok = scanner.nextInt();
				if (ok == 9)Iphone2007.ligar();
				else verContatos();
		}
		else {
			System.out.println("LIGAÇÃO ATIVA...");
		}
	}
	
	public void enviarMensagem() {
		System.out.print("MENSAGEM ENVIADA PARA ");
		if( escolha == 1)System.out.println(Arrays.toString(contato1));
		if( escolha == 2)System.out.println(Arrays.toString(contato2));
		if( escolha == 3)System.out.println(Arrays.toString(contato3));
		if( escolha == 4)System.out.println(Arrays.toString(contato4));
		if( escolha == 5)System.out.println(Arrays.toString(contato5));
		if( escolha == 6)System.out.println(Arrays.toString(contato6));
		if( escolha == 7)System.out.println(Arrays.toString(contato7));
		if( escolha == 8)System.out.println(Arrays.toString(contato8));
		System.out.println("RETORNAR AO MENU - DIGITE 9");
		int ok = scanner.nextInt();
			if (ok == 9)Iphone2007.ligar();
			else verContatos();		
	}
	
	public void ouvirRecado() {
		System.out.println("Mensagem de VOZ RODANDO**************... ");
		
	}
	public void apagarRecado() {
		System.out.println("RECADO DE VOZ APAGADA");
		
	}
	
}
