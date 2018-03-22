package input;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputAccount {
    String category;
    int money;
    Date date;
    String useAccountType;
    String description;

    public void inputContents() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Category: ");
        setCategory(sc.next());
        System.out.print("Input money: ");

    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    public void setDate() {
        date = new Date();
    }

    public String getUseAccountType() {
        return useAccountType;
    }

    public void setUseAccountType(String useAccountType) {
        this.useAccountType = useAccountType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
