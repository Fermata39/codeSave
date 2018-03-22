package input;

import category.Category;
import category.NewCategory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputAccount {
    String categoryType;
    int money;
    Date date;
    String useAccountType;
    String description;
    Category category;

    public InputAccount() {
        category = new Category();
    }

    public void inputContents() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Category: ");
        setCategory(categoryType = sc.next());
        System.out.print("Input money: ");
        setMoney(money = sc.nextInt());

    }


    public String getCategory() {
        return categoryType;
    }

    public void setCategory(String categoryType) {
        if(!category.IsExsitCategory(categoryType)){
            NewCategory newCategory = new NewCategory();
            newCategory.setCategory(categoryType);
        }else{
            this.categoryType = categoryType;
        }
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
