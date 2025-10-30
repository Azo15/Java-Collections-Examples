import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapExamples {
    public static void main(String[] args) {
        // HashMap oluşturma
        HashMap<String, String> map = new HashMap<>();

        // Eleman ekleme
        map.put("isim1", "Azo Ismail");
        map.put("isim2", "Ali Kara");
        map.put("isim3", "Isa Genc");
        System.out.println("Başlangıç Map: " + map);

        // Anahtara göre değer alma
        String isim = map.get("isim1");
        System.out.println("isim1 değeri: " + isim);

        // Anahtar var mı kontrol
        System.out.println("isim2 var mı? " + map.containsKey("isim2"));

        // Değer var mı kontrol
        System.out.println("Ali Kara değeri var mı? " + map.containsValue("Ali Kara"));

        // Eleman silme
        map.remove("isim3");
        System.out.println("isim3 silindi: " + map);

        // Map boyutu
        System.out.println("Map boyutu: " + map.size());

        // Map boş mu?
        System.out.println("Map boş mu? " + map.isEmpty());

        // Tüm anahtarlar
        Set<String> keys = map.keySet();
        System.out.println("Anahtarlar: " + keys);

        // Tüm değerler
        Collection<String> values = map.values();
        System.out.println("Değerler: " + values);

        // Anahtar-değer çiftleri
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Map temizleme
        map.clear();
        System.out.println("Map temizlendi: " + map);
    }
}