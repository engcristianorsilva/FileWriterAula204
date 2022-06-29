package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {
	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night","Bom dia" };
		String path = "gravar.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); //quebra de linha
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}