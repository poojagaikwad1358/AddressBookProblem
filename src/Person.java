public class Person {

        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private int zip;
        private int phoneNum;

    public void setPerson(String firstName, String lastName, String address, String city, String state, int zip, int phoneNum) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNum = phoneNum;
    }

    void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    void setLastName(String lastName) {
        this.lastName=lastName;
    }

    void setAddress(String address) {
        this.address=address;
    }

    void setCity(String city) {
        this.city=city;
    }

    void setState(String state) {
        this.state=state;
    }

    void setZip(int zip) {
        this.zip=zip;
    }

    void setPhoneNum(int phoneNum) {
        this.phoneNum=phoneNum;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getAddress() {
        return address;
    }

    String getCity() {
        return city;
    }

    String getState() {
        return state;
    }

    int getZip() {
        return zip;
    }

    int getPhoneNum() {
        return phoneNum;
        }

    @Override
        public String toString() {
            return "\nFirst Name: "+firstName+
                    "\nLast Name: "+lastName+
                    "\nAddress: "+address+
                    "\nCity: "+city+
                    "\nState: "+state+
                    "\nZip: "+zip+
                    "\nPhone Number: "+phoneNum;
        }
}

