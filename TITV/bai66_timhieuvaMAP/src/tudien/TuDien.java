package tudien;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    private Map<String, String> dulieu = new TreeMap<String, String>();

    public String ThemTu(String tukhoa, String ynghia) {
        return this.dulieu.put(tukhoa, ynghia);
    }

    public String tratu(String tukhoa) {
        String kq = this.dulieu.get(tukhoa);
        return kq;
    }

    public void inratudien() {
        for (Map.Entry<String,String> entry : dulieu.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void intukhoa() {
        Set<String> taphop = this.dulieu.keySet();
        System.out.println(Arrays.toString(taphop.toArray()));
    }
}
