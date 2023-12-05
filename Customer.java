public class Customer {
    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String membershipType;

    public Customer(String username, String password, String fullName, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.membershipType = "Regular"; // Default membership type
    }

    public String getUsername() { return username; }
    public String getFullName() { return fullName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getMembershipType() { return membershipType; }

    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }
}