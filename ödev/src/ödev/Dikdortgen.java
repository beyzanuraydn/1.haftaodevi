package ödev;

public class Dikdortgen extends Sekil {
	private double uzunKenar;
    private double kisaKenar;
    
	public Dikdortgen( String isim,double uzunKenar, double kisaKenar) {
		super(isim);
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
	}
	public double getUzunKenar() {
		return uzunKenar;
	}
	public void setUzunKenar(double uzunKenar) {
		this.uzunKenar = uzunKenar;
	}
	public double getKisaKenar() {
		return kisaKenar;
	}
	public void setKisaKenar(double kisaKenar) {
		this.kisaKenar = kisaKenar;
	}
	
	@Override
	 double alanHesapla() {
        return uzunKenar * kisaKenar;
     }
	
	@Override
	double cevreHesapla() {
        return 2 * (uzunKenar + kisaKenar);
    }
		
}
