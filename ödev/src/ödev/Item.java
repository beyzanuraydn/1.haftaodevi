package ödev;

public class Item {
	
	private String produc_name;
	private String supplier;
    private double sale_price;
	private double purchase_price;
	 //constructor
	public Item(String produc_name, String supplier, double sale_price, double purchase_price) {
		
		this.produc_name = produc_name;
		this.supplier = supplier;
		this.sale_price = sale_price;
		this.purchase_price = purchase_price;
	}
      public Item() {
		
	}
     // getter ve setterlar
	public String getProduc_name() {
		return produc_name;
	}

	public void setProduc_name(String produc_name) {
		this.produc_name = produc_name;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getSale_price() {
		return sale_price;
	}

	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}

	public double getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}
	
	 //ürünün satış fiyatını %20 arttıran metod
	public void increase_sale_price() {
		sale_price *=1.2;
	}
	
	// ürünün ellede ettiği karı hesaplayan metad
	public double calucate_profit() {
		return sale_price - purchase_price;
	}

}
