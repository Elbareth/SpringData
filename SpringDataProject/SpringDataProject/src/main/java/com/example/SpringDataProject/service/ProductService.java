package com.example.SpringDataProject.service;

import com.example.SpringDataProject.assembler.ProductAssembler;
import com.example.SpringDataProject.dto.ProductDTO;
import com.example.SpringDataProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductAssembler productAssembler;

    public List<ProductDTO> findByPriceBetween(Float min, Float max){
        return productAssembler.toDTO(productRepository.findByPriceBetween(min, max));
    }
    public List<ProductDTO> findByNameLike(String name){
        return productAssembler.toDTO(productRepository.findByNameLike(name));
    }
    public List<ProductDTO> findByOrderByPriceAsc(){
        return productAssembler.toDTO(productRepository.findByOrderByPriceAsc());
    }
    public List<ProductDTO> findByOrderByPriceDesc(){
        return productAssembler.toDTO(productRepository.findByOrderByPriceDesc());
    }
    public Float howRichIAm(){
        return productRepository.howRichIAm();
    }
    public Integer howManyProductIHave(){
        return productRepository.howManyProductIHave();
    }
    public Float maxPrice(){
        return productRepository.maxPrice();
    }
    public Float minPrice(){
        return productRepository.minPrice();
    }
    public Float average(){
        return productRepository.average();
    }
    public List<ProductDTO> projection(){
        return productAssembler.toDTO(productRepository.projection());
    }
    public List<ProductDTO> join(){
        return productAssembler.toDTO(productRepository.join());
    }
    public List<ProductDTO> groupBy(){
        return productAssembler.toDTO(productRepository.groupBY());
    }
    public List<ProductDTO> limit(Integer limit){
        return productAssembler.toDTO(productRepository.findTopN(limit));
    }
    public ProductDTO findByNameAndPrice(String name, Double price){
        return productAssembler.toDTO(productRepository.findByNameAndPrice(name, price));
    }
    public List<ProductDTO> findByNameOrPrice(String name, Double price){
        return productAssembler.toDTO(productRepository.findByNameOrPrice(name, price));
    }
    public ProductDTO findByNameIs(String name){
        return productAssembler.toDTO(productRepository.findByNameIs(name));
    }
    public ProductDTO findBtNameEquals(String name){
        return productAssembler.toDTO(productRepository.findByNameEquals(name));
    }
    public List<ProductDTO> findByPriceLessThan(Double price){
        return productAssembler.toDTO(productRepository.findByPriceLessThan(price));
    }
    public List<ProductDTO> findByPriceLessThanEqual(Double price){
        return productAssembler.toDTO(productRepository.findByPriceLessThanEqual(price));
    }
    public List<ProductDTO> findByPriceGreaterThan(Double price){
        return productAssembler.toDTO(productRepository.findByPriceGreaterThan(price));
    }
    public List<ProductDTO> findByPriceGreaterThanEqual(Double price){
        return productAssembler.toDTO(productRepository.findByPriceGreaterThanEqual(price));
    }
    public List<ProductDTO> findTop5(){
        return productAssembler.toDTO(productRepository.findTop5By());
    }
    public List<ProductDTO> findByNameStartingWith(String name){
        return productAssembler.toDTO(productRepository.findByNameStartingWith(name));
    }
    public List<ProductDTO> findByNameEndingWith(String name){
        return productAssembler.toDTO(productRepository.findByNameEndingWith(name));
    }
    public List<ProductDTO> findByNameContaining(String name){
        return productAssembler.toDTO(productRepository.findByNameContaining(name));
    }
}
