public class Main {
    public static void main(String args[]) {
        Dragon drag = new Dragon();
        System.out.println(drag.color);
        System.out.println(drag.name);
        Dragon gon = new Dragon();
        drag.level = 7;
        gon.level = drag.level;
        System.out.println("gon.level = "+gon.level);
        drag.level = 89;
        System.out.println("drag.level changed to 89,  gon.level = "+ gon.level); //
        int q = drag.level; //
        System.out.println("drag.level = 89, q ="+ q); //
        q = 90;
        System.out.println(" q changed to 90, drag.level = "+drag.level); //
        drag.level = 15 ;
        System.out.println(" drag.level changed = 15, q = "+q);
        Dragon rago = drag;
        System.out.println("initial rago = drag, rago.level = "+rago.level);
        drag.level = 115;
        System.out.println("drag.level = 115, rago.level = "+rago.level);
    }
    
}
