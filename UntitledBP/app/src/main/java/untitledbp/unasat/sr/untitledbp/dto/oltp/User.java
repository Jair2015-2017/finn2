package untitledbp.unasat.sr.untitledbp.dto.oltp;

/**
 * Created by Jair on 2/16/2017.
 */

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String created;

    //additional info
    private String nameUser;
    private String Surname;
    private String birthDate;
    private String gender;

    //when deleted
    private String deleted;

    public User() {
        //default constructor
    }

    public User(int id, String username, String password, String created) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.created = created;
    }

    public User(int id, String username, String password, String email, String created, String nameUser, String surname, String birthDate, String gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created = created;
        this.nameUser = nameUser;
        Surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
