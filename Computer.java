class Feature{
    public void playGame(){
        System.out.println("playing music ...");
    }

    public String getPen(int amount){
        if(amount>200){
            return "Pen";
        }
        else{
            return "nothing";
        }
    }
    // method overloading

    public int add(int n1, int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2 +n3;
    }
    public int add(int n1, int n2,int n3, int n4){
        return n1+n2+n3+n4;
    }
}
public class Computer {
    public static void main(String[] args){
     Feature obj = new Feature();
     System.out.println(obj.getPen(600));
     obj.playGame();
     System.out.println(obj.add(2,3,4,9));
    }
}
