package com.zxp.algorithm;

public class BubbleSort {
	public static void main(String[] args){
		
		int[] array={100,120,1,2,48,26};
		BubbleSort arraySort=new BubbleSort();
		arraySort.sort(array);
	}
	public void sort(int[] array){
		for(int i=1;i<array.length;i++){			
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		showArray(array);
	}
	public void showArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]+"");
		}
	}
}
