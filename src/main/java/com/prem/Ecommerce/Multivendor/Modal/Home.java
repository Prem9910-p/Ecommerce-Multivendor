package com.prem.Ecommerce.Multivendor.Modal;

import lombok.Data;

import java.util.List;

@Data
public class Home {

    private List<HomeCategory> grid;

    private List<HomeCategory> shopByCategories;

    private List<HomeCategory> electricCategories;

    private List<HomeCategory> dealCategories;

    private List<Deal> deal;
}
