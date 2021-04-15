class GodObject {
    public int userId;
    public String birthDate;
    public String name;
    public String phoneNumber;
    public String address;

    public static void editUser (User user){}
    public static void deleteUser(User user) {}
    public static void addAddress(int userId, AddressManager addressManager) {}
    public static void removeAddress(int userId, AddressManager addressManager) {}
    public static void giveBonus(int userId, Money bonus) {}
    public static void giveSalary(int userId, Money salary) {}
    public static void addPhoneNumber(int userId, String phoneNumber) {}
}

// Breaking the "God object" into separate classes
class User {
    private int userId;
    private String birthDate;
    private String name;
    private String phoneNumber;

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    //...
}

class AddressManager {
    public static void addAddress(int userId, AddressManager addressManager) {}
    public static void removeAddress(int userId, AddressManager addressManager) {}
}

class UserManager {
    public static void editUser (User user){}
    public static void deleteUser(User user) {}
    public static void addPhoneNumber(int userId, String phoneNumber) {}
}

class PayManager{
    public static void giveBonus(int userId, Money bonus) {}
    public static void giveSalary(int userId, Money salary) {}
}




