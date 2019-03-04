public class QuickSort implements SortingAlgorithm{
	public void sort(int [] arr){
		int n = arr.length;
		int low = 0, high = n-1;
		sorting(arr, low, high);
		
	}

	public void sorting(int [] arr, int low, int high){
		if (low < high){
			int pi = partition(arr, low, high);
			sorting(arr, low, pi-1);
			sorting(arr, pi+1, high);
		}
	}

	public int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low-1);
		for (int j=low; j<high; j++){
			if (arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
}