package ödev;

public abstract class Sekil {
      private String isim;

	public Sekil(String isim) {
         this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	abstract double alanHesapla();
    abstract double cevreHesapla();
}
