import java.util.HashMap;

public class hasmap {
    public static void main(String[] args) {
        hasmap ha = new hasmap();
        ha.phan1();
    }

    public void phan1() {
        //1.khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();

        //2.them cac phan tu vao hasmap
        map.put(20, "son of bitch");
        map.put(201, "1son of bitch");
        map.put(19, "3son of bitch");
        map.put(24, "son of bkakaitch");
        map.put(25, "son lalaof bitch");

        //3.lay 1 gia tri
        String value = map.get(24);
        System.out.println(value);

        //4. remove
        map.remove(24);
        System.out.println(map.get(24));

        //4.check xem co o trong map ko
        System.out.println(map.containsKey(24));
        System.out.println(map.containsValue("son of bitch"));

        //5.
        System.out.println(map.isEmpty());
        //6.
        System.out.println(map.size());
        //7.duyet
        for (Integer ke : map.keySet()) {
            String value1 = map.get(ke);
            System.out.println(value1);
        }
    }
}
