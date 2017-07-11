package cn.lxq.algorithm.sort.extend;

import cn.lxq.algorithm.sort.BaseSort;

/**
 * Created by luxinqiang on 2017/4/27.
 * 直接插入排序 - 稳定
 */
public class StraightInsertSort extends BaseSort {

	@Override
	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

}
