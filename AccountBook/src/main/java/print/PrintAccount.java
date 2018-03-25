package print;

import input.InputAccount;

import java.util.List;

public class PrintAccount {
    List<InputAccount> accountInfo;

    public PrintAccount(List<InputAccount> accountInfo) {
        this.accountInfo = accountInfo;
    }

    public void printCurrntInfo() {
        System.out.println("account Info");

        for (int i = 0; i < accountInfo.size(); i++) {
            System.out.println(
                    accountInfo.get(i).getDate() + " / "
                            + accountInfo.get(i).getCategory() + " / "
                            + accountInfo.get(i).getMoney() + " / "
                            + accountInfo.get(i).getUseAccountType() + " / "
                            + accountInfo.get(i).getDescription());
        }
    }

    public void printFileInfo() {

    }

    public void printCvsInfo() {

    }
}
