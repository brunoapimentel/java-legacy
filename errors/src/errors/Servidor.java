package errors;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {

	public void run() {
		DatagramSocket dsocket;
		try {
			dsocket = new DatagramSocket(8000);
		} catch (SocketException e) {
			System.out.println(e.getMessage());
			return;
		}

		byte[] buffer = new byte[2048];

		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		System.out.println("Servidor rodando na 8000");
		while (true) {
			try {
				dsocket.receive(packet);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return;
			}

			String message = new String(buffer, 0, packet.getLength());
			System.out.println("Olá");
		}

		
	}
}