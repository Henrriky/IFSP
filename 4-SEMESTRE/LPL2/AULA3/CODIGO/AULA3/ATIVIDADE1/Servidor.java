package AULA3.ATIVIDADE1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		
		System.out.println("---> Criando o servidor");
		try (ServerSocket servidor = new ServerSocket(3333)) {			
			System.out.println("---> Servidor escutando na porta 3333");
			while (true) {
				Socket cliente = servidor.accept();
				System.out.println("---> Conexão aberta de: " + cliente.getInetAddress().toString());
				System.out.println("---> Aguardando recebimento do número real de: " + cliente.getInetAddress().toString());
				ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
				Double numeroReal = (Double) entrada.readObject();
				System.out.println("---> Número real recebido: " + numeroReal);
				Double calculo = Math.sqrt(numeroReal);
				System.out.println("---> Enviando número calculado: " + String.format("%.2f", calculo));
				ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
				saida.flush();
				saida.writeObject(String.format("%.2f", calculo));
				cliente.close();
				System.out.println("---> Conexão encerrada");
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Erro!\n" + e.getMessage());
		}
		
		
	}
}
/*
package AULA3.ATIVIDADE1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("---> Conectando no servidor 127.0.0.1 na porta 3333");
		try (Socket cliente = new Socket("127.0.0.1", 3333)) {
			Scanner teclado = new Scanner(System.in);
			Double numeroReal = 1.0;
			System.out.println("---> Enviando número real: " + numeroReal);
			ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			saida.flush();
			saida.writeObject(numeroReal);
			Double numeroCalculado;
			System.out.println("teste");
			do {
				numeroCalculado = (Double) entrada.readObject();
				System.out.println("---> Número recebido após envio do número real" + numeroCalculado);
			} while (!numeroCalculado.equals(-1.0));
			cliente.close();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Erro!\n" + e.getMessage());
		}
	}
}
*/

