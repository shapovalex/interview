package com.example.task3;

import com.example.task3.model.Row;
import com.example.task3.model.Table;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TableService {
    private RowService rowService;

    public TableService(RowService rowService) {
        this.rowService = rowService;
    }

    public void createTable(String name, ArrayList<Row> rowArrayList) {
        Table table = new Table();
        table.setName(name);
        table.setRowIds(rowService.createRows(rowArrayList));
        table.setUpdateTime(new Date());

        saveTable(table);

    }

    private void saveTable(Table table) {
        //...
    }

    public void updateModifyDate() {
        //...
    }
}
