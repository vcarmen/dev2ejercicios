/*
 * Copyright (c) 2020 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into with Jalasoft.
 */

package com.jalasoft.dev2ejercicios.practice3;

/**
 * @aythor car
 * version 1.1
 **/

public class Land extends Transport {
    Boolean hasMotor;

    public Land(String name, int price, boolean hasMotor){
        super(name,price);
        this.hasMotor = hasMotor;
    }

    public String displayData() {
        return String.format("name = %s, price = %s, hasMotor = %s", name, price, hasMotor);
    }

}
