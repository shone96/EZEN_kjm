package oct28;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) throws Exception{
		File dir = new File("D:\\Temp\\Dir");
		File file1 = new File("D:\\Temp\\file1.txt");
		File file2 = new File("D:\\Temp\\file2.txt");
		File file3 = new File("D:\\Temp\\file3.txt");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		File temp = new File("D:\\Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		File[ ] contents = temp.listFiles();
		System.out.println("날짜             \t시간         \t형태      \t\t크기   \t이름");
		System.out.println("-------------------------------------------------------------------");
		for(File file : contents) {
			System.out.print(sdf.format(file.lastModified()));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			}else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}

	}

}
