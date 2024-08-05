package ödev;

public class Main {

	public static void main(String[] args) {
		
    Item item1 =new Item("Galaxy S23","Teknosa",32000,25000);
		
		Item item2=new Item();
		item2.setProduc_name("Lenovo V5");
		item2.setSupplier("MediaMarkt");
		item2.setSale_price(15000);
		item2.setPurchase_price(10000);
		
		System.out.println("Ürün Adı: " + item1.getProduc_name());
        System.out.println("Satış Fiyatı: " + item1.getSale_price());
        System.out.println("Kar: " + item1.calucate_profit());
        System.out.println("********************************************************"); 
		
		ShoppingCart cart = new ShoppingCart();
         cart.add_cart(item1);
         cart.add_cart(item2);
        
         double totalPrice = cart.totalPrice();
         System.out.println("Sepetinizdeki toplam tutar :"+ totalPrice);
         System.out.println("******************************************************");
         //ödev3 
         Dikdortgen dikdortgen = new Dikdortgen("dikdörtgen",10,5);
         System.out.println("Dikdörtgenin alanı :"+dikdortgen.alanHesapla());
         System.out.println("Dikdörtgenin cevresi:"+dikdortgen.cevreHesapla());
         
         
         System.out.println("******************************************************");
         //ödev
         Bolunme.main(null);

	}

}
