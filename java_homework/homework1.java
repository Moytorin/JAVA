package java_homework;

import java.util.Random;
// point 1
public class homework1 {
    public static void main(String[] args) {
        
        int[] ints = new int[4];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(2000);
            System.out.print("[" + ints[i] + "]");
            
        }
        // point 2
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] > max) {
                max = ints[i];
            }
        }
        System.out.println("max= " + max);
        // point 3
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] %2 != 0) {
                System.out.print("Четные = " + ints[i] + " ");
            }
        }
        // ints.MIN_VALUE();
        // ints.MAX_VALUE();
// 3 point
    
        
        
    }
    


public static void MIN_VALUE(int[] array){
    int[] arr = new int[4];
    int min = array[0];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(100);
        if(array[i] < min) {
            System.out.println(min);
        }
    }
}

// point 4
public static void MAX_VALUE(int[] arrays){
    int[] arrs = new int[4];
    int max = arrs[0];
    Random random = new Random();
    for (int i = 0; i < arrs.length; i++) {
        arrs[i] = random.nextInt(100);
        if(arrs[i] > max) {
            System.out.println(max);
        }
    }
}
}
