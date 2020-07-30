package Model;

/**
 *
 * @author ACER E15
 */
public class User {

    private String account_id;
    private String password;
    private String name;
    private String gender;
    private String phone;
    private String email;
    private double balance;

    public User(String account_id, String password, String name, String gender, String phone, String email, double balance) {
        this.account_id = account_id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.balance = balance;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" + "account_id=" + account_id + ", password=" + password + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", balance=" + balance + '}';
    }

}