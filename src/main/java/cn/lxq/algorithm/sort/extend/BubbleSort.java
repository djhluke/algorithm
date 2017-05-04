package cn.lxq.algorithm.sort.extend;

import cn.lxq.algorithm.sort.BaseSort;

/**
 * Created by luxinqiang on 2017/4/27.
 */
public class BubbleSort extends BaseSort {

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

}
