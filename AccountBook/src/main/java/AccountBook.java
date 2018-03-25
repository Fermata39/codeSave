import category.Category;
import category.NewCategory;
import input.InputAccount;
import menu.AccountMenu;
import print.PrintAccount;

import java.util.ArrayList;
import java.util.List;


public class AccountBook {

    public static void main(String[] args) {

        List<InputAccount> list;
        AccountMenu accountMenu = new AccountMenu();

        list = accountMenu.menu();

        PrintAccount printAccount = new PrintAccount(list);
        printAccount.print();

    }
}
