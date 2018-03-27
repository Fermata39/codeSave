package write;

import input.InputAccount;

import java.io.FileOutputStream;
import java.util.List;

public class FileWriter implements Writer {
    @Override
    public void write(List<InputAccount> list) {
        try {
            java.io.FileWriter fileOutputStream = new java.io.FileWriter("/Users/shinkook_mac/Documents/temp/Account.txt");

            for (int i = 0; i < list.size(); i++) {
                String contents = list.get(i).getDate()
                        + " / " + list.get(i).getUseAccountType()
                        + " / " + list.get(i).getCategory()
                        + " / " + list.get(i).getMoney();
                fileOutputStream.write(contents);
            }

            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
