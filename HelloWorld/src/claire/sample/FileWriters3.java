package claire.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters3 {

	public static void main(String[] args) throws IOException {
		// 객체를 파일에 써보자! - 문자 스트림


		// 입력받은 문자를 저장할 파일 지정
		String fpath = "C:/Java/mydata2.txt";

		FileWriter fw = new FileWriter(fpath, true);
		BufferedWriter bw = new BufferedWriter(fw);

		SungJuckV6DT0 sj = new SungJuckV6DT0("수지", 74, 65, 87);

		String line = sj.getName() + "/" + sj.getKor() + "/" + sj.getEng() + "/" + sj.getMat() + "\r\n";
		
		bw.write(line);


		bw.close();
		fw.close();

	}

}
