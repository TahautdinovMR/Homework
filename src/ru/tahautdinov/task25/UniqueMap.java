package ru.tahautdinov.task25;

import java.util.*;

public class UniqueMap {
Map<String, String> person;
UniqueMap(){
    person = new HashMap<>();
}
    public boolean isUnique(Map<String, String> map) {
        Set<String> valueSet = new HashSet<String>(map.values());
        if (map.size() == valueSet.size())
            return true;
        else
            return false;
    }
    public void addPerson(String name, String fname) {

        person.put(name, fname);
    }
}
