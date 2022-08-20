package bahaspert34;

public abstract class hewanLaut {

	private String habitat;
	private int stock;
	private double Harga;
	
//	alt + shift + s + o
	public hewanLaut(String habitat, int stock, double harga) {
		super();
		this.habitat = habitat;
		this.stock = stock;
		Harga = harga;
	}
	
//	alt + shift + s + r
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getHarga() {
		return Harga;
	}

	public void setHarga(double harga) {
		Harga = harga;
	}

	public abstract void DisplayDetail();
	

	
	
	
	
	
}
