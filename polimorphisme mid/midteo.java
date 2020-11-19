import java.util.Scanner;
public class midteo{
public static void main (String[] args) {
	tipe a = new tipe();
	tipe31 b = new tipe31();
	tipe32 c = new tipe32();
	tipe33 d = new tipe33();
	tipe34 e = new tipe34();
	tipe35 f = new tipe35();
	tipe40 g = new tipe40();
	int pil;
	Scanner masukan = new Scanner(System.in);



	a.tampil();
	System.out.print("Pilihan = ");
	pil = masukan.nextInt();
	if (pil == 31) {
		b.tampil31();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +b.total);
		System.out.println("Bayar = " +b.bayar); 
		System.out.println("Kembalian = " +b.kembalian);
	}
	else
	if (pil == 32) {
		c.tampil32();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +c.total);
		System.out.println("Bayar = " +c.bayar); 
		System.out.println("Kembalian = " +c.kembalian);
	}
	else
	if (pil == 33) {
		d.tampil33();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +d.total);
		System.out.println("Bayar = " +d.bayar); 
		System.out.println("Kembalian = " +d.kembalian);
	}
	else
	if (pil == 34) {
		e.tampil34();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +e.total);
		System.out.println("Bayar = " +e.bayar); 
		System.out.println("Kembalian = " +e.kembalian);
	}
	else
	if (pil == 35) {
		f.tampil35();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +f.total);
		System.out.println("Bayar = " +f.bayar); 
		System.out.println("Kembalian = " +f.kembalian);
	}
	else
	if (pil == 40) {
		g.tampil40();
		System.out.println();
		System.out.println("Nama = " +a.nama); 
		System.out.println("Total harga = " +g.total);
		System.out.println("Bayar = " +g.bayar); 
		System.out.println("Kembalian = " +g.kembalian);
	}
	else {
		System.out.println("Pilihan anda salah, coba lagi masukkan pilihan yang benar");
	}
	
	
}
}