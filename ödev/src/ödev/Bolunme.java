package ödev;

import java.util.ArrayList;
import java.util.List;

public class Bolunme {
	
	public static void main(String[] args) {
		
		 List<Integer> bolunen3 = new ArrayList<>();
	        List<Integer> bolunen5 = new ArrayList<>();
	        List<Integer> bolunenHem3Hem5 = new ArrayList<>();

	        for (int i = 1; i <= 100; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                bolunenHem3Hem5.add(i);
	            } else if (i % 3 == 0) {
	                bolunen3.add(i);
	            } else if (i % 5 == 0) {
	                bolunen5.add(i);
	            }
	            
	        }
	        System.out.println("Hem 3'e hem de 5'e bölünenler: " + bolunenHem3Hem5);
	        System.out.println("Sadece 3'e bölünenler: " + bolunen3);
	        System.out.println("Sadece 5'e bölünenler: " + bolunen5);  
	}
    
 }
