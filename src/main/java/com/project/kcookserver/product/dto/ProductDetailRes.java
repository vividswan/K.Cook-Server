package com.project.kcookserver.product.dto;

import com.project.kcookserver.configure.entity.Status;
import com.project.kcookserver.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProductDetailRes {

    private Long productId;

    private Status status;

    private String name;

    private String thumbnail;

    private Integer price;

    private Integer salePrice;

    private Long storeId;

    private String storeName;

    private List<OptionsListRes> optionsList;

    public ProductDetailRes(Product product, List<OptionsListRes> optionsList) {
        this.productId = product.getProductId();
        this.status = product.getStatus();
        this.name = product.getName();
        this.thumbnail = product.getThumbnail();
        this.price = product.getPrice();
        this.salePrice = product.getSalePrice();
        this.storeId = product.getStore().getStoreId();
        this.storeName = product.getStore().getName();
        this.optionsList = optionsList;
    }


}
