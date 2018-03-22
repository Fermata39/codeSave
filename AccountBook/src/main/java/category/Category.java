package category;

public class Category {

    public boolean IsExsitCategory(String category_info) {
        try {
            System.out.println("Category Info: " + category_info);
            CategoryTable.valueOf(category_info);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
