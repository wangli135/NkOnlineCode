package com.xingfeng.exer1.string;

/**
 * 请把纸条竖着放在桌⼦上，然后从纸条的下边向上⽅对折，压出折痕后再展 开。此时有1条折痕，突起的⽅向指向纸条的背⾯，这条折痕叫做“下”折痕 ；突起的⽅向指向纸条正⾯的折痕叫做“上”折痕。如果每次都从下边向上⽅ 对折，对折N次。请从上到下计算出所有折痕的⽅向。
 给定折的次数n,请返回从上到下的折痕的数组，若为下折痕则对应元素为"down",若为上折痕则为"up".
 测试样例：
 1
 返回：["down"]
 * Created by Xingfeng on 2016/3/30.
 */
public class FoldPaper {

    public String[] foldPaper(int n) {

        int N=(1<<n)-1;
        String[] result=new String[N];

        if(n==1){
            result[0]="down";
        }else{

            String[] left=foldPaper(n-1);
            System.arraycopy(left,0,result,0,left.length);
            result[N/2]="down";
            for(int i=N-1;i>N/2;i--){

                if(result[N-1-i].equals("down")){
                    result[i]="up";
                }else
                    result[i]="down";

            }

        }


        return result;

    }


    public static void main(String[] args) {

        FoldPaper foldPaper=new FoldPaper();
        String[] results=foldPaper.foldPaper(4);
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i<results.length;i++){
            sb.append(results[i]+",");
        }
        sb.deleteCharAt(sb.length()-1).append("]");
        System.out.println(sb);
    }


}
