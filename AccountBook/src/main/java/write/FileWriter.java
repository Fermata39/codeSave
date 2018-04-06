package write;

import input.InputAccount;

import java.io.IOException;
import java.util.List;

public class FileWriter implements Writer {


    @Override
    public void write(List<InputAccount> list) {
        java.io.FileWriter fileOutputStream = null;

        try {
            fileOutputStream = new java.io.FileWriter("/Users/shinkook_mac/Documents/temp/Account.txt");
            for (InputAccount inputAccount : list) {
                String contents = inputAccount.getDate() +
                        " / " + inputAccount.getUseAccountType() +
                        " / " + inputAccount.getCategory() +
                        " / " + inputAccount.getMoney();

                fileOutputStream.write(contents);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}
