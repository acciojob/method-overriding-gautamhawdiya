package com.driver;
class A{
    public String meth(){
        String s = "Invoking method from class A";
        return s;
    }
}
class B exrends A{
    public String meth(){
        String s =  "Method is overridden in Extended class B";
        return s;
    }
}
public class Main {
   public static void main(String[] args){
       B b = new B();
       b.meth();
   }
}
