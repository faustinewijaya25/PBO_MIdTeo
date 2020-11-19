import java.util.Scanner;
class tipe32 extends tipe {
	void tampil32() {
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
}