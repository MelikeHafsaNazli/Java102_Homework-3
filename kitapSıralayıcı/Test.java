package kitapSýralayýcý;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Book> bookTable = new TreeSet<Book>();

		Book k1 = new Book("Baþlangýç", 536, "Dan Brown", 2017);
		bookTable.add(k1);

		Book k2 = new Book("Da Vinci Þifresi", 495, "Dan Brown", 2003);
		bookTable.add(k2);

		Book k3 = new Book("Peter Pan", 192, "J. M. Barrie", 1911);
		bookTable.add(k3);

		Book k4 = new Book("Momo", 303, "Michael Ende", 1973);
		bookTable.add(k4);

		Book k5 = new Book("Hiç Kimse Sýradan Deðildir", 463, "Markus Zusak", 2002);
		bookTable.add(k5);

		System.out.println("Kitap adýna göre sýralama: \n");

		for (Book b : bookTable) {

			System.out.println("Kitabýn adý: " + b.getKitapAdý() + "\n" + "Kitabýn Yazarý: " + b.getYazarAdý() + "\n"
					+ "Sayfa Sayýsý: " + b.getSayfaSayýsý() + "\n" + "Yayýn Yýlý: " + b.getYayýnTarihi() + "\n");
		}

		TreeSet<Book> bookTable2 = new TreeSet<>(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getSayfaSayýsý() - o2.getSayfaSayýsý();
			}
		});

		// Book k1 = new Book("Baþlangýç", 536, "Dan Brown", 2017);
		bookTable2.add(k1);

		// Book k2 = new Book("Da Vinci Þifresi", 495, "Dan Brown", 2003);
		bookTable2.add(k2);

		// Book k3 = new Book("Peter Pan", 192, "J. M. Barrie", 1911);
		bookTable2.add(k3);

		// Book k4 = new Book("Momo", 303 ,"Michael Ende", 1973 );
		bookTable2.add(k4);

		// Book k5 = new Book("Hiç Kimse Sýradan Deðildir", 463, "Markus Zusak", 2002);
		bookTable2.add(k5);
		System.out.println("________________________________________________");
		System.out.println("Sayfa sayýsýna göre sýralama: \n");

		for (Book b : bookTable2) {

			System.out.println("Kitabýn adý: " + b.getKitapAdý() + "\n" + "Kitabýn Yazarý: " + b.getYazarAdý() + "\n"
					+ "Sayfa Sayýsý: " + b.getSayfaSayýsý() + "\n" + "Yayýn Yýlý: " + b.getYayýnTarihi() + "\n");

		}

	}
}
