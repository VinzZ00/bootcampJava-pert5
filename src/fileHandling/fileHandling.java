package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class fileHandling {

	public fileHandling() {
		// TODO Auto-generated constructor stub
		String path = ".\\src\\fileHandling\\folder1";
		File folder = new File(path);
		
		File f = new File(path.concat("\\file1.txt"));
		System.out.println((folder.mkdir()) ? "File berhasil dibuat" : "File tidak berhasil dibuat");
		try {
			System.out.println((f.createNewFile()) ? "File berhasil dibuat" : "File tidak berhasil di buat" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("rafif\n");
			fw.write("kevin\n");
			fw.write("Jemy\n");
			
			fw.flush();
//			fw.close();
//			fw.close();
//			fw.close();
			fw.write("Elvin\n");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = null;
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> content = new ArrayList<>();
		while (sc.hasNextLine()) {
			content.add(sc.nextLine());	
		}
		
		for (String string : content) {
			System.out.println("content file adalah " + string);
		}
		
		File destfolder = new File("C:\\Users\\user\\Desktop\\JavaFiles");
		
		File[] listfile = destfolder.listFiles();
		
		for (File file : listfile) {
			try {
				System.out.println(file.getCanonicalPath() + " " + file.exists());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
//		try {
//			if (file.mkdir()) {
//				System.out.println("File udh terbuat");
//			} else {
//				System.out.println("File tidak berhasil dibuat");
//				System.out.println(file.getCanonicalPath());
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public static void ThrowEx() throws IOException {
		IOException exyangDibuat = new IOException();
		throw exyangDibuat;
	}
	
	public static void main(String[] args) {
//		new fileHandling();
		try {
			ThrowEx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
