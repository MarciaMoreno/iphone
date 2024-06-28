package iPhone;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import iPhone.telefone.FuncionalidadeTelefone;
import iPhone.telefone.Telefone;
import iPhone.ipod.FuncionalidadeIpod;
import iPhone.ipod.Ipod;
import iPhone.internet.FuncionalidadeInternet;
import iPhone.internet.Internet;
import iPhone.Iphone2007;

public abstract class FuncionalidadeIphone2007 implements Telefone, Ipod, Internet, Iphone2007 {
	
	public static void main(String[] args) {
		Iphone2007.ligar();
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		int ok;
		while(true) {
			switch(opcao) {
			case 1: {
				System.out.println("\niPod Sound... Bem vindo... \n");
				Ipod ipod = new FuncionalidadeIpod();
				ipod.verTrilha();
				System.out.println("RETORNAR AO MENU - DIGITE 9");
					ok = scanner.nextInt();
						if (ok == 9) {
							Iphone2007.ligar();
							opcao = scanner.nextInt();
						}							
						else ipod.verTrilha();
						break;
			}
			case 2: {
				System.out.println("\nTelefone e Agenda... Bem vindo... \n");
				Telefone telefone = new FuncionalidadeTelefone();
				telefone.verContatos();
				System.out.println("RETORNAR AO MENU - DIGITE 9");
					ok = scanner.nextInt();
						if (ok == 9) {
							Iphone2007.ligar();
							opcao = scanner.nextInt();
						}
							
						else telefone.verContatos();
						break;
			}
			case 3: {
				Internet internet = new FuncionalidadeInternet();
				System.out.println("\nNAVEGADOR INTERNETFOX... Bem vindo... \n");
				internet.verPagina();
				System.out.println("RETORNAR AO MENU - DIGITE 9");
					ok = scanner.nextInt();
						if (ok == 9) {
							Iphone2007.ligar();
							opcao = scanner.nextInt();
						}
						else internet.verPagina();break;
			}
			case 4:{
				Telefone telefone = new FuncionalidadeTelefone();
				System.out.println("\n******CAIXA POSTAL******* \n");
				System.out.println("Você tem uma nova mensagem... Digite: ");
				System.out.println("1 OUVIR / 2 APAGAR");
				int checar = scanner.nextInt();
				if (checar == 1)telefone.ouvirRecado();
				else if (checar == 2 )telefone.apagarRecado();
				else System.out.println("RETORNAR AO MENU - DIGITE 9");
					ok = scanner.nextInt();
						if (ok == 9) {
							Iphone2007.ligar();
							opcao = scanner.nextInt();
						}
						else telefone.verContatos();break;
			}
			case 0: {
				Iphone2007.desligar();
			}
			default:
				System.out.println("Opção inválida tente novamente...");
				opcao = scanner.nextInt();
				return;
			}
		}
		

}

	@Override
	public void verNovaAba() {
		// TODO Auto-generated method stub
	}
	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
	}
	@Override
	public void escolherMusica() {
		// TODO Auto-generated method stub
	}
	@Override
	public void tocarMusica() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pausarMusica() {
		// TODO Auto-generated method stub
	}
	@Override
	public void escolherContato() {
		// TODO Auto-generated method stub
	}
	@Override
	public void discar() {
		// TODO Auto-generated method stub
	}
	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
	}
	@Override
	public void apagarRecado() {
		// TODO Auto-generated method stub
	}

}