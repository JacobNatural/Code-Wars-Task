// TASK CODEWARS
// https://www.codewars.com/kata/5b0a80ce84a30f4762000069/train/java
package pl.jakubmarjankowski.codewars.FIXMEHello;

import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {
    String name;
    int age;
    char sex;
    String order = "";

    public Dinglemouse() {

    }
    public Dinglemouse setName(String name){
        this.name = name;
        order += "name ";
        return this;
    }
    public Dinglemouse setAge(int age){
        this.age = age;
        order += "age ";
        return this;
    }

    public String hello(){
        String[] arr = order.trim().split(" ");
        List<String> orderOfMethod = new ArrayList<>();

        for(String s : arr){
            if(!orderOfMethod.contains(s)) orderOfMethod.add(s);
        }

        String result = "Hello. ";

        for(String s : orderOfMethod) {
            switch (s) {
                case "name":
                    result += "My name is " + name + ". ";
                    break;
                case "age":
                    result += "I am " + age + ". ";
                    break;
                case "sex":
                    result += "I am ";
                    if (sex == 'M') {
                        result += "male. ";
                    } else {
                        result += "female. ";
                    }
            }
        }
        return result.trim();
    }

    public Dinglemouse setSex(char sex){
        this.sex = sex;
        order += "sex ";
        return this;
    }
}
