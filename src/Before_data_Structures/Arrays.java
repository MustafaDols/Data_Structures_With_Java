package Before_data_Structures;

public class Arrays {
    public static void main(String[]args){
//        int [] arr = new int [5];
//        arr [0] =1;
//        System.out.println(arr[0]);
//        int arr1 [] ={1,2,3};
//        System.out.println(arr1[1]);
//        int temp = arr1[0];
//        arr1 [1] =arr1[2];
//        arr1[2]=temp;
//        System.out.println(arr1[2]);
////
//        int grades [] = new int[5];
//        for (int i=0 ; i<grades.length ; i++){
//            grades [i] = i*2;
//        }
//        System.out.println(grades[3]);

//        print array elements
//        int[] arr2 = {10,20,30,40,50};
//        for (int i=0 ; i<arr2.length ; i++){
//            System.out.println(arr2[i]);
//
//        }
//        sum
//        int sum=0;
//        int[] arr3 = {10,20,30,40,50};
//        for (int i=0 ; i<arr3.length ; i++){
//            sum+=arr3[i];
//
//        }
//        System.out.println(sum);
        int[] abc = {5,3,6,5,7,8,5};
        int x=5;
        int count=0;
        for (int i =0;i<abc.length;i++) {
            if (abc[i] == x){
                count++;
            }
        }
        System.out.println("the element 5 repeted " + count +" times");
    }

}
