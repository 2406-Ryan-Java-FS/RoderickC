package com.revature.Controller;

import com.google.gson.Gson;
import com.revature.Model.Account;
import com.revature.Service.AccountService;
import io.javalin.http.Handler;

public class AccountController {

    private AccountService accountService;
    private Gson gson = new Gson();

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    public Handler addUser = (context) -> {
        Account account = gson.fromJson(context.body(), Account.class);
        if (account == null) {
            context.status(400);
        } else {
            context.status(201);
            account = accountService.addUser(account);
        }

    };
}
