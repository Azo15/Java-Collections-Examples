import java.util.ArrayList;

public class ExampleCollections {
    public static void main(String[] args) {
        // ArrayList oluşturma
        ArrayList<String> list = new ArrayList<>();

        // Eleman ekleme
        list.add("Azo Ismail");
        list.add("Ali Kara");
        list.add("Isa Genc");
        System.out.println("Başlangıç Listesi: " + list);

        // Belirli indekse ekleme
        list.add(1, "Yeni Eleman");
        System.out.println("Araya Ekleme: " + list);

        // Eleman alma
        String isim = list.get(0);
        System.out.println("0. indeks: " + isim);

        // Eleman değiştirme
        list.set(2, "Değiştirildi");
        System.out.println("Eleman değiştirildi: " + list);

        // Eleman silme (indeks ile)
        list.remove(1);
        System.out.println("1. indeks silindi: " + list);

        // Eleman silme (objeyle)
        list.remove("Ali Kara");
        System.out.println("Ali Kara silindi: " + list);

        // Eleman var mı kontrol
        System.out.println("Isa Genc var mı? " + list.contains("Isa Genc"));

        // Elemanın indeksi
        System.out.println("Değiştirildi'nin indeksi: " + list.indexOf("Değiştirildi"));

        // Liste boyutu
        System.out.println("Liste boyutu: " + list.size());

        // Liste boş mu?
        System.out.println("Liste boş mu? " + list.isEmpty());

        // Başka liste ekleme
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Baver Yildiz");
        list2.add("Mehmet Celik");
        list2.addAll(list);
        System.out.println("Birleştirilmiş Liste: " + list2);

        // Listeyi temizleme
        list.clear();
        System.out.println("Liste temizlendi: " + list);
    }
}