package ödev;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	    private List<Item> items;

	    public ShoppingCart() {
	        items = new ArrayList<>();
	    } 
	 // Sepete ekleyen metod
	    
	    public void add_cart(Item item) {
	        items.add(item);
	    }

	    // Sepetteki ürünlerin toplam fiyatını hesaplayan metod
	    
	    public double totalPrice() {
	        double total = 0;
	        for (Item item : items) {
	            total += item.getSale_price();
	        }
	        return total;
	    }
        
}
