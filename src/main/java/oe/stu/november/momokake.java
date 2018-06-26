package oe.stu.november;

/**
 * @Author： oe
 * @Description:how many persica did the fifth monkey got
 * @Created by oe on 2017/11/5.
 */
public class momokake {
    public static void main(String[] args){
        for(int i =3121;i<100000;i++){
            if(reCount(i,5)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean reCount(int count,int c){
        if(c==1 && (count-1)/5%1 ==0) {
            System.out.println((count - 1) / 5);
            return true;
        }
        else if (c>1 && (count-1)%5!=0)
            return false;
        else if(c>1 && (count-1)%5==0)
            return reCount((count-1)*4/5, c-1);
        else
            return false;
    }
}
