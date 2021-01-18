package com.example.task3;

import com.example.task3.model.Row;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RowService {
    private TableService tableService;

    public RowService(TableService tableService) {
        this.tableService = tableService;
    }

    public ArrayList<Integer> createRows(ArrayList<Row> rowArrayList) {
        return new ArrayList<>();
    }

    public void updateRow(Integer rowId, String data) {
        tableService.updateModifyDate();
        //.....
    }
}
