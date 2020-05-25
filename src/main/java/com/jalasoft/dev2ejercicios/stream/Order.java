/*
 * Copyright (c) 2020 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into with Jalasoft.
 */

package com.jalasoft.dev2ejercicios.stream;

import java.util.List;

public class Order {
    private String codOrder ;
    private String typeOrder;
    private String client;
    private String date;
    private List<Detail> detailList;

    public Order(String codOrder, String typeOrder, String client, String date, List<Detail> detailList){
        this.codOrder = codOrder;
        this.typeOrder = typeOrder;
        this.client = client;
        this.date = date;
        this.detailList = detailList;
    }

    public String getCodOrder() {
        return codOrder;
    }

    public void setCodOrder(String codOrder) {
        this.codOrder = codOrder;
    }

    public String getTypeOrder() {
        return typeOrder;
    }

    public void setTypeOrder(String typeOrder) {
        this.typeOrder = typeOrder;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }
}
