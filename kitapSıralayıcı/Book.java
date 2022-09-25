package kitapSýralayýcý;

/*Kitap Sýralayýcý
 * Book isminde bir sýnýf tasarlayýnýz. Bu sýnýf Comparable interface'den kalýtým alýp "compareTo" metodunu 
 * override ediniz. Bu metodun içinde kitabý A'dan Z'ye isme göre sýralayan kodu yazýnýz. 
 * Bu sýnýftan 5 tane nesne oluþturun ve nesneleri Set tipinde bir yapýsýnda saklayýnýz. Sonra
 * ikinci kez Set tipinden bir veri yapýsý kullanýn ve kitaplarý sayfa sayýsýna göre sýralamasýný 
 * saðlayýnýz.
 * 
 * Book sýnýfý kitap ismi, sayfa sayýsý, yazarýn ismi, yayýn tarihi deðiþkenlerinden oluþmaktadýr.
 */
public class Book implements Comparable<Book> {

	private String kitabýnAdý;
	private int sayfaSayýsý;
	private String yazarýnAdý;
	private int yayýnTarihi;

	Book() {

	}

	Book(String kitabýnAdý, int sayfaSayýsý, String yazarýnAdý, int yayýnTarihi) {
		this.kitabýnAdý = kitabýnAdý;
		this.sayfaSayýsý = sayfaSayýsý;
		this.yazarýnAdý = yazarýnAdý;
		this.yayýnTarihi = yayýnTarihi;

	}

	public String getKitapAdý() {
		return kitabýnAdý;
	}

	public String getYazarAdý() {
		return yazarýnAdý;
	}

	public int getSayfaSayýsý() {
		return sayfaSayýsý;
	}

	public int getYayýnTarihi() {
		return yayýnTarihi;
	}
	public Book compareByPage(Book b1, Book b2) {
		
		if(b1.sayfaSayýsý < b2.sayfaSayýsý) {
			return b2;
			
		}else {
			return b1;
		}
		
	}
	
	@Override
	public int compareTo(Book o) {

		return this.getKitapAdý().compareTo(o.getKitapAdý());
	}

}
