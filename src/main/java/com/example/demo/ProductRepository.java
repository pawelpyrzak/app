package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getAll() {
       return jdbcTemplate.query("SELECT id, name, rating FROM product",
                BeanPropertyRowMapper.newInstance(Product.class));
        }

    public Product getById(int id){
        return jdbcTemplate.queryForObject("SELECT id, name, rating FROM product WHERE" + "id = ?",
                BeanPropertyRowMapper.newInstance(Product.class), id);
    }

    public int save(List<Product> products) {
        
        products.forEach(product -> jdbcTemplate.update("INSERT INTO product(name, rating VALUES(?,?)",
                product.getName(), product.getRating()));

        return 1;
    }
    public int update(Product product){
        return jdbcTemplate.update("UPDATE movie SET name=?, rating=? WHERE id=?",
                product.getName(), product.getRating(), product.getId());
    }
}
