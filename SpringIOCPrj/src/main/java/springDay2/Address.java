package springDay2;

public class Address {
    private int addressId;
    private String AddressLine1;
    private String AddressLine2;
    private String city;
    private int Zip;


    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", AddressLine1='" + AddressLine1 + '\'' +
                ", AddressLine2='" + AddressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", Zip=" + Zip +
                '}';
    }
}
