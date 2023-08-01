package com.proyectointegradorequipo3.proyectointegradorEquipo3.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkDto {
    private String name;
    private String image;
    private Double price;
    private Integer amount;
}
