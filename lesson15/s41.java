  File root = new File(".");  //  создается root типа File
  ArrayList<File> expand = new ArrayList<File>();        // создается массив expand
  expand.add(root);                                    // в этот массив добавили root
for(int depth = 0; depth < 10; depth++) {                 // начинают цикл с 0 до 9 
    File[] expandCopy = expand.toArray(new File[expand.size()]);       //  в массив expandCopy добавили эементы из expand 
    expand.clear();                               //     очистили
    for (File file : expandCopy) {               //       начинаем цикл для каждого эемента из expandCopy
        System.out.println(depth + " " + file);                // печатаем номер итерации и элемент
        if (file.isDirectory()) {                           //    если элемент является директорией
            expand.addAll(Arrays.asList(file.listFiles()));          // то добавляет содержимое в список 
        }
    }
  }
