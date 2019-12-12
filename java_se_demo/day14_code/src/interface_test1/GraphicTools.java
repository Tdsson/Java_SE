package com.tdsson.interface_test1;

public class GraphicTools {
    public static void sort(Object[] arr){
        //冒泡排序
        for(int i = 1;i<arr.length;i++){
            for (int j =0;j<arr.length-i;j++){
                CircleComparator circleComparator = new CircleComparator();
                int num = circleComparator.compare(arr[j],arr[j+1]);
                if(num > 0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
