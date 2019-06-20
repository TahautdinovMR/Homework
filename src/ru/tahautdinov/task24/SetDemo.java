package ru.tahautdinov.task24;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    public Set<String> set;


    public SetDemo() {
       set = new LinkedHashSet<String>();

    }

    public void addSet(String a){
        this.set.add(a);
    }

    public Set<String> removeEvenLength(){

        Iterator iterator = this.set.iterator();
        String a;
        while (iterator.hasNext()) {
            a = (iterator.next()).toString();
            if(a.length() % 2 == 0){
                iterator.remove();
            }



        }
        System.out.println(set);
        return this.set;
    }
}
