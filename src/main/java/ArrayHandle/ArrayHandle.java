package ArrayHandle;

public class ArrayHandle {
    //对两个数组进行冒泡排序
    public Integer[] arraySort(Integer[] array){
        Integer i,j,temp,sorted;

        for (i=0;i<array.length;i++){

            sorted = 0;
            for (j=0;j<array.length-i-1;j++){
                if (array[j] > array[j+1]){
                    sorted = 1;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (sorted == 0) break;
        }
        return array;
    }
}
