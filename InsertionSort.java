public class InsertionSort implements SortingAlgorithm{
	public void sort(int [] arr){
		int temp;
		int j;
		for(int i = 1; i < arr.length; i++){
			temp = arr[i];
			j = i-1;
			while((j>=0) && (arr[j]>temp)){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
	}
}