package com.revature.Service;

import com.revature.DAO.EntryDAO;
import com.revature.Model.Entry;

import java.awt.*;
import java.util.List;

public class EntryService {

    private EntryDAO entryDAO;

    public EntryService(EntryDAO entryDAO) {
        this.entryDAO = entryDAO;
    }


//    public Entry addEntry(Entry entry) {
//        return entryDAO.addEntry(entry);
//    }

    public List<Entry> getAllEntry() {
        return entryDAO.getAllEntry();
    }

}
