// accesing variables from private keyword:hidding data using private

class Human{
    // if we need to add values after without initializing we can use set and get method 
    // to access thos priate data
    // set method for setting data
    // get for getting data
   private int age;
   private String name;

//    public void setName(String newName){
//     name = newName;
//    }
   
//    public void setAge(int newAge){
//     age = newAge;
//    }
//    public String getName(){
//     return name;
//    }
//   public int getAge(){
//     return age;
//   }

//    here used this keyword
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

   
}
public class Demo {
public static void main(String[] args) {
 Human obj = new Human();
 obj.setName("Karine");
 obj.setAge(19);
 String myName = obj.getName();
 int myAge = obj.getAge();
 System.out.println(myName + ":"+ myAge);

} 
}
