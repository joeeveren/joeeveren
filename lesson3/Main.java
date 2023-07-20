 
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
    public Dragon(String n, int l, int b, Boolean i) {
        this.name = n;
        this.level = l;
        this.boxtype = b; 
        this.isOn = i;
    }

    // Метод для улучшения уровня дракончика
    public void upgrat() {
        this.level += 1;
    }
}

// Класс Boks представляет сундук с различными характеристиками
class Boks {
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
    private int id = 1;       // ид цветочка
    private int level = 0 ;  // уровень
    private String color = "green"; // цвет
    private Boolean isBlock = true; // стоит ли на мертвой земле
    private boolean isSphere = false; // в сфере он или нет
    private int pawer = 1; // уровень сферы жизни, что дракончик с цветочка может собрать
    
    // Метод для блокировки ресурса
    public void bloc () {
        this.isBlock = true;
    }
}

// Класс Flower представляет цветок с различными характеристиками
class Flower extends Resource {
    protected String name;
    protected int tip; 
    
    // Конструктор класса Flower
    public Flower(String s, int g) {
        this.name = s;
        this.tip = g;
    }
}

// Класс Tree представляет дерево с различными характеристиками
class Tree extends Resource {
    protected String name;
    protected int tip; 
    
    // Конструктор класса Tree
    public Tree (String s, int g) {
        this.name = s;
        this.tip = g;
    }
}

public class Main {
    public static void main(String args[]) {
        Dragon drag = new Dragon("qwe", 1, 5, false);
        drag.upgrat();

        Flower fl = new Flower("Rose", 1);
        fl.bloc();

        Boks bok = new Boks(1, 2, 3, "Red");
        bok.changy();
    }
}
