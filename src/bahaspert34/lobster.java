package bahaspert34;

public class lobster extends hewanLaut implements suaraCapit{
	private String Senjata = "Capit";
	private int jumlahSenjata;
	private int jumlahKaki;
	
	public lobster(String habitat, int stock, double harga, int jumlahSenjata, int jumlahKaki) {
		super(habitat, stock, harga);
		this.jumlahSenjata = jumlahSenjata;
		this.jumlahKaki = jumlahKaki;
	}

	public String getSenjata() {
		return Senjata;
	}

	public int getJumlahSenjata() {
		return jumlahSenjata;
	}

	public int getJumlahKaki() {
		return jumlahKaki;
	}

	public void setJumlahKaki(int jumlahKaki) {
		this.jumlahKaki = jumlahKaki;
	}

	@Override
	public void DisplayDetail() {
		// TODO Auto-generated method stub
		System.out.println("Ini Adalah lobster");
		System.out.println("melindungi diri dengan" + this.jumlahSenjata + " " + this.Senjata);
		System.out.println("Stock yang tersisa yakni " + super.getStock());
		
	}

	@Override
	public void suaraCapit() {
		// TODO Auto-generated method stub
		System.out.println("lobster mencapit dan mengeluarkan suara Clap-clap");
	}
	
	
	
	
	
	
	

}
