import java.util.ArrayList;

public class GenericTest{
    public static void main(String[] args){
        //collection 객체 생성 
        ArrayList<Product> list = new ArrayList<Product>(); 
        //list 에 객체 넣음 
        list.add(new Product());
        list.add(new smartPhone());
        list.add(new audio());
        
        //객체 출력 
        printObject(list);
    }
    
    // 다형성 generic 사용 ? 를 이용 해서 product class 상속 객체는 축력이 가능하도록!
    public static void printObject(ArrayList<? extends Product> list){
        for(Product p : list){
            System.out.println(p.toString());
        }

    }

}

class Product{
}
class smartPhone extends Product{
}
class audio extends Product{
}

