class Dragon {
    String name = "Bubu";  // имя дракончика по умолчанию
    int level = 0 ;        // урговень при создании , в начале он яйцо
    String color = "green";// цвет дракончика
    int boxtype = 1 ;      // вид сундука из которого можно получить яйцо дракончика
    String type = "Normal";// вид дракона: 0 - простой, 1 - мифический, 2 - легендарный и тд
    Boolean mega_egg = true;//можно ли получить при открыть мегаяйца
    int speed = 1;          //скорость дракона: чем больше значение тем лучше справляется с задачами 
    int vid = 1;            //вид дракончика,в чем он лучше, например, 1 - для сбора урожая, 2 -для атаки, и тд 
    Boolean isOn = false;   //спит или бодровствует

    void upgrat() {
        this.level += 1; // улучшение уровня дракончика
    }
}
class Boks {
    int num = 122; //номер сундучка
    int status = 0;// статусы. Например, 0 - заблокирован, нужно заплатить монетки чтобы разблок.,1 - разблокирован, 2 -открыт 
    int vid = 1;// вид сундучка, в зависимости от него и уровня будет меняться количество монет что нужно заплатить. мб 0- простой, 1- редкий, 2 - легендарный и тд
    int level = 1 ;// уровень чем выше тем он дороже и  лучше содержимое
    String color = "green";//цвет
    int tip = 1;// по нему определяют какой дракончик оттуда выйдет
    void changy () {
        this.status += 1;  //смена стуатуса, например, открытие 
    }
}
class Flower {
    int id = 1;       //ид цветочка
    int level = 0 ;  //уровень
    String color = "green"; //цвет
    Boolean isBlock = true; //стоит ли на мертвой земле
    boolean isSphere = false; //в сфере он или нет
    int pawer = 1; //уровень сферы жизни что дракончик с цветочка может собрать
    void bloc () {
        this.isBlock = true;
    }


    
}
public class Main {
    public static void main(String args[]) {
        Dragon drag = new Dragon();
        drag.upgrat();
        System.out.println(drag.level);
        Flower fl = new Flower();
        fl.bloc();
        System.out.println(fl.isBlock);
        Boks bok = new Boks();
        bok.changy();
        System.out.println(bok.status);
    }
    
}
