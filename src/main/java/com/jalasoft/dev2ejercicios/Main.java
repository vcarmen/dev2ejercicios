/*
 * Copyright (c) 2020 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.dev2ejercicios;

import com.jalasoft.dev2ejercicios.practice3.Bicycle;
import com.jalasoft.dev2ejercicios.practice3.Car;
import com.jalasoft.dev2ejercicios.practice3.ListLandTransport;

public class Main {
    public static void main(String args[]) {
        ListLandTransport trans = new ListLandTransport();
        trans.addLand(new Bicycle("Cross", 1500, false, false));
        trans.addLand(new Car("Audi", 20000, true, false));
        trans.display();
    }
}
