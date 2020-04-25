import java.util.*;
public class Switchcase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Pick one. 1.Hi\t 2.Hey\t 3.hello\t");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("you said hi");
            break;
            case 2:System.out.println("you said hey");
            break;
            case 3:
                System.out.println("you said hello ");
                break;
            default:
                System.out.println("invalid choice");
                
        }
    }
    
}
