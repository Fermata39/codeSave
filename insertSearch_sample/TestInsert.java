import java.util.*;

public class TestInsert{
    public static void main(String[] args){
        //System.out.println("test");
        int[] arry = {3,1,2,4,5};

        insert_func(arry);
    }

    public static void insert_func(int[] data){
        int[] newArry = new int[5];    
           
        int key;

        for(int i=1; i<data.length; i++){
            key = data[i];
            for(int j=i-1;j<data.length; j++){
               if(key < data[i-1]){
                   newArry[j] = key;
               }else{
                   if(key == data[i-1]){
                       System.out.println("key equal");
                        break;
                   }
               }

               System.out.println("sub loop end " + key + "/" + data[i-1] );

            }
        }

        System.out.println("sort res: "+Arrays.toString(newArry));

    }
}

