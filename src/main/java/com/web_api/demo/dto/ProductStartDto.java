package com.web_api.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductStartDto {
    private String name;
    private Double price;
    private Integer quantity;
    private String size;
}
