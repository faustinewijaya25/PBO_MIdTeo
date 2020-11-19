import java.util.Scanner;
class tipe34 extends tipe{
	void tampil34() {
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
}