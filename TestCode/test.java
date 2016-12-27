

public class test{
  public static void main(String[] args) {
      System.out.println("Hello world");

      for(int i=0; i< 10; i++){
        if(i == 4){
            System.out.println("Hello world2");
            if(i==4){
                System.out.println("Hello world2-1");
                return ;
            }
        }
      }

      System.out.println("Hello world3");

  }
}
