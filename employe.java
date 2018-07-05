package com.example.android.classwork;

import android.util.Log;

public class employe {
    String Name;
    int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public void countSalary ()
    {
        Log.i("employe", "countSalary:3000 ");
    }
    public void countSalary (int salary)
    {
        Log.i("employe", "countSalary:3000 "+salary);
    }
   //overloading is the same method with diffent parameter
    //parents
}
