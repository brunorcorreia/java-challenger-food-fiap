package com.fiap.challenger.food.application.domain.model.dto;

import com.fiap.challenger.food.application.domain.model.Producto;
import com.fiap.challenger.food.common.CategoriaEnum;

public class ProductoDto {
    private String description;
    private String brand;
    private CategoriaEnum category;
    private String valor;

    public ProductoDto(){}

    public ProductoDto(Producto producto){
        this.description = producto.getDescription();
        this.brand = producto.getBrand();
        this.category = producto.getCategory();
        this.valor = producto.getValor();
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CategoriaEnum getCategory() {
        return category;
    }

    public void setCategory(CategoriaEnum category) {
        this.category = category;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
