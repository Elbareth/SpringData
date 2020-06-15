package com.example.SpringDataProject.assembler;

import com.example.SpringDataProject.dto.ProductDTO;
import com.example.SpringDataProject.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductAssembler {
    public Product toEntity(ProductDTO productDTO){
        return new Product(productDTO.getName(), productDTO.getPrice().doubleValue(), productDTO.getQuantity());
    }
    public List<Product> toEntity(List<ProductDTO> productDTO){
        List<Product> entity = new ArrayList<>();
        productDTO.forEach( it -> {
            entity.add(toEntity(it));
        });
        return entity;
    }
    public ProductDTO toDTO(Product productEntity){
        return new ProductDTO(productEntity.getId(), productEntity.getName(), productEntity.getPrice().floatValue(), productEntity.getQuantity());
    }
    public List<ProductDTO> toDTO(List<Product> productEntitie){
        List<ProductDTO> dto = new ArrayList<>();
        productEntitie.forEach( it ->{
            dto.add(toDTO(it));
        });
        return dto;
    }
}
