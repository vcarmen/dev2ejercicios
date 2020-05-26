/*
 * Copyright (c) 2020 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.dev2ejercicios;

import com.jalasoft.dev2ejercicios.stream.Detail;
import com.jalasoft.dev2ejercicios.stream.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]){

        Detail detail1 = new Detail("cod1", "cocina", 2, 1000, 10, 1990, "ped1");
        Detail detail2 = new Detail("cod2", "lavadora", 1, 2500, 0, 2500, "ped1");
        Detail detail3 = new Detail("cod3", "plancha", 5, 300, 50, 1450, "ped1");

        Detail detail4 = new Detail("cod4", "mesa", 2, 700, 30, 1370, "ped2");
        Detail detail5 = new Detail("cod5", "muebles", 1, 3500, 0, 3500, "ped2");
        Detail detail6 = new Detail("cod6", "comoda", 3, 800, 100, 2300, "ped2");

        Detail detail7 = new Detail("cod7", "camisa", 10, 100, 100, 900, "ped3");
        Detail detail8 = new Detail("cod8", "polera", 20, 80, 0, 1600, "ped3");
        Detail detail9 = new Detail("cod9", "zapatos", 8, 400, 200, 3000, "ped3");

        List<Detail> detailList1 = new ArrayList<>();
        detailList1.add(detail1);
        detailList1.add(detail2);
        detailList1.add(detail3);

        List<Detail> detailList2 = new ArrayList<>();
        detailList2.add(detail4);
        detailList2.add(detail5);
        detailList2.add(detail6);

        List<Detail> detailList3 = new ArrayList<>();
        detailList3.add(detail7);
        detailList3.add(detail8);
        detailList3.add(detail9);

        Order order1 = new Order("ped1", "normal", "Juan Perez","2020-05-05", detailList1);
        Order order2 = new Order("ped2", "programado", "Maria Guzman","2020-05-03", detailList2);
        Order order3 = new Order("ped3", "normal", "Juan Perez","2020-05-10", detailList3);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);

        //1. Select cliente from Pedido
        System.out.println("---- Select client from Order ----");
        orderList.stream()
                .map(order -> order.getClient())
                .forEach(value -> System.out.println(value));

        //2. Select cliente from Pedido where tipoPedido = “normal”
        System.out.println("---- Select client from Order where typeOrder = normal ----");
        orderList.stream()
                .filter(order -> order.getTypeOrder().equals("normal"))
                .map(order -> order.getClient())
                .forEach(value -> System.out.println(value));

        //3. Select codPedido from Pedido where fecha = “2020-05-05”
        System.out.println("---- Select codOrder from Order where date = 2020-05-05 ----");
        orderList.stream()
                .filter(order -> order.getDate().equals("2020-05-05"))
                .map(order -> order.getCodOrder())
                .forEach(value -> System.out.println(value));

        //4. Select producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and
        //Pedido.codPedido = “ped1”

        System.out.println("---- Select product from Detail, Order where date = 2020-05-05 ----");
        orderList.stream()
                .filter(order -> order.getDate().equals("2020-05-05"))
                .map(order -> order.getDetailList())
                .flatMap(details -> details.stream())
                .map(detail -> detail.getProduct())
                .forEach(value -> System.out.println(value));

        //5. Select Detalle.producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido
        //and Detalle.cantidad > 8
        // for this query, let's introduce a fourth order, where the codOrder in the details doesn't match with codOrder
        Order order4 = new Order("ped4", "normal", "Juan Perez","2020-05-05", detailList1);
        orderList.add(order4);

        System.out.println("---- Select detail.product from Detail, Order where order.codOrder = detail.codOrder ----");

        orderList.stream()
                .filter(order -> order.getDetailList().stream()
                    .anyMatch(detail->
                            detail.getCodOrder().equals(order.getCodOrder()) &&
                                    detail.getQuantity() > 8
                        ))
                .map(order -> order.getDetailList())
                .flatMap(details -> details.stream())
                .forEach(value -> System.out.println(value.getProduct()));

    }

}
