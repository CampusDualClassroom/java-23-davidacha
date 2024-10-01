package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> m=new HashMap<>();
        Person p1=new Person("John","Smith");
        Person p2=new Teacher("María","Montessori","Educación");
        Person p3=new PoliceOfficer("Jake","Peralta","B-99");
        Person p4=new Doctor("Gregory","House","Nefrología e infectología");
        m.put("person",p1);
        m.put("teacher",p2);
        m.put("police",p3);
        m.put("doctor",p4);
        return m;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key,value);
        return map.get(key);
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.print("Clave: " + entry.getKey() + ", Valor: ");
            entry.getValue().getDetails();
        }
    }
    
}
