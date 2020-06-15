package com.example.SpringDataProject.repository;

import com.example.SpringDataProject.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByPriceBetween(Float min, Float max);
    List<Product> findByNameLike(String name);
    List<Product> findByOrderByPriceAsc();
    List<Product> findByOrderByPriceDesc();
    @Query("SELECT sum(quantity * price) FROM Product")
    Float howRichIAm();
    @Query("SELECT COUNT(id) FROM Product")
    Integer howManyProductIHave();
    @Query("SELECT MAX(price) FROM Product")
    Float maxPrice();
    @Query("SELECT MIN(price) FROM Product")
    Float minPrice();
    @Query("SELECT AVG(price) FROM Product")
    Float average();
    @Query("SELECT new com.example.SpringDataProject.entity.Product(id, name, price, quantity) FROM Product")
    List<Product> projection();
    @Query("SELECT new com.example.SpringDataProject.entity.Product(p.id, p.name, p.price, p.quantity) FROM Product p, User u WHERE p.id = u")
    List<Product> join();
    @Query("SELECT new com.example.SpringDataProject.entity.Product(id, name, AVG(price) as price, quantity) FROM Product GROUP BY quantity")
    List<Product> groupBY();
    @Query(value = "SELECT * FROM Product LIMIT :limit", nativeQuery = true)
    List<Product> findTopN(@Param("limit") Integer limit);
    Product findByNameAndPrice(String name, Double price);
    List<Product> findByNameOrPrice(String name, Double price);
    Product findByNameIs(String name);
    Product findByNameEquals(String name);
    List<Product> findByPriceLessThan(Double price);
    List<Product> findByPriceLessThanEqual(Double price);
    List<Product> findByPriceGreaterThan(Double price);
    List<Product> findByPriceGreaterThanEqual(Double price);
    List<Product> findTop5By();
    List<Product> findByNameStartingWith(String name);
    List<Product> findByNameEndingWith(String name);
    List<Product> findByNameContaining(String name);
}
