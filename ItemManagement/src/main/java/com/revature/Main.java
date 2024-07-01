package com.revature;

import com.revature.Controller.AccountController;
import com.revature.Controller.Controller;
import com.revature.DAO.AccountDAO;
import com.revature.DAO.AccountDAOImpl;
import com.revature.DAO.EntryDAO;
import com.revature.DAO.EntryDAOImpl;
import com.revature.Service.AccountService;
import com.revature.Service.EntryService;
import io.javalin.Javalin;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());
        Javalin app = Javalin.create();
        establishRoutes(app);

//        Javalin app = controller.startAPI();
        app.start(8080);
    }

    private static void establishRoutes(Javalin app) {

        EntryDAO ed = new EntryDAOImpl();
        EntryService es = new EntryService(ed);
        Controller controller = new Controller(es);

        AccountDAO ad = new AccountDAOImpl();
        AccountService as = new AccountService(ad);
        AccountController accountController = new AccountController(as);

        app.post("/paints", controller.addEntry);
        app.get("/test", (context -> context.result("Hello!!!")));
        app.get("/paints", controller.getAllEntry);
        app.get("paints/{id}", controller.getEntryById);
        app.put("paints/{id}", controller.updateEntry);
        app.delete("paints/{id}", controller.deleteEntry);

        app.post("/account", accountController.addUser);
        app.post("/login", accountController.loginValidate);

    }
}