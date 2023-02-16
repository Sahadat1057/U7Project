public class Address {
    private String houseNumber;
    private String streetName;
    private String apartmentNum;
    private String cityName;
    private String stateName;
    private int zipCode;

    private Address outsideAddress;

    public Address(String houseNumber, String streetName, String apartmentNum, String cityName, String stateName, int zipCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.apartmentNum = apartmentNum;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }

    public Address(Address outsideAddress) {
        this.houseNumber = outsideAddress.houseNumber;
        this.streetName = outsideAddress.streetName;
        this.apartmentNum = outsideAddress.apartmentNum;
        this.cityName = outsideAddress.cityName;
        this.stateName = outsideAddress.stateName;
        this.zipCode = outsideAddress.zipCode;
    }

    // 1313 Mockingbird Lane Apt 6A, Springfield, MO 65123
    // 1313 Mockingbird Lane, Springfield, MO 65123

    public Address(String totalAddress) {
        String[] separatedAddress = totalAddress.split(",");
        String first = separatedAddress[0];
        String second = separatedAddress[1];
        String third = separatedAddress[2];
        this.houseNumber = first.substring(0, first.indexOf("") - 1);
        if (first.indexOf("Apt") != -1) {
            this.streetName = first.substring(first.indexOf(""), first.indexOf("Apt") - 1);
            this.apartmentNum = first.substring(first.indexOf("Apt"));
            this.cityName = second;
            this.stateName = third.substring(1,3);
            this.zipCode = Integer.parseInt(third.substring(4));
        }
        else if (first.indexOf("Apt") == -1) {
            this.streetName = first.substring(first.indexOf(""));
            this.cityName = second;
            this.stateName = third.substring(1,3);
            this.zipCode = Integer.parseInt(third.substring(4));
        }
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address getOutsideAddress() {
        return outsideAddress;
    }

    public void setOutsideAddress(Address outsideAddress) {
        this.outsideAddress = outsideAddress;
    }

    public 
}
