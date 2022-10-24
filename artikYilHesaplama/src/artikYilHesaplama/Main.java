package artikYilHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil,sonuc;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Yýl Giriniz: ");
		yil=scan.nextInt();
		
		sonuc=yil%4;
		
		if(sonuc==0) {
			System.out.println(yil+" artýk bir yýldýr.");
		}else {
			System.out.println(yil+" artýk bir yýl deðildir.");
		}
	}

}
