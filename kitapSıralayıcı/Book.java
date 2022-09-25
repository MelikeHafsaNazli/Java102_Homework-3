package kitapS�ralay�c�;

/*Kitap S�ralay�c�
 * Book isminde bir s�n�f tasarlay�n�z. Bu s�n�f Comparable interface'den kal�t�m al�p "compareTo" metodunu 
 * override ediniz. Bu metodun i�inde kitab� A'dan Z'ye isme g�re s�ralayan kodu yaz�n�z. 
 * Bu s�n�ftan 5 tane nesne olu�turun ve nesneleri Set tipinde bir yap�s�nda saklay�n�z. Sonra
 * ikinci kez Set tipinden bir veri yap�s� kullan�n ve kitaplar� sayfa say�s�na g�re s�ralamas�n� 
 * sa�lay�n�z.
 * 
 * Book s�n�f� kitap ismi, sayfa say�s�, yazar�n ismi, yay�n tarihi de�i�kenlerinden olu�maktad�r.
 */
public class Book implements Comparable<Book> {

	private String kitab�nAd�;
	private int sayfaSay�s�;
	private String yazar�nAd�;
	private int yay�nTarihi;

	Book() {

	}

	Book(String kitab�nAd�, int sayfaSay�s�, String yazar�nAd�, int yay�nTarihi) {
		this.kitab�nAd� = kitab�nAd�;
		this.sayfaSay�s� = sayfaSay�s�;
		this.yazar�nAd� = yazar�nAd�;
		this.yay�nTarihi = yay�nTarihi;

	}

	public String getKitapAd�() {
		return kitab�nAd�;
	}

	public String getYazarAd�() {
		return yazar�nAd�;
	}

	public int getSayfaSay�s�() {
		return sayfaSay�s�;
	}

	public int getYay�nTarihi() {
		return yay�nTarihi;
	}
	public Book compareByPage(Book b1, Book b2) {
		
		if(b1.sayfaSay�s� < b2.sayfaSay�s�) {
			return b2;
			
		}else {
			return b1;
		}
		
	}
	
	@Override
	public int compareTo(Book o) {

		return this.getKitapAd�().compareTo(o.getKitapAd�());
	}

}
