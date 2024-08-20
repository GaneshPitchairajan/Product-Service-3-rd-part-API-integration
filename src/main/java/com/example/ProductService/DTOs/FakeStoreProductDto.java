package com.example.ProductService.DTOs;

public class FakeStoreProductDto {
//    {
//        "id": 1,
//            "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
//            "price": 109.95,
//            "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
//            "category": "men's clothing",
//            "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
//            "rating": {
//        "rate": 3.9,
//                "count": 120
//    }
    int id;
    String title;
    String price;
    String description;
    String category;
    String image;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    //we are ignoring the rating from the 3 rd party API
}
