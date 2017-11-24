package oe.stu.november;

/**
 * @Author： oe
 * @Description:重叠构造器，
 * @Created by oe on 2017/11/21.
 */
public class TelescopingConstructor {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;

    private static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;

        public Builder(int servings,int servingSize){
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int val){calories = val; return  this;}
        public Builder fat(int val){fat = val; return  this;}
        public TelescopingConstructor build(){
            return new TelescopingConstructor(this);
        }


    }

    private TelescopingConstructor(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;

    }

    public static void main(String args[]){
        TelescopingConstructor tc = new TelescopingConstructor.
                Builder(1,2).calories(1).fat(1).build();
        TelescopingConstructor t = new Builder(1,2).build();
    }
}
