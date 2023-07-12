public class MyClass {
    public static void main(String args[]) {
      int e = 25;
      int r = 0;  
        System.out.print(maxi(dlina(e),dlina(r)));
    } 
static int maxi(int a, int b ) 
{
if (a > b ) return a; else return b;    
}
static int dlina(int s)
{
    String r = "";
    r = r + s ;
    return r.length();
}
}