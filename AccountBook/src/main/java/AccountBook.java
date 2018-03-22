import category.Category;
import category.NewCategory;
import input.InputAccount;


public class AccountBook {
    public static void main(String[] args) {
//        Category category = new Category();
//        NewCategory newCategory;
//
//        boolean isCategory = category.IsExsitCategory("Food");
//
//        if (!isCategory) {
//            newCategory = new NewCategory();
//            newCategory.setCategory("etc");
//
//        } else {
//            System.out.println(isCategory);
//        }

        InputAccount inputAccount = new InputAccount();

        inputAccount.inputContents();
    }
}
