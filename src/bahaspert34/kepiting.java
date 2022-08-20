package bahaspert34;

public class kepiting extends hewanLaut implements suaraCapit {
	
	private final String Senjata = "Capit";
	private final int jumlahSenjata;
	private int jumlahKaki;
	

	public kepiting(String habitat, int stock, double harga, int jumlahSenjata, int jumlahKaki) {
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
		System.out.println("ini adalah kepiting");
		System.out.println("mempunyai senjata pelindung yakni " + this.Senjata + " dengan Jumlah " + this.jumlahSenjata);
		System.out.println("stock yang tersisa yakni " + super.getStock());
		
	}

	@Override
	public void suaraCapit() {
		// TODO Auto-generated method stub
		System.out.println("kepiting mencapit dan mengeluarkan suara Clap-Clap");
	}

	



	
	
}
