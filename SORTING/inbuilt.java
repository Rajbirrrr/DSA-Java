import java.util.Arrays;
import java.util.Collections;
class inbuilt{
    public static void main(String args[]){
        Integer arr[]= {2,4,3,1,6,1,8};

        //sort function sorts the array inplace it do not return anything
        Arrays.sort(arr);

        //sorts array in parts
        Arrays.sort(arr,0,3);

        //decending but works only on non-primitive datatype
        Arrays.sort(arr,Collections.reverseOrder());


        System.out.println(Arrays.toString(arr));
        
    }
}