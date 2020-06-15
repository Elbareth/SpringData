package com.example.SpringDataProject.assembler;

import com.example.SpringDataProject.dto.UserDTO;
import com.example.SpringDataProject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserAssembler {
    @Autowired
    private ProductAssembler productAssembler;

    public UserDTO toDTO(User user){
        return new UserDTO(user.getId(), user.getName(), user.getPassword(), user.getEmail(), productAssembler.toDTO(user.getProduct()));
    }
    public List<UserDTO> toDTO(List<User> user){
        List<UserDTO> dto = new ArrayList<>();
        user.forEach(it -> {
            dto.add(toDTO(it));
        });
        return dto;
    }
    public User toEntity(UserDTO userDTO){
        return new User(userDTO.getName(), userDTO.getPassword(), userDTO.getEmail(), productAssembler.toEntity(userDTO.getProduct()));
    }
    public List<User> toEntity(List<UserDTO> userDTO){
        List<User> entity = new ArrayList<>();
        userDTO.forEach(it ->{
            entity.add(toEntity(it));
        });
        return entity;
    }
}
