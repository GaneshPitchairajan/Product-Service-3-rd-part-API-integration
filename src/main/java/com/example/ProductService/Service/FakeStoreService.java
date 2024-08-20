package com.example.ProductService.Service;

import com.example.ProductService.DTOs.FakeStoreProductDto;
import com.example.ProductService.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreService implements ProductService {
    @Override
    public Product GetProductById(long id) {
        //Take Id as input call the 3rd party API https://fakestoreapi.com/products/
        String url="https://fakestoreapi.com/products/"+id;
        RestTemplate restTemplate=new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto =restTemplate.getForObject(url, FakeStoreProductDto.class);
        return ConvertFakeStoreProductDtoToProduct(fakeStoreProductDto);
    }

    private Product ConvertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStore){
        Product product=new Product();
        product.setName(fakeStore.getTitle());
        product.setCategory(fakeStore.getCategory());
        product.setDescription(fakeStore.getDescription());
        return product;
    }
}
