package claire.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters2 {

	public static void main(String[] args) throws IOException {
		// 객체를 파일에 써보자!
		// 클래스에 대한 객체를 만들고 그것을 파일에 저장

		// 입력받은 문자를 저장할 파일 지정
		String fpath = "C:/Java/mydata.txt";

		FileWriter fw = new FileWriter(fpath, true);
		BufferedWriter bw = new BufferedWriter(fw);

		SungJuckV6DT0 sj = new SungJuckV6DT0("수지", 74, 65, 87);
		System.out.println(sj.getName());

		// bw.write(sj);
		// 클래스의 객체는 바이트스트림으로 파일에 써야함

		bw.close();
		fw.close();

	}

}
