package com.revature.Service;

import com.revature.DAO.AccountDAO;
import com.revature.Model.Account;

public class AccountService {

    private AccountDAO accountDAO;

    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public Account addUser(Account account) {
//        if((account.getUsername().length() == 0) || (accountDAO.getAccount(account) != null)) {
//            return null;
//        } else {
            return accountDAO.addUser(account);
//        }
    }

    public Account loginValidate(Account account) {
        if (accountDAO.loginValidate(account) != null) {
            return accountDAO.loginValidate(account);
        } else {
            return null;
        }
    }

//
//    public Account loginValidate(Account account) {
//        if (accountDAO.loginValidate(account) != null) {
//            return accountDAO.loginValidate(account);
//        } else {
//            return null;
//        }
//    }

}
