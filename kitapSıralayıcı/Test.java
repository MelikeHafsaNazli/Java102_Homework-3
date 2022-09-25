package kitapS�ralay�c�;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Book> bookTable = new TreeSet<Book>();

		Book k1 = new Book("Ba�lang��", 536, "Dan Brown", 2017);
		bookTable.add(k1);

		Book k2 = new Book("Da Vinci �ifresi", 495, "Dan Brown", 2003);
		bookTable.add(k2);

		Book k3 = new Book("Peter Pan", 192, "J. M. Barrie", 1911);
		bookTable.add(k3);

		Book k4 = new Book("Momo", 303, "Michael Ende", 1973);
		bookTable.add(k4);

		Book k5 = new Book("Hi� Kimse S�radan De�ildir", 463, "Markus Zusak", 2002);
		bookTable.add(k5);

		System.out.println("Kitap ad�na g�re s�ralama: \n");

		for (Book b : bookTable) {

			System.out.println("Kitab�n ad�: " + b.getKitapAd�() + "\n" + "Kitab�n Yazar�: " + b.getYazarAd�() + "\n"
					+ "Sayfa Say�s�: " + b.getSayfaSay�s�() + "\n" + "Yay�n Y�l�: " + b.getYay�nTarihi() + "\n");
		}

		TreeSet<Book> bookTable2 = new TreeSet<>(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getSayfaSay�s�() - o2.getSayfaSay�s�();
			}
		});

		// Book k1 = new Book("Ba�lang��", 536, "Dan Brown", 2017);
		bookTable2.add(k1);

		// Book k2 = new Book("Da Vinci �ifresi", 495, "Dan Brown", 2003);
		bookTable2.add(k2);

		// Book k3 = new Book("Peter Pan", 192, "J. M. Barrie", 1911);
		bookTable2.add(k3);

		// Book k4 = new Book("Momo", 303 ,"Michael Ende", 1973 );
		bookTable2.add(k4);

		// Book k5 = new Book("Hi� Kimse S�radan De�ildir", 463, "Markus Zusak", 2002);
		bookTable2.add(k5);
		System.out.println("________________________________________________");
		System.out.println("Sayfa say�s�na g�re s�ralama: \n");

		for (Book b : bookTable2) {

			System.out.println("Kitab�n ad�: " + b.getKitapAd�() + "\n" + "Kitab�n Yazar�: " + b.getYazarAd�() + "\n"
					+ "Sayfa Say�s�: " + b.getSayfaSay�s�() + "\n" + "Yay�n Y�l�: " + b.getYay�nTarihi() + "\n");

		}

	}
}
