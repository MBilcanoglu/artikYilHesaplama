package artikYilHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil,sonuc;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Y�l Giriniz: ");
		yil=scan.nextInt();
		
		sonuc=yil%4;
		
		if(sonuc==0) {
			System.out.println(yil+" art�k bir y�ld�r.");
		}else {
			System.out.println(yil+" art�k bir y�l de�ildir.");
		}
	}

}
