package bahaspert34;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	Vector<hewanLaut> product = new Vector<>();
	public Main() {
		// TODO Auto-generated constructor stub
		int choose = 0;
		
		
		do {
			System.out.println("Selamat datang di program toko hewan Hias");
			System.out.println("1. tambahkan product");
			System.out.println("2. show Product");
			System.out.println("3. update product");
			System.out.println("4. input transaksi product");
			System.out.println("5. delete product");
			System.out.println("6. Exit");
			System.out.println("Choose >> ");
			// alt + shift + z
			try {
				choose = sc.nextInt(); sc.nextLine(); //satu
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Tolong masukan angka");
				sc.nextLine();
				choose = -1;
			}
			
			switch (choose) {
			case 1: {
				System.out.println("apa jenis hewan yang ingin anda input?");
				System.out.println("1. ikan\n2. lobster\n3. Kepiting");
				int inputan = 0;
				try {
					inputan = sc.nextInt(); sc.nextLine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("please Input number");
					choose = -1;
					sc.nextLine();
				}
				
				switch (inputan) {
				case 1: {
					System.out.println("input habitat");
					String habitat = sc.nextLine();
					System.out.println("input stock");
					int stock = sc.nextInt(); sc.nextLine();
					System.out.println("input harga");
					double harga = sc.nextDouble(); sc.nextLine();
					System.out.println("input alatberenang");
					String alatBerenang = sc.nextLine();
					System.out.println("input jumlah alatberenang");
					int jumlahAlatBerenang = sc.nextInt(); sc.nextLine();
					ikan ikan = new ikan(habitat, stock, harga, alatBerenang, jumlahAlatBerenang);
					
					product.add(ikan);
					break;
					}
				case 2:
					{
						System.out.println("input habitat");
						String habitat = sc.nextLine();
						System.out.println("input stock");
						int stock = sc.nextInt(); sc.nextLine();
						System.out.println("input harga");
						double harga = sc.nextDouble(); sc.nextLine();
						System.out.println("input jumlah senjata");
						int jumlahSenjata = sc.nextInt(); sc.nextLine();
						System.out.println("input jumlah kaki");
						int jumlahKaki = sc.nextInt(); sc.nextLine();
						lobster lobster = new lobster(habitat, stock, harga, jumlahSenjata, jumlahKaki);
						product.add(lobster);
						break;
					}
				}
			}
			case 2:
				showVector();
				break;
			case 3:
				
				break;
			case 4:
				trx();
				break;
			case 5:
				
				break;
			}
		} while (choose != 6);
		
		
		
		
}
	
	public void showVector() {
		int idx = 1;
		for (hewanLaut hewanLaut : product) {
			if (hewanLaut instanceof ikan) {
				System.out.println(idx++);
				ikan ikan = (ikan) hewanLaut;
				System.out.println("habitat " + ikan.getHabitat());
				System.out.println("stock " + ikan.getStock());
				System.out.println("harga " + ikan.getHarga());
				ikan.ikanBerenang.suaraBerenang();
				System.out.println("\n=========================================\n");
			} else {
				System.out.println(idx++);
				lobster l = (lobster) hewanLaut;
				System.out.println("habitat " + l.getHabitat());
				System.out.println("jumlah kaki lobster " + l.getJumlahKaki());
				System.out.println("senjata Lobster" + l.getSenjata());
				System.out.println("jumlah " + l.getSenjata()+ " " + l.getJumlahSenjata());
				System.out.println("stock  " + l.getStock());
				System.out.println("harga" + l.getHarga());
				System.out.println("\n=========================================\n");
			}
			
		}
	}

	public void trx() {
		showVector();
		System.out.println("please input what is the product customer buy");
		int input = sc.nextInt()-1;
		if (input < 0 || input >= product.size()) {
			System.out.println("please input number in range");
		} else {
			System.out.println("current stock " + product.get(input).getStock());
			System.out.println("how many");
			int qty = sc.nextInt(); sc.nextLine();
			product.get(input).setStock((product.get(input).getStock() - qty));
			System.out.println("new stock qty is " + product.get(input).getStock());
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}

