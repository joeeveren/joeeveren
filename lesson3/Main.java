import java.util.Random;
class Dragon {
    private String name = "Bubu";  // имя дракончика по умолчанию
    private int level = 0 ;        // уровень при создании, в начале он яйцо
    private String color = "green";// цвет дракончика
    private int boxtype = 1 ;      // вид сундука из которого можно получить яйцо дракончика
    private String type = "Normal";// вид дракона: 0 - простой, 1 - мифический, 2 - легендарный и т.д.
    private Boolean mega_egg = true;// можно ли получить при открытии мегаяйца
    private int speed = 1;          // скорость дракона: чем больше значение, тем лучше справляется с задачами
    private int vid = 1;            // вид дракончика, в чем он лучше, например, 1 - для сбора урожая, 2 - для атаки, и т.д.
    private Boolean isOn = false;   // спит или бодрствует

    // Конструктор класса Dragon
    public Dragon(String n,  int b, Boolean i) {
        Random rand = new Random();
        this.name = n;
        this.level = rand.nextInt(13);;
        this.boxtype = b;
        this.isOn = i;
        System.out.println ("Имя дракончика "+this.name + " Его уровень "+ this.level);
    }
    public Dragon () {
        this.name = "Drag";
        this.color = "yellow";
        this.level = 9;
        System.out.println("Дракончик  создан по имени "+this.name  ); 
    }
    // Метод для улучшения уровня дракончика переименовала в foo
    public void foo() {
        this.level += 1;
        System.out.println(this.name + " имеет уровень  " +this.level);
    }
}

// Класс Boks представляет сундук с различными характеристиками
class Boks {
    Random rand = new Random();
    private int num = 122; // номер сундучка
    private int status = 0; // статусы. Например, 0 - заблокирован, нужно заплатить монетки чтобы разблокировать, 1 - разблокирован, 2 - открыт
    private int vid = 1; // вид сундучка, в зависимости от него и уровня будет меняться количество монет, которое нужно заплатить. Может быть 0 - простой, 1 - редкий, 2 - легендарный и т.д.
    private int level = 1; // уровень, чем выше тем он дороже и лучше содержимое
    private String color = "green"; // цвет
    private int tip = 1; // по нему определяется, какой дракончик оттуда выйдет

    // Метод для смены статуса, например, открытие
    public void changy () {
        this.status += 1;
    }

    // Конструктор класса Boks
    public Boks (int n, int l, int v, String c) {
        this.num = n;
        this.status = 0;
        this.level = l;
        this.color = c;
    }
}

// Класс Resource представляет ресурс с различными характеристиками
class Resource {
    Random rand = new Random();
    protected int id = 1;       // ид цветочка
    protected int level = 0 ;  // уровень
    protected String color = "green"; // цвет
    protected Boolean isBlock = true; // стоит ли на мертвой земле
    protected boolean isSphere = false; // в сфере он или нет
    protected int pawer = 1; // уровень сферы жизни, что дракончик с цветочка может собрать

    // Метод для блокировки ресурса
    public void bloc () {
        this.isBlock = true;
    }
    public void foo() {
        System.out.println(" Cоздан объект Resource");
    }
}

// Класс Flower представляет цветок с различными характеристиками
class Flower extends Resource {
    Random rand = new Random();
    protected String name;
    protected String tip = "Цветочек";
    private String tep ;

    // Конструктор класса Flower
    public Flower() {
        this.name = "s";
        System.out.println("Цветочек  создан" );
        this.tep = "легендарный";
    }
    public Flower ( int q) {
        this.name =  " номер " + q ; 
    }
    public void foo() {
        this.isBlock = false;
        System.out.println(this.tip + " " + this.name+ " разблокирован " );
    }
}

// Класс Tree представляет дерево с различными характеристиками
class Tree extends Resource {
    Random rand = new Random();
    protected String name;
    private String tep;


    // Конструктор класса Tree
    public Tree ( int q) {
            this.name =  "Деревце номер " + q ;
        }
    public Tree () {
        this.name = "Дерево";
        this.tep = "Легендарное";
        System.out.println("Деревце  создано" );
    }
    public void foo() {
        this.level = rand.nextInt(13);
        if (this.level <3) System.out.println(" Количество плодов что может расти на дереве "+this.name + "  равно " + 1 + " , потому что у него уровень " + this.level); else
        if (this.level <8) System.out.println(" Количество плодов что может расти на дереве "+this.name + "  равно " + 2 + " , потому что у него уровень " + this.level); else
        if (this.level <11) System.out.println(" Количество плодов что может расти на дереве "+this.name + "  равно " + 3 + " , потому что у него уровень " + this.level); else
            System.out.println(" Количество плодов что может расти на дереве "+this.name + "  равно " + 4);
    }

}

class Earth {
    Random rand = new Random();
    private int statut ; //
    private int type ;
    private Dragon egg;
    private Resource resource;

    public Earth() {
        // Создание объекта ресурса и/или объекта дракона и присвоение их полям dragon и resource
        int type = rand.nextInt(4); // Например, рандомно генерируем тип ресурса или дракона
        if (type == 0) {
            System.out.println("Земля пустая, не создаем ресурс и дракона");
            resource = null;
            egg = null;
        } else if (type == 1) {
            resource = new Flower();
            System.out.println("Создаем объект цветка и присваиваем его resource");
            egg = null;
        } else if (type == 2) {
            resource = null;
            egg = new Dragon();
            System.out.println("Создаем объект дракона и присваиваем его dragon");
        } else if (type == 3) {
            resource = new Tree();
            System.out.println("Создаем объект дерева и присваиваем его resource");
            egg = null;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println("4.1");
        System.out.println ();
        Earth earth = new Earth();
        System.out.println ();
        System.out.println ("4.3");
        System.out.println ();
        Dragon rag = new Dragon();
        Dragon gon = new Dragon ("Gon", 7, false);
        System.out.println ();
        System.out.println ("4.2");
        Random rand = new Random();
        Resource [] res = new Resource[500];
        for(int i = 0; i < 500; i ++) {
            System.out.println ();
            System.out.println ("Итерация номер " + i + ":");
            int n = rand.nextInt(3);
            if (n == 0)
                res[i] = new Flower(i); else
            if (n == 1) res[i] = new Tree(i);else 
             res[i] = new Resource(); 
               res[i].foo();  
               
            
        }
        
        
    }
}
