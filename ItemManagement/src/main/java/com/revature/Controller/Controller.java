package com.revature.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
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

    public Handler addEntry = (context) -> {
        ObjectMapper mapper = new ObjectMapper();
        Entry entry = gson.fromJson(context.body(), Entry.class);

        if (entry == null) {
            context.status(400).result("entry is null");
            return;
        } else {
            System.out.println("Req body: " + context.body());
            context.status(201).json(entry);
            entry = entryService.addEntry(entry);
        }

    };

    public Handler getAllEntry = (context) -> {

        List<Entry> entries = entryService.getAllEntry();
        String entriesJSON = gson.toJson(entries);
        context.result(entriesJSON);
    };

    public Handler getEntryById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        Entry entry = entryService.getEntry(id);
        context.result(gson.toJson(entry));

    };

    public Handler updateEntry = (context) -> {

        ObjectMapper mapper = new ObjectMapper();
        Entry entry = gson.fromJson(context.body(), Entry.class);
        int id = Integer.parseInt(context.pathParam("id"));
//        Entry updatedEntry = entryService.updateEntry(entry, id);
        if (entry != null) {
            context.status(201);
            System.out.println(context.body());
            context.json(entry);
            entry = entryService.updateEntry(entry, id);
        } else {
            context.status(400);
        }
    };

}