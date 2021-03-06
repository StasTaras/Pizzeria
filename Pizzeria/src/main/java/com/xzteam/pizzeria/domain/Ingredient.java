package com.xzteam.pizzeria.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("unused")
@Entity
@Table(name = "ingredient")
public class Ingredient implements Serializable {

    @Id
    @Column(name = "ingredient_id")
    private Long ingredientId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "price")
    private Float price;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "image_url", length = 100)
    private String imageUrl;

    @ManyToMany(mappedBy = "ingredients")
    private List<Pizza> pizzas;

    public Ingredient() {
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientId=" + ingredientId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}