package com.revature.Controller;

import com.google.gson.Gson;
import com.revature.Model.Entry;
import com.revature.Service.EntryService;
import io.javalin.http.Handler;

import java.util.List;

public class Controller {

    private EntryService entryService;
    private Gson gson = new Gson();

    public Controller(EntryService entryService) {
        this.entryService = entryService;
    }

//    public Handler addEntry = (context) -> {
//        Entry entry = gson.fromJson(context.body(), Entry.class);
//
//        if (entry == null) {
//            context.status(400).result("entry is null");
//            return;
//        }
//
//        entry = entryService.addEntry(entry);
////        context.result(gson.toJson(entry));
//        context.status(201).json(entry);
//    };

    public Handler getAllEntry = (context) -> {

        List<Entry> entries = entryService.getAllEntry();
        String entriesJSON = gson.toJson(entries);
        context.result(entriesJSON);
    };

}