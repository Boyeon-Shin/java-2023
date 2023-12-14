package basic;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File file = new File("C://Users//신보연//java-2023");
		
		if(file.isFile()) {
			System.out.println("파일입니다.");
		}else if (file.isDirectory()) {
			System.out.println("디랙토리입니다.");
			
			
			File [] files = file.listFiles();
			for(int i = 0; i < files.length; i++) {
				File subFile = files[i];
				
				String fileName = subFile.getName();
				long length = subFile.length();
				
				
			System.out.println("파일명 - " +  fileName + ", 파일 크기 - "+ length);
			}
			
		}
		
	}
}
