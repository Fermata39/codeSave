package input;

import category.Category;
import category.NewCategory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InputAccount {
    String categoryType;
    int money;
    Date date;
    String useAccountType;
    String description;
    Category category;
    NewCategory newCategory;
    ArrayList<InputAccount> list;
    InputAccount inputAccount;

    public InputAccount() {
        list = new ArrayList<>();
        category = new Category();
    }

    public InputAccount inputContents() {
        Scanner sc = new Scanner(System.in);

        inputAccount = new InputAccount();
        inputAccount.setDate();

        System.out.print("Input Category: ");
        inputAccount.setCategory(categoryType = sc.next());
        System.out.print("Input money: ");
        inputAccount.setMoney(money = sc.nextInt());
//        System.out.print("Input useAccountType: ");
//        inputAccount.setUseAccountType(useAccountType = sc.next());
//        System.out.println("Input desciption: ");
//        inputAccount.setDescription(description = sc.next());

        return inputAccount;
    }


    public String getCategory() {
        return categoryType;
    }

    public void setCategory(String categoryType) {
        if(!category.IsExsitCategory(categoryType)){
            System.out.println("Create New Category");
            newCategory = new NewCategory();
            newCategory.setCategory(categoryType);
            this.categoryType = newCategory.getCategory();

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
