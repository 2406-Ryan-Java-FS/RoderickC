package com.revature.DAO;

import com.revature.Model.Account;

public interface AccountDAO {

    public Account addUser(Account account);

    public Account loginValidate(Account account);

}
