package cn.lxq.algorithm.sort;

/**
 * Created by luxinqiang on 2017/4/27.
 */
import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import cn.lxq.algorithm.proxy.SortProxy;
import cn.lxq.algorithm.sort.Sort;
import cn.lxq.algorithm.sort.extend.*;

public class SortTest {

    int[] a = new int[10000];

    @Before
    public void before() {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100000);
        }
    }

    @Test
    public void bubbleSort() {
        Sort sort = new BubbleSort();
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void selectSort() {
        Sort sort = new SelectSort();
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void insertSort() {
        Sort sort = new InsertSort();
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void quickSort() {
        Sort sort = new QuickSort();
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void takeTime() {
        sortTime(BubbleSort.class);
        sortTime(SelectSort.class);
        sortTime(InsertSort.class);
        sortTime(QuickSort.class);
    }

    public void sortTime(Class<?> clazz) {
        Sort sort = null;
        try {
            sort = (Sort) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        SortProxy sortProxy = new SortProxy(sort);
        Sort proxy = (Sort) sortProxy.createProxy();
        proxy.sort(Arrays.copyOf(a, a.length));
    }

}
