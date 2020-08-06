package com.archer.mybatis.effective;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * todo
 * </pre>
 * <p>
 * <pre>
 * --------------------------History--------------------------------
 * DATE              AUTHOR            VERSION        DESCRIPTION
 * 2020/8/5   wenbb1@meicloud.com      V1.0.0          新建
 * </pre>
 */
public class TimeTest {

    private static Stopwatch stopwatch = Stopwatch.createUnstarted();

    public static void main(String[] args) {

        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("-Xmx 最大分配内存 "+(maxMemory/(double)1024/1024)+"MB");
        System.out.println("-Xms 初始分配内存 "+(totalMemory/(double)1024/1024)+"MB");
        int[] ints = new int[Integer.MAX_VALUE/4];
        stopwatch.start();
        for (int i : ints) {
            int anInt = i;
        }
        long elapsed = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println(elapsed);
        int i = 0;

        stopwatch.reset().start();
        System.out.println(stopwatch.elapsed(TimeUnit.MICROSECONDS));
        try {
            while(true) {
                int anInt = ints[i];
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        System.out.println(stopwatch.elapsed(TimeUnit.MICROSECONDS));

    }

}
