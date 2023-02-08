package com.example.rod.product.dto;

import com.example.rod.product.entity.productEntity;
import lombok.Getter;

@Getter
public class productResponseDto {
    private String itemName;
    private Long point;
    private String itemImage;
    private String itemDescription;


    public productResponseDto(productEntity product) {
        this.itemName = product.getItemName();
        this.point = product.getPoint();
        this.itemImage = product.getItemImage();
        this.itemDescription = product.getItemDescription();
    }
}
