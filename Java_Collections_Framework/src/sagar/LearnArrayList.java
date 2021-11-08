package sagar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        /*
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Sagar");
        System.out.println(studentName);

        */


        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(6);
        System.out.println(list);

        list.add(2, 3);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(0));*/

        List<Integer> list = new ArrayList<>();


//        System.out.println(list);

        /*list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(30));
        System.out.println(list);

        list.clear();
        System.out.println(list);*/

        /*list.set(2, 1000);
        System.out.println(list);

        System.out.println(list.contains(500));*/


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is "+list.get(i));
        }

        for (Integer i: list) {
            System.out.println("foreach element is "+ i);
        }

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println("iterator "+ it.next());
        }
    }
}
