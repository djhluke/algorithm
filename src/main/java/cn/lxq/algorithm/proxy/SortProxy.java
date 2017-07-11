package cn.lxq.algorithm.proxy;

import cn.lxq.algorithm.sort.Sort;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by luxinqiang on 2017/4/27.
 */
public class SortProxy {

    // 代理目标
    private Sort sort;

    public SortProxy(Sort sort) {
        this.sort = sort;
    }

    // 生成代理对象
    public Sort createProxy() {

        InvocationHandler handler = new InvocationHandler() {

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 运行方法前
                Long startTime = System.currentTimeMillis();
                // 设置方法访问权限
                method.setAccessible(true);
                // 运行方法
                method.invoke(sort, args);
                // 运行方法后
                Long endTime = System.currentTimeMillis();
                System.out.println(sort.getClass().getName() + ": " + (endTime - startTime) + "ms");
                return null;
            }
        };

        return (Sort) Proxy.newProxyInstance(sort.getClass().getClassLoader(), new Class[] { Sort.class }, handler);

    }

}
