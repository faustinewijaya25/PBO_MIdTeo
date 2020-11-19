import java.util.Scanner;
class tipe31 extends tipe {
	void tampil31() {
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
	}