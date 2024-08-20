package com.example.ProductService.Controller;
import com.example.ProductService.Models.Product;
import com.example.ProductService.Service.FakeStoreService;
import com.example.ProductService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> GetProductById(@PathVariable("id") long productid) {
        if(productid>20 || productid<1)
        {
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }
        Product product= productService.GetProductById(productid);
        return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
    }
}