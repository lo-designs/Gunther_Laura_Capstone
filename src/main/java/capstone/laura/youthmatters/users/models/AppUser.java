package capstone.laura.youthmatters.users.models;

import capstone.laura.youthmatters.organizations.models.OrgTag;
import capstone.laura.youthmatters.organizations.models.Organization;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private int age;
    private int zipcode;
    @ManyToMany(targetEntity = OrgTag.class)
    private Set<OrgTag> tags;
    @ManyToMany(targetEntity = Organization.class)
    private Set<Organization> organizations;
    @ManyToMany(targetEntity = Role.class)
    private Set<Role> roles;

    public AppUser() {
    }

    public AppUser(String firstName, String lastName, String email, String username, String password, int age, int zipcode, Set<OrgTag> tags, Set<Organization> organizations, Set<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.age = age;
        this.zipcode = zipcode;
        this.tags = tags;
        this.organizations = organizations;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}