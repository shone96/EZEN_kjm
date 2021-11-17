package JavaStandard14;

import java.io.File;

public class DirectoryInfoTest {
	static int totalFiles = 0;
	static int totalDirs = 0;
	static int totalSize = 0;
	

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: java DirectoryInfoTest DIRECTORY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		countFiles(dir);
		
		System.out.println();
		System.out.println("총 " + totalFiles + "개의 파일");
		System.out.println("총 " + totalDirs + "개의 디렉토리");
		System.out.println("총 " + totalSize + "bytes");

	}
	
	public static void countFiles(File dir) {
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				totalDirs ++;
				countFiles(files[i]);
			}else {
				totalFiles ++;
				totalSize += files[i].length();
			}
		}
	}

}
