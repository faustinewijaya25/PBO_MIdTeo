import java.util.Scanner;
class tipe33 extends tipe {
	void tampil33(){
		biayabeban= 450000;
			System.out.println("Biaya Beban= Rp.450.000");
			System.out.println("Masukkan Jumlah Meter Pemakaian= ");
			jumlahmeter= masukan.nextInt();
			total= jumlahmeter * biayabeban;
			System.out.println("Total Harga=  "+total);
			System.out.println("Masukkan Bayaran = ");
			bayar= masukan.nextInt();
			kembalian= bayar- total;
	}
}