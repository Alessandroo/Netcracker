package com.netcracker.databaselayer;

import com.netcracker.model.Record;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Vojts on 25.10.2016.
 */
public interface DataClient {
    ArrayList<Record> getList();
    ArrayList<Record> getList(int begin, int count);
    int getCountPage();
    Record getRecord(int id);
    void saveRecord(Record record) throws Exception;
    void updateRecord(Record record);
    void deleteRecord(int id);
}
