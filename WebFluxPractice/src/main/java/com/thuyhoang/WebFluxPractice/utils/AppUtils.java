package com.thuyhoang.WebFluxPractice.utils;

import com.thuyhoang.WebFluxPractice.dto.ProductDTO;
import com.thuyhoang.WebFluxPractice.entity.Product;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ProductDTO entityToDto(Product product){
        ProductDTO dto = new ProductDTO();
        BeanUtils.copyProperties(product, dto);
        return dto;
    }

    public static Product dtoToEntity(ProductDTO dto){
        Product product = new Product();
        BeanUtils.copyProperties(dto, product);
        return product;
    }
}
