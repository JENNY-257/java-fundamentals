public class Loops {
    public static void main(String[] args){
        int i = 1;
        while(i<=5){
            System.out.println("Hi " + i);
            // int j =1;
            // while(j<=3){
            // System.out.println("hello " + j );
            // j++;
            // }
            i++;
        }
        // do while loop
        int j=0;
        do{
            System.out.println("hello " + j);
            j++;
        }while(j<6);

        // using for loop to print currender in each day from monday to frinday

        for(int m=1;m<=5;m++){
            System.out.println("Day" + m);
            for(int n=1;n<=9; n++){
                System.out.println((n+8)+" - " +(n+9) + "am");
            }
        }
    }
}
