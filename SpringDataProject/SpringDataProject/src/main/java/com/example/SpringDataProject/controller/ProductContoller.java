package com.example.SpringDataProject.controller;

import com.example.SpringDataProject.dto.ProductDTO;
import com.example.SpringDataProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductContoller {
    @Autowired
    private ProductService productService;

    @GetMapping("/between")
    public List<ProductDTO> between(@RequestParam("min") Float min, @RequestParam("max") Float max){
        return productService.findByPriceBetween(min, max);
    }
    @GetMapping("/like/{name}")
    public List<ProductDTO> like(@PathVariable("name") String name){
        return productService.findByNameLike(name);
    }
    @GetMapping("/desc")
    public List<ProductDTO> desc(){
        return productService.findByOrderByPriceDesc();
    }
    @GetMapping("/asc")
    public List<ProductDTO> asc(){
        return productService.findByOrderByPriceAsc();
    }
    @GetMapping("/rich")
    public Float rich(){
        return productService.howRichIAm();
    }
    @GetMapping("/quantity")
    public Integer quantity(){
        return productService.howManyProductIHave();
    }
    @GetMapping("/max")
    public Float max(){
        return productService.maxPrice();
    }
    @GetMapping("/min")
    public Float min(){
        return productService.minPrice();
    }
    @GetMapping("/average")
    public Float average(){
        return productService.average();
    }
    @GetMapping("/projection")
    public List<ProductDTO> projection(){
        return productService.projection();
    }
    @GetMapping("/join")
    public List<ProductDTO> join(){
        return productService.join();
    }
    @GetMapping("/groupBy")
    List<ProductDTO> groupBy(){
        return productService.groupBy();
    }
    @GetMapping("/limit/{lim}")
    List<ProductDTO> limit(@PathVariable("lim") Integer limit){
        return productService.limit(limit);
    }
    @GetMapping("/and")
    ProductDTO and(@RequestParam("name") String name, @RequestParam("price") Double price){
        return productService.findByNameAndPrice(name, price);
    }
    @GetMapping("/or")
    List<ProductDTO> or(@RequestParam("name") String name, @RequestParam("price") Double price){
        return productService.findByNameOrPrice(name, price);
    }
    @GetMapping("/is/{param}")
    ProductDTO isParam(@PathVariable("param") String name){
        return productService.findByNameIs(name);
    }
    @GetMapping("/equals/{param}")
    ProductDTO equalsParam(@PathVariable("param") String name){
        return productService.findBtNameEquals(name);
    }
    @GetMapping("/lessThan/{price}")
    public List<ProductDTO> findByPriceLessThan(@PathVariable("price") Double price){
        return productService.findByPriceLessThan(price);
    }
    @GetMapping("/lessThanEqual/{price}")
    public List<ProductDTO> findByPriceLessThanEqual(@PathVariable("price") Double price){
        return productService.findByPriceLessThanEqual(price);
    }
    @GetMapping("/greaterThan/{price}")
    public List<ProductDTO> findByPriceGreaterThan(@PathVariable("price") Double price){
        return productService.findByPriceGreaterThan(price);
    }
    @GetMapping("/greaterThanEqual/{price}")
    public List<ProductDTO> findByPriceGreaterThanEqual(@PathVariable("price") Double price){
        return productService.findByPriceGreaterThanEqual(price);
    }
    @GetMapping("/top5")
    public List<ProductDTO> findTop5(){
        return productService.findTop5();
    }
    @GetMapping("/start/{pocz}")
    public List<ProductDTO> findByNameStartingWith(@PathVariable("pocz") String name){
       return productService.findByNameStartingWith(name);
    }
    @GetMapping("/end/{kon}")
    public List<ProductDTO> findByNameEndingWith(@PathVariable("kon") String name){
        return productService.findByNameEndingWith(name);
    }
    @GetMapping("/contain/{con}")
    public List<ProductDTO> findByNameContaining(@PathVariable("con") String name){
        return productService.findByNameContaining(name);
    }
}
