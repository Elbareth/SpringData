package com.example.SpringDataProject.dto;

import java.util.List;
import java.util.Objects;

public class UserDTO {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private ProductDTO product;

    public UserDTO(Integer id, String name, String password, String email, ProductDTO product) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.product = product;
    }

    public UserDTO() {
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

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDTO)) return false;
        UserDTO userDTO = (UserDTO) o;
        return getId().equals(userDTO.getId()) &&
                getName().equals(userDTO.getName()) &&
                getPassword().equals(userDTO.getPassword()) &&
                getEmail().equals(userDTO.getEmail()) &&
                getProduct().equals(userDTO.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPassword(), getEmail(), getProduct());
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", product=" + product +
                '}';
    }
}
