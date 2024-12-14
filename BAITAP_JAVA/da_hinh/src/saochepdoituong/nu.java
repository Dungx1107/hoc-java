package saochepdoituong;

public class nu {
    private String name;
    private String cccd;

    public nu(String name, String cccd) {
        this.name = name;
        this.cccd = cccd;
    }

    public nu(nu a) {
        name = a.name;
        cccd = a.cccd;
    }
    public nu clone(){

        return new nu(this);
    }

    public void in() {
        System.out.println(name + cccd);
    }

}
