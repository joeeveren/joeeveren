import VolMath.VMath;
import java.util.Scanner;
public class Test {

  public static void main(String[] args){
    
        Scanner in = new Scanner(System.in); 
        double r = in.nextDouble();
        double h = in.nextDouble();
        System.out.println(VMath.volume(r,h));
  }
}
 