// pormophism using inheritance
// pormophism can work only for the class which inherit from the parent class

class A{
    public void show(){
        System.out.println("this is my first chance");
    }
}

class B extends A{
    public void show(){
        System.out.println("this is my second chance");
    } 
}

class C extends A{
    public void show(){
        System.out.println("this is my third chance");
    } 
}
public class Pormo {
  public static void main(String[] args){
    A obj = new A();
    obj.show();
    obj=new B();
    obj.show();
    obj=new C();
    obj.show();
  }  
}
