package menu;

import com.sun.deploy.association.utility.AppAssociationWriterFactory;
import factory.WriterFactory;
import input.InputAccount;
import write.CvsWriter;
import write.FileWriter;

import java.io.Writer;
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
            WriterFactory writerFactory = new WriterFactory();
            switch (sc.nextInt()) {
                case 0:
                    FileWriter fileWriter = (FileWriter) writerFactory.createFactory("write.FileWriter");
                    fileWriter.write(accountinfo);
                    break;

                case 1:
                    CvsWriter cvsWriter = (CvsWriter) writerFactory.createFactory("write.CvsWriter");
                    break;

            }

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
