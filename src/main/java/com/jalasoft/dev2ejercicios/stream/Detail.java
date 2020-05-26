/*
 * Copyright (c) 2020 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into with Jalasoft.
 */

package com.jalasoft.dev2ejercicios.stream;

public class Detail {
    private String codDetail;
    private String product;
    private int quantity;
    private int price;
    private int discount;
    private int total;
    private String codOder;

    public Detail(String codDetail, String product, int quantity, int price, int discount, int total, String codOder) {
        this.codDetail = codDetail;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.total = total;
        this.codOder = codOder;
    }

    public String getCodDetail() {
        return codDetail;
    }

    public void setCodDetail(String codDetail) {
        this.codDetail = codDetail;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCodOrder() {
        return codOder;
    }

    public void setCodOder(String codOder) {
        this.codOder = codOder;
    }
}
