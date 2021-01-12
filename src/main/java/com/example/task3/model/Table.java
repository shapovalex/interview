package com.example.task3.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Table {
    private String name;
    private ArrayList<Integer> rowIds;
    private Date updateTime;
}
