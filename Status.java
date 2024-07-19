
enum Stat{
    Running,Failed,Success,Shiortlist,rijected
}
public class Status {
    public static void main(String[] args){
    Stat ss[] = Stat.values();
     for(Stat s: ss){
        System.out.println(s);
 
     }
     Stat sss = Stat.Failed;
    //  enum using if else

    //  if(sss==Stat.Running){
    //    System.out.println("All good");
    //  }
    //  else if(sss==Stat.Failed){
    //   }
    //   else{
    //     System.out.println("indeed");

    //   }
    // enum using switch
    switch(sss){
        case Running:
            System.out.println("all the best");
            break;
        case Failed:
            System.out.println("try your best");
            break;
        default:
            System.out.println("exxluded");
            break;
        
    }
    }
}
