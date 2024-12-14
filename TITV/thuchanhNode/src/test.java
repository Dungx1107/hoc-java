public class test {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.addLast("son of bitch");
        ll.addLast("so");
        ll.addLast("son");
        ll.addLast("titv");

        ll.traverse();

        System.out.println("-------------------------------------------------");

        ll.addFirst("nguyen thi ha phuong");
        ll.addFirst("ha phuong");
        ll.addFirst("vu xuan dung");

        ll.traverse();

        ll.insertAfter("titv", "vn");

        ll.traverse();
        System.out.println("-------------------------------------------------------");
        System.out.println(ll.remove("vu xuan dung"));
        System.out.println(ll.remove("ha phuong"));

        ll.traverse();
    }
}
