public class User {
    private int userId;
    private String name;
    private String phoneNumber;

    public User(int userId, String name, String phoneNumber){
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        boolean isEqual = false;
        if (this == o) isEqual = true;
        else if (o != null && getClass() == o.getClass()) {
            User user = (User) o;
            if(this.getUserId() == ((User) o).getUserId()) isEqual = true;
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return this.getUserId();
    }

    @Override
    public String toString(){
        return "UserId=" + userId + ", name=" + name + ", phoneNumber=" + phoneNumber;
    }
}
