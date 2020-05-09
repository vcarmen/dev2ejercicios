/*
 * Copyright (c) 2020 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.dev2ejercicios.loop;

import java.util.ArrayList;
import java.util.List;

public class Task {

    public static void practice(){
        List<Integer> task = new ArrayList<>();
        task.add(1);
        task.add(4);
        task.add(10);

        // stream is a wrapper para manejar mejor los arreglos
        task.stream().forEach(value -> System.out.println(value));

        System.out.println("---------------");

        task.stream()
                .filter(value -> value > 5)
                .forEach(value -> System.out.println(value));
    }
}
