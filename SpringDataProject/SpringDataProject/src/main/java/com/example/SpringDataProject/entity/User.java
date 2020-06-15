package com.example.SpringDataProject.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.Objects;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @NotNull
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    @Email
    private String email;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "product", referencedColumnName = "id")
    private Product product;

    public User(Integer id, String name, String password, @Email String email, Product product) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.product = product;
    }

    public User(String name, String password, @Email String email, Product product) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.product = product;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId().equals(user.getId()) &&
                getName().equals(user.getName()) &&
                getPassword().equals(user.getPassword()) &&
                getEmail().equals(user.getEmail()) &&
                getProduct().equals(user.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPassword(), getEmail(), getProduct());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", product=" + product +
                '}';
    }
}
