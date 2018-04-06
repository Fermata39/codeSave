package print;

import input.InputAccount;

import java.util.List;

public class PrintAccount {
    private List<InputAccount> accountInfo;

    public PrintAccount(List<InputAccount> accountInfo) {
        this.accountInfo = accountInfo;
    }

    public void printCurrntInfo() {
        System.out.println("account Info");

        for (InputAccount anAccountInfo : accountInfo) {
            System.out.println(
                    anAccountInfo.getDate() + " / "
                            + anAccountInfo.getCategory() + " / "
                            + anAccountInfo.getMoney() + " / "
                            + anAccountInfo.getUseAccountType() + " / "
                            + anAccountInfo.getDescription());
        }
    }

    public void printFileInfo() {

    }

    public void printCvsInfo() {

    }
}
