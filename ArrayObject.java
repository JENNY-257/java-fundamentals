class Student{
    int rollNo;
    String name;
    int marks;
}
// array to store different multiple datatype of elements
public class ArrayObject {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollNo = 3;
        s1.name = "kagame";
        s1.marks = 29;

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name = "ange";
        s2.marks = 30;

        Student s3 = new Student();
        s3.rollNo = 6;
        s3.name = "shock";
        s3.marks = 50;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        // for(int i = 0; i<students.length;i++){
        //     System.out.println(
        //         students[i].name +" " + 
        //         students[i].rollNo + " " +
        //         students[i].marks);

        // }

        // let us use for each loop
        for(Student stud : students){
            System.out.println(stud.name + ":" + stud.marks);
        }

        // declaration another version of string

        String name = new String("dada🙌");
        System.out.println("Hello " + name);
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" is so amazing"));

    }
}
