package claire.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {

	public static void main(String[] args) throws IOException {
		String fpath = "C:/Java/mydata.txt";

		FileReader fr = new FileReader(fpath);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {
			// while (fr.ready()) {
			// System.out.print((char) fr.read());
			System.out.println(br.readLine());
		}

		br.close();
		fr.close();
	}

}
