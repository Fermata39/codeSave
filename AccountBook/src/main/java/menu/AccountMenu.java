package menu;

import input.InputAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMenu {
    private List<InputAccount> accountinfo;

    public AccountMenu() {
        accountinfo = new ArrayList<>();
    }

    public List<InputAccount> menu() {

        // file read
        if (accountinfo.size() != 0) {
            //file read
            System.out.println("account size is not null");
        } else {

            Scanner sc = new Scanner(System.in);
            int end;

            while (true) {
                System.out.println("종료를 원하시면 0을 입력하세요: ");

                try {
                    end = sc.nextInt();

                } catch (Exception e) {
                    System.out.println("잘못 입력하셨습니다");
                    sc.nextLine();
                    continue;
                }

                if (end != 0) {
                    accountinfo.add(new InputAccount().inputContents());
                } else {
                    // file save
                    break;
                }
            }
        }
        return accountinfo;
    }
}
