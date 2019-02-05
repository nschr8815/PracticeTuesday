/*
public class Merge {

	public static void main(String[] args)
	{
		
	}
	//split into groups
	public void mergeSort(int[] list, int lowIndex, int highIndex) {
		if (lowIndex == highIndex)
			return;
		else {
			int midIndex = (lowIndex + highIndex) /2;
		//The string of numbers get divided here into low and high
			//MergeSort is a method that calls itself and is Recursive
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			merge(list,lowIndex, midIndex+1,highIndex);
		}
	}
	private void merge(int[] list, int lowIndex, int i, int highIndex) {
		
		
	}
	
	
	
	
}*/


public class Merge {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {5,8,3,7,2,1,9};
        Merge mms = new Merge();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        MergeSort(0, length - 1);
    }
 
    private void MergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            MergeSort(lowerIndex, middle);
            MergeSort(middle + 1, higherIndex);
            merge(lowerIndex, middle, higherIndex);
        }
    }
 
    private void merge(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}