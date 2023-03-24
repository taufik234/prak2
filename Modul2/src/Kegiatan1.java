import java.util.ArrayList;

public class Kegiatan1 {
    public static void main(String[] args) {
        // 1. Buat object kosong ArrayList of String
        ArrayList<String> hewan = new ArrayList<>();

        // 2. Isi ArrayList dengan elemen-elemen yang diberikan
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        // 2.1 Tambahkan elemen "Badak" dan "Bebek"
        hewan.add("Badak");
        hewan.add("Bebek");

        System.out.println(hewan);
        // 2.2 Hitung jumlah elemen "Bebek" dan tampilkan posisi index-nya
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
                System.out.println("Posisi index Bebek: " + i);
            }
        }
        System.out.println("Jumlah elemen Bebek: " + jumlahBebek);

        // 3. Hapus posisi "Bebek" yang pertama
        hewan.remove("Bebek");

        System.out.println(hewan);

        // 4. Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0
        System.out.println("Elemen pada index ke-0: " + hewan.get(0));
        System.out.println("Elemen pada index ke-2: " + hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);

        // 5. Ubah index ke-0 dari "Cicak" menjadi "Ular", selanjutnya tambahkan elemen
        // baru pada index ke-2 dengan "Itik"
        hewan.set(0, "Ular");
        System.out.println(hewan);
        hewan.add(2, "Itik");
        System.out.println(hewan);

        // 6. Hapus elemen di antara index ke-1 dan ke-5
        hewan.subList(1, 5).clear();

        // 7. Tampilkan elemen pertama dan terakhir
        System.out.println(hewan);
        System.out.println("Elemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1));

        // 8. Tampilkan jumlah elemen pada ArrayList
        System.out.println("Jumlah elemen: " + hewan.size());

        // 9. Cari posisi index dari "Badak"
        int indexBadak = hewan.indexOf("Badak");
        System.out.println("Posisi index Badak: " + indexBadak);
    }
}
