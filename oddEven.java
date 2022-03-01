public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        int[] nums = new int[]{-1, 4, 3, -2};
        
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even += nums[i];
            } else {
                odd += nums[i];
            }
        }
        
        if (even == odd) {
            System.out.println("equal");
        } else if (even > odd) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
     }
}
