package opg1;
import java.util.ArrayList;
import java.util.List;

public class Main {

		public static void main(String[] args) {

				// Laver en Array List af navne
				// 1
				ArrayList<String> names = new ArrayList<>(
								// Tilf�jer navne til listen
								// 2
								List.of("Hans", "Viggo", "Jens", "Bente", "Bent"));
				System.out.println(names);
				// Printer l�ngden af listen
				// 3
				System.out.println(names.size());
				// Tilf�jer "Jane" til index 2
				// 4
				names.add(2, "Jane");
				// Printer elementer i listen
				// 5
				System.out.println(names);
				// Fjener element i index 1
				// 6
				names.remove(1);
				System.out.println(names);
				// Tilf�jer "Pia" forrest p� listen
				// 7
				names.add(0, "Pia");
				System.out.println(names);
				// Tilf�jer "Ib" til sidst p� listen
				// 8
				names.add("Ib");
				System.out.println(names);
				// Printer l�ngden p� listen
				// 9
				System.out.println(names.size());
				// �ndrer element i index 2 til "Hansi"
				// 10
				names.add(2, "Hansi");
				// Printer l�ngden p� listen
				// 11
				System.out.println(names.size());
				// Printer elementer i listen
				// 12
				System.out.println(names);
				// Printer l�ngden af hver navn i listen
				// 13
				for (int i = 0; i < names.size(); i++) {
						String s = names.get(i);
						System.out.print(s.length() + " ");
				}
				System.out.println();

				// Printer l�ngden af hver navn i listen
				// 14
				for (String sr : names) {
						int srOne = sr.length();
						System.out.print(srOne + " ");

				}
				System.out.println();
		}

}
