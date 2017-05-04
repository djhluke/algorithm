package cn.lxq.algorithm.sort;

/**
 * Created by luxinqiang on 2017/4/27.
 */
public abstract class BaseSort implements Sort {

	protected void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
