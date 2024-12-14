package giaodien_interface;

interface  giaodien {
    void in();
    void helloguy();
    void tinhtong();
    default void sonofbitch(){
        System.out.println("Fuck you");
    }
}
