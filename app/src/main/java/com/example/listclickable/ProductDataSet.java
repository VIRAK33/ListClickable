package com.example.listclickable;

interface ProductDataSet {

    int size();

    Product get(int position);

    long getId(int position);

}