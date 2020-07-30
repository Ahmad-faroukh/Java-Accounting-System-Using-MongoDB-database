package Model;

/**
 *
 * @author ACER E15
 */
public class Admin {

    private String name;
    private String password;

    public Admin(String name, String Password) {
        this.name = name;
        this.password = Password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    @Override
    public String toString() {
        return "Admin{" + "name=" + name + ", Password=" + password + '}';
    }

}