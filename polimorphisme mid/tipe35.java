import java.util.Scanner;
class tipe35 extends tipe {
	void tampil35() {
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
}