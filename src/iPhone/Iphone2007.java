package iPhone;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public interface Iphone2007 {
	Scanner scanner = new Scanner(System.in);
	
	public static void ligar() {
		System.out.println("...........iPhone...........\n");
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
		String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
		System.out.print(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataHoraAtual));
		System.out.println("\n\nDigite 0 'DESLIZAR O DEDO'...");
		try {
			int positiva = scanner.nextInt();
			if (positiva ==0) {
				System.out.println("\n\n\nMENU iPhone");
				System.out.println("1. IPod");
				System.out.println("2. Telefone");
				System.out.println("3. Navegador");
				System.out.println("4. Caixa Postal");
				System.out.println("0. Desligar");
				
			}
			else{
				System.out.println("IPhone - TELA DE BLOQUEIO");
				Date dataHoraAtual1 = new Date();
				String data2 = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual1);
				String hora2 = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual1);
				System.out.print(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataHoraAtual1));
				System.out.println("\n\nDigite 9 'DESLIZAR O DEDO'...");
				positiva = scanner.nextInt();
				if (positiva ==9) {
					System.out.println("\n\n\nMENU iPhone");
					System.out.println("1. IPod");
					System.out.println("2. Telefone");
					System.out.println("3. Navegador INTERNETFox");
					System.out.println("4. Caixa Postal");
					System.out.println("0. Desligar");
					
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void desligar() {
		System.out.println("iPhone Desligando...");
	}
	
}


