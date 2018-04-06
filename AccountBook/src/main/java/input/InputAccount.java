package input;

import category.Category;
import category.NewCategory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputAccount {
    private String categoryType;
    private int money;
    private Date date;
    private String useAccountType;
    private String description;
    private Category category;

    public InputAccount() {
//        list = new ArrayList<>();
        category = new Category();
    }

    public InputAccount inputContents() {
        Scanner sc = new Scanner(System.in);

        InputAccount inputAccount = new InputAccount();
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

    private void setCategory(String categoryType) {
        NewCategory newCategory;

        if (!category.IsExsitCategory(categoryType)) {
            System.out.println("Create New Category");
            newCategory = new NewCategory();
            newCategory.setCategory(categoryType);
            this.categoryType = newCategory.getCategory();

        } else {
            this.categoryType = categoryType;
        }
    }

    public int getMoney() {
        return money;
    }

    private void setMoney(int money) {
        this.money = money;
    }

    public String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    private void setDate() {
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
