package ArrayList;

import java.util.ArrayList;

public class ArrayList_Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        //创建ArrayList集合String类型对象

        arr.add("a");
        arr.add("b");
        arr.add("c");
        //添加元素

        arr.add(3,"d");
        //在集合指定序号内添加新元素

        System.out.println(arr);
        //输出打印

    }
}
