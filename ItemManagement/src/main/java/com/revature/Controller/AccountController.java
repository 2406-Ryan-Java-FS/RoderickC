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

        String username = account.getUsername();

        Account accountExists = accountService.getUser(username);

        if (accountExists != null) {
            context.status(400);
            context.result("Username already exists");
        } else {
            context.status(201);
            account = accountService.addUser(account);
            context.json(account);
        }

    };

    public Handler loginValidate = (context) -> {
      Account account = gson.fromJson(context.body(), Account.class);

      Account validateAccount = accountService.loginValidate(account);
      if (validateAccount != null) {
          context.status(200);
          System.out.println("Logged in as " + validateAccount.getUsername());
          context.json(validateAccount);
      } else {
          context.status(400);
          context.result("Wrong username or password");
      }

    };

}
