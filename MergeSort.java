public class MergeSort implements SortingAlgorithm{
	public void sort(int [] arr){
		int n = arr.length;
		mergeSort(arr, n);
	}

	public static void mergeSort(int[] arr, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] arr1 = new int[mid];
		int[] arr2 = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			arr1[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			arr2[i - mid] = arr[i];
		}
		mergeSort(arr1, mid);
		mergeSort(arr2, n - mid);

		merge(arr, arr1, arr2, mid, n - mid);
	}

	public static void merge(int[] arr, int[] arr1, int[] arr2, int left, int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (arr1[i] <= arr2[j]) {
				arr[k++] = arr1[i++];
			}
			else {
				arr[k++] = arr2[j++];
			}
		}
		while (i < left) {
			arr[k++] = arr1[i++];
		}
		while (j < right) {
			arr[k++] = arr2[j++];
		}
	}
}