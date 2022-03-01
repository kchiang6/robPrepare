import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         
         Set<Integer> set = new HashSet<>();
         
         addBlock(2, set);
         addBlock(5, set);
         check(5, 2, set);
         check(6, 3, set);
         check(2, 1, set);
         check(3, 2, set);
     }
     
     public static void addBlock(int block, Set<Integer> set) {
         if (!set.contains(block)) {
             set.add(block);
         }
     }
     
     public static void check(int num, int size, Set<Integer> set) {
         int count = 0;
         
         for (int i = num - size; i < num; i++) {
             if (!set.contains(i)) {
                 count++;
             }
         }
         if (count < size) {
             System.out.println("can't add this block");
         } else {
             System.out.println("okay to put");
         }
     }
}
