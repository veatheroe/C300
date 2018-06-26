package oe.stu.june;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/6/26.
 */


class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point [x=" + x + ", y=" + y + "]";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Point){
            if((((Point) obj).x == this.x)  && ((Point) obj).y == this.y){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Integer.parseInt(x + "" + y);
    }
}
public class CollectionTest {

    @org.junit.Test
    public void testIterator(){
        List<Integer> list = new LinkedList();
        list.add(100);
        list.add(50);
        list.add(40);
        list.add(500);
        list.add(200);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void testSet(){
        Set<Double> set = new HashSet<Double>();
        for(int i=0; i < 10; i++)
            set.add(Math.random() *100);
        double maxValue = -Double.MAX_VALUE;
        double minValue = Double.MAX_VALUE;
        for(Double value : set){
            if (value > maxValue)
                maxValue = value;
            if (value < minValue)
                minValue = value;
            System.out.print(value + ", ");
        }
        System.out.println("\\n" + "max: " + maxValue +" min: " + minValue);

    }

    @Test
    public void testArrayList() {
        List list = new ArrayList(); // 有序可重复
        list.add(200);
        list.add(new Integer(200));
        list.add("abc");
        list.add("xxx");
        list.add("abc"); // 500, 200, 200, abc, xxx, abc
        list.add(0, 500); // 非末端插入
        list.set(0, 5000); // 替换
        System.out.println(list);
        list.remove(Integer.valueOf(200)); // 当成下标来用
        list.remove(list.size() - 1);
        System.out.println(list);//[5000, 200, abc, xxx]
        Object object = list.get(2); // 获取下标为2的元素
        System.out.println(object);
        // List集合遍历
        System.out.println("-------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------------------");
        for (Object obj : list) {
            System.out.println(obj);
        }

    }

    @Test
    public void testContainsFunction(){
        List list = new ArrayList();
        list.add("String");
        System.out.println("String" + list.contains("String"));
        list.removeAll(list);
        list.add(10);
        System.out.println("Integer" + list.contains(10));
        Set set = new HashSet();
        set.add("String");
        System.out.println(set.add("Sting"));
    }

    @Test
    public void testShuffleReverseSort(){
        List<Double> list = new ArrayList<Double>();
        for(int i=0; i < 10; i++)
            list.add(Math.random() *100);

        //sort first
        Collections.sort(list);
        //shuffle then 混匀
//        Collections.shuffle(list);
        //reverse 翻转
        Collections.reverse(list);
        System.out.println(list);
    }
    @Test
    public void testLinkedHashMapIteration(){
        Map<String, Integer> linkedHashMap= new LinkedHashMap();
        linkedHashMap.put("key1", 1);
        linkedHashMap.put("key2", 2);
        linkedHashMap.put("key3", 3);
        linkedHashMap.put("key4", 4);
        linkedHashMap.put("key5", 5);
        linkedHashMap.put("key6", 6);
        Iterator iterator = linkedHashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

    }

    @Test
    public void testHashMethodofHashMap(){
        String str1 = "string1";
        String str2 = "string1";
        int h;
        h = (h = str1.hashCode()) ^ (h >>> 16);
        System.out.println(h);
        h = (h = str2.hashCode()) ^ (h >>> 16);
        System.out.println(h);
    }
}
