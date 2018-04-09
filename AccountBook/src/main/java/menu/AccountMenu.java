package menu;

import factory.WriterFactory;
import input.InputAccount;
import write.CvsWriter;
import write.FileWriter;

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
            int selectItem;
            WriterFactory writerFactory = new WriterFactory();


            while (true) {
                System.out.println("0. 종료");
                System.out.println("1. 입력");
                System.out.println("2. File 저장");
                System.out.print("INPUT: ");

                try {
                    selectItem = sc.nextInt();

                    switch (selectItem) {
                        case 0:

                            break;
                        case 1:
                            accountinfo.add(new InputAccount().inputContents());
                            break;
                        case 2:
                            System.out.println("File Write");
                            FileWriter fileWriter = (FileWriter) writerFactory.createWriterFactory("write.FileWriter");
                            fileWriter.write(accountinfo);
                            break;

                        case 3:
                            CvsWriter cvsWriter = (CvsWriter) writerFactory.createWriterFactory("write.CvsWriter");
                            break;

                    }

                    if (selectItem == 0) {
                        break;
                    } else {
                        continue;
                    }

                } catch (Exception e) {
                    System.out.println("잘못 입력하셨습니다");
                    sc.nextLine();
                    continue;
                }
            }
        }
        return accountinfo;
    }
}
