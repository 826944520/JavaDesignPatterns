package com.enjoy.dp.Iterator.example8;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example8Test {
    @Test
    public void example8Test() {
        //访问新收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        //先计算再获取
        salaryManager.calcSalary();
        //得到翻页迭代器
        AggregationIterator it = salaryManager.createIterator();

        //获取第一页，每页显示2条
        Collection col = it.next(2);
        System.out.println("第一页数据：");
        print(col);
        //获取第二页，每页显示2条
        Collection col2 = it.next(2);
        System.out.println("第二页数据：");
        print(col2);
        //向前一页，也就是再次获取第二页
        Collection col3 = it.previous(2);
        System.out.println("再次获取第二页数据：");
        print(col3);
    }
    private static void print(Collection col){
        Iterator it = col.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
