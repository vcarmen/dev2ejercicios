/*
 * Copyright (c) 2020 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into with Jalasoft.
 */

package com.jalasoft.dev2ejercicios.practice3;

import java.util.ArrayList;
import java.util.List;

/**
 * @aythor car
 * version 1.1
 **/

public class ListLandTransport {
    List<Land> landList = new ArrayList<>();

    public void addLand(Land land){
        landList.add(land);
    }

    public void display(){
        landList.stream()
                .forEach(value -> System.out.println(value.displayData()));
    }
}
