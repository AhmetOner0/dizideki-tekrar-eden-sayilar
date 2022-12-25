package patikadev;
import java.util.Arrays;
public class ArrayTekrarEdenSayi {

   /* static boolean isFind(int [] arr,int val){
        for (int i:arr){
            if (i == val){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {


        int[] list = {1, 5, 9, 9, 8, 9, 1, 15, 5};
        int[] duplicate = new int[list.length];
        int startIndex = 0;



        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                   if (!isFind(duplicate,list[i])){
                       duplicate[startIndex++]=list[i];
                       break;
                   }
                }
            }
        }
        for (int i:duplicate){
            if (i != 0){
                System.out.println(i);
            }
        }
    }
}*/

    static boolean isFind(int[]arr,int val){
        for (int i:arr){
            if (i == val){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={1,15,25,15,20,1,2,1,1,20,2,2};
        int[] duplicate= new int[list.length];
        int startIndex=0;

        for (int i=0;i< list.length;i++){
            for (int j=0;j< list.length;j++){

               if ((i != j) && (list[i] == list[j])){
                   if (!isFind(duplicate,list[i])){
                       duplicate[startIndex++]=list[i];
                       if (list[i] % 2 ==0){
                           System.out.println(list[i]);
                           break;
                       }
                   }
               }
            }
        }
    }
}

