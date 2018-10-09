package com.enjoy.dp.ChainOfResponsibility.example3;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example3Test {
    @Test
    public void example3Test() {
        //先要组装职责链
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试申请聚餐费用
        String ret1 = h3.handleFeeRequest("小李", 300);
        System.out.println("the ret1="+ret1);
        String ret2 = h3.handleFeeRequest("小李", 600);
        System.out.println("the ret2="+ret2);
        String ret3 = h3.handleFeeRequest("小李", 1200);
        System.out.println("the ret3="+ret3);

        //开始测试申请差旅费用
        h3.handlePreFeeRequest("小张", 3000);
        h3.handlePreFeeRequest("小张", 6000);
        h3.handlePreFeeRequest("小张", 32000);
    }
}