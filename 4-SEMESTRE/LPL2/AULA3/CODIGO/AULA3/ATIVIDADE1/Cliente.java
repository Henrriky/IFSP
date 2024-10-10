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
			Double numeroReal = Double.valueOf(teclado.nextLine());
			System.out.println("---> Enviando número real: " + numeroReal);
			ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
			saida.flush();
			saida.writeObject(numeroReal);
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String numeroCalculado = entrada.readObject().toString();
			System.out.println("---> Número recebido após envio do número real: " + numeroCalculado);
			cliente.close();
			teclado.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Erro!\n" + e.getMessage());
		}
	}
}
