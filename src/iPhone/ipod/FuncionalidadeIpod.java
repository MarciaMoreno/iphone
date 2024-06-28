package iPhone.ipod;

import java.util.Scanner;
import java.util.Arrays;
import iPhone.FuncionalidadeIphone2007;
import iPhone.Iphone2007;

public class FuncionalidadeIpod implements Ipod{
	Scanner scanner = new Scanner(System.in);
	int escolher, encerrando;		
	String [] musica1 = {"Album: Peregrine - Música: Soul Blue Hard / Ano 2006"};
	String [] musica2 = {"Album: Cradle of Filth - Música: Tamptation / Ano 2007"};
	String [] musica3 = {"Album: Marconi - Música: Solei tu o Pio / Ano 2008"};
	String [] musica4 = {"Album: Vigance - Música: Karmatic sounds / Ano 2014"};
	String [] musica5 = {"Album: Vitrini - Música: Voyage / Ano 2011"};
	String [] musica6 = {"Album: The Police - Música: The System/ Ano 2003"};
	String [] musica7 = {"Album: Peregrine - Música: Ghost of me / Ano 2008"};
	String [] musica8 = {"Album: Peregrine - Música: Bright goals / Ano 2011"};
	
	public void verTrilha() {
		System.out.println(Arrays.toString(musica1));
		System.out.println(Arrays.toString(musica2));
		System.out.println(Arrays.toString(musica3));
		System.out.println(Arrays.toString(musica4));
		System.out.println(Arrays.toString(musica5));
		System.out.println(Arrays.toString(musica6));
		System.out.println(Arrays.toString(musica7));
		System.out.println(Arrays.toString(musica8));
		escolherMusica();
	}
	public void escolherMusica() {
		System.out.println("Escolha uma música...");
		escolher = scanner.nextInt();
		if( escolher == 1)System.out.println(Arrays.toString(musica1));
		if( escolher == 2)System.out.println(Arrays.toString(musica2));
		if( escolher == 3)System.out.println(Arrays.toString(musica3));
		if( escolher == 4)System.out.println(Arrays.toString(musica4));
		if( escolher == 5)System.out.println(Arrays.toString(musica5));
		if( escolher == 6)System.out.println(Arrays.toString(musica6));
		if( escolher == 7)System.out.println(Arrays.toString(musica7));
		if( escolher == 8)System.out.println(Arrays.toString(musica8));
			System.out.println("\n\n1 Tocar");
			int checar = scanner.nextInt();			
			if(checar == 1)tocarMusica(); 
			else verTrilha();
	}
	public void tocarMusica() {
		System.out.println("TOCANDO AGORA****...");
		System.out.println("Digite 1 PAUSAR");
		int checar = scanner.nextInt();			
		if(checar == 1)pausarMusica(); 
		else verTrilha();
	}
	public void pausarMusica() {
		System.out.println("Player PAUSADO...");
		
	}
}
