import java.util.Scanner;
class tipe40 extends tipe {
	void tampil40() {
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
}