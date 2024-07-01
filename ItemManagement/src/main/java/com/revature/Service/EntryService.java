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


    public Entry addEntry(Entry entry) {
        return entryDAO.addEntry(entry);
    }

    public List<Entry> getAllEntry() {
        return entryDAO.getAllEntry();
    }

    public Entry getEntry(int id) {
        return entryDAO.getEntry(id);
    }

    public List<Entry> getEntryByAccount(int posted_by) {
        return entryDAO.getEntryByAccount(posted_by);
    }

    public Entry updateEntry(Entry entry, int id) {
        return entryDAO.updateEntry(entry, id);
    }

    public Entry deleteEntry(int id) {
        return entryDAO.deleteEntry(id);
    }

}
