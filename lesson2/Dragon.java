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
}