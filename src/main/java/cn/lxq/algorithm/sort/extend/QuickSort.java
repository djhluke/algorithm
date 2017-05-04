package cn.lxq.algorithm.sort.extend;

import cn.lxq.algorithm.sort.BaseSort;

/**
 * Created by luxinqiang on 2017/4/27.
 */
public class QuickSort extends BaseSort {

	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	private void quickSort(int[] a, int begin, int end) {
		if (begin >= end) {
			return;
		}
		int mid = partition(a, begin, end);
		quickSort(a, begin, mid - 1);
		quickSort(a, mid + 1, end);
	}

	private int partition(int[] a, int begin, int end) {
		int midNumber = a[begin];
		int left = begin, right = end;
		while (left < right) {
			while (a[right] >= midNumber && left < right) {
				right--;
			}
			while (a[left] <= midNumber && left < right) {
				left++;
			}
			if (left < right) {
				swap(a, left, right);
			}
		}
		swap(a, begin, left);
		return left;
	}

}
