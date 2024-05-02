
package com.mycompany.methodoveriding;


public class Test {
    
    public static void main(String[] args) {
        
       Teacher t1= new Teacher();
        
        t1.name= "Md Jahidul Islam";
        t1.age= 24;
        t1.quleification= "CS";
        
        t1.DisInfo();
        
        Person t2= new Person();
        
        t2.name= "Anis";
        t2.age= 25;
        //t2.quleification= "CSE";
        
        t2.DisInfo();
    }
    
}
