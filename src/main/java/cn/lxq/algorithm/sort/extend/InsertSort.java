package cn.lxq.algorithm.sort.extend;

import cn.lxq.algorithm.sort.BaseSort;

/**
 * Created by luxinqiang on 2017/4/27.
 */
public class InsertSort extends BaseSort {

	@Override
	public void sort(int[] a) {
		int key = 0;
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

}
