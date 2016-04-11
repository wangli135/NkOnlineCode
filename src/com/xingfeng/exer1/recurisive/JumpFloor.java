package com.xingfeng.exer1.recurisive;

/**
 *题目描述

 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * Created by Xingfeng on 2016/4/10.
 */
public class JumpFloor {

    public int JumpFloor(int target) {

       if(target<=0)
           return 0;

        if(target<=2)
            return target;

        return JumpFloor(target-2)+JumpFloor(target-1);

    }

}
