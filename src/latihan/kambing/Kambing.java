package latihan.kambing;

public class Kambing {
	/*
    Nama        : Wildan Muhammad Fikri
    Kelas       : IF1
    NIM         : 10118044
    Deskripsi   : Menambah jumlah kambing
     */
	public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing  = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }

    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}
