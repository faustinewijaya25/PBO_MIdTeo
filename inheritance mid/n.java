import java.util.Scanner;
class n extends m {
	void tampill(){
		System.out.print("Pilihan= ");
		pil = masukan.nextInt();
		if (pil == 31){
			biayabeban= 100000;
			System.out.println("Biaya Beban= Rp.100.000");
			System.out.println("Masukkan Jumlah Meter Pemakaian= ");
			jumlahmeter= masukan.nextInt();
			total= jumlahmeter * biayabeban;
			System.out.println("Total Harga=  "+total);
			System.out.println("Masukkan Bayaran = ");
			bayar= masukan.nextInt();
			kembalian= bayar- total;
		}
		else
		if (pil == 32) {
			biayabeban= 125000;
			System.out.println("Biaya Beban= Rp.125.000");
			System.out.println("Masukkan Jumlah Meter Pemakaian= ");
			jumlahmeter= masukan.nextInt();
			total= jumlahmeter * biayabeban;
			System.out.println("Total Harga=  "+total);
			System.out.println("Masukkan Bayaran = ");
			bayar= masukan.nextInt();
			kembalian= bayar- total;
		}
			else
		if (pil == 33) {
			biayabeban= 450000;
			System.out.println("Biaya Beban= Rp.450.000");
			System.out.println("Masukkan Jumlah Meter Pemakaian= ");
			jumlahmeter= masukan.nextInt();
			total= jumlahmeter * biayabeban;
			System.out.println("Total Harga=  "+total);
			System.out.println("Masukkan Bayaran = ");
			bayar= masukan.nextInt();
			kembalian= bayar- total;
		}	else
		if (pil == 34) {
			biayabeban= 480000;
			System.out.println("Biaya Beban= Rp.480.000");
			System.out.println("Masukkan Jumlah Meter Pemakaian= ");
			jumlahmeter= masukan.nextInt();
			total= jumlahmeter * biayabeban;
			System.out.println("Total Harga=  "+total);
			System.out.println("Masukkan Bayaran = ");
			bayar= masukan.nextInt();
			kembalian= bayar- total;
		}
			else
		if (pil == 35) {
			biayabeban= 500000;
			System.out.println("Biaya Beban= Rp.500.000");
			System.out.println("Masukkan Jumlah Meter Pemakaian= ");
			jumlahmeter= masukan.nextInt();
			total= jumlahmeter * biayabeban;
			System.out.println("Total Harga=  "+total);
			System.out.println("Masukkan Bayaran = ");
			bayar= masukan.nextInt();
			kembalian= bayar- total;
		}
			else
		if (pil == 40) {
			biayabeban= 550000;
			System.out.println("Biaya Beban= Rp.550.000");
			System.out.println("Masukkan Jumlah Meter Pemakaian= ");
			jumlahmeter= masukan.nextInt();
			total= jumlahmeter * biayabeban;
			System.out.println("Total Harga=  "+total);
			System.out.println("Masukkan Bayaran = ");
			bayar= masukan.nextInt();
			kembalian= bayar- total;
		}
		else {
			System.out.println("Pilihan Kamu Salah , Coba Lagi Masukkan Pilihan Yang Benar");
		
		}
	}
}