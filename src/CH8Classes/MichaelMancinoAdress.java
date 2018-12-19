package CH8Classes;

public class MichaelMancinoAdress {
    private int housenum;
    private String aptnum;
    private String street;
    private String city;
    private String state;
    private int zipcode;

    public MichaelMancinoAdress(int housenum,String street, String city, String state, int zipcode) {
        this.housenum = housenum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public MichaelMancinoAdress(String aptnum, String street, String city, String state, int zipcode) {
        this.aptnum = aptnum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public int getHousenum() {
        return housenum;
    }

    public String getAptnum() {
        return aptnum;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setHousenum(int housenum) {
        this.housenum = housenum;
    }

    public void setAptnum(String aptnum) {
        this.aptnum = aptnum;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
