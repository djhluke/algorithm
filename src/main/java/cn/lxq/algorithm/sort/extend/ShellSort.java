package cn.lxq.algorithm.sort.extend;

import cn.lxq.algorithm.sort.BaseSort;

/**
 * Created by luxinqiang on 2017/7/11.
 * 希尔排序 - 不稳定
 */
public class ShellSort extends BaseSort {

    @Override
    public void sort(int[] a) {
        int dk = a.length / 2;
        while (dk >= 1) {
            for (int i = 0; i < dk; i++) {
                for (int j = dk + i; j < a.length; j += dk) {
                    int key = a[j];
                    int k = j - dk;
                    while (k >= 0 && key < a[k]) {
                        a[k + dk] = a[k];
                        k -= dk;
                    }
                    a[k + dk] = key;
                }
            }
            dk /= 2;
        }
    }

}
