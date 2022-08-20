package bahaspert34;

public class ikan extends hewanLaut {
	
	public suaraBerenang ikanBerenang = new suaraBerenang() {
		
		@Override
		public void suaraBerenang() {
			// TODO Auto-generated method stub
			System.out.println("ikan berenang dan mengeluarkan suara burb-burb");
		}
	};
	
	private final String alatBerenang;
	private int jumlahAlatBerenang;

	public ikan(String habitat, int stock, double harga, String alatBerenang, int jumlahAlatBerenang) {
		super(habitat, stock, harga);
		this.alatBerenang = alatBerenang;
		this.jumlahAlatBerenang = jumlahAlatBerenang;
	}

	@Override
	public void DisplayDetail() {
		// TODO Auto-generated method stub
		System.out.println("Ini adalah Ikan");
		System.out.println("berenang mengunakan" + this.alatBerenang);
		System.out.printf("memiliki %s sebanyak %d\n", this.alatBerenang, this.jumlahAlatBerenang);
	}


	

}
