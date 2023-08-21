import java.io.*;     
import java.util.zip.*;
public class ZipFileUpdater {

    public static void main(String[] args) {
        String existingArchive = "existing.zip";         // тут в части main задаем название существующего архива
        String[] filesToAdd = {"file1.txt", "file2.txt", "file3.txt"};  // массив из названий файлов что нужно добавить в архив

        try {        //  вызываем в try функцию updateZip с названием архива и массовм из названий файлов 
            updateZip(existingArchive, filesToAdd);
            System.out.println("Файлы успешно добавлены в архив.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void updateZip(String existingArchive, String[] filesToAdd) throws IOException {     // наша функция что принимает значения для архива и массива
    
        File tempFile = File.createTempFile("tempArchive", ".zip");     //  создаем временный архив
        tempFile.deleteOnExit(); 

       try (
    FileInputStream fis = new FileInputStream(existingArchive); // Открываем входной поток для существующего архива
    ZipInputStream zis = new ZipInputStream(fis); // Создаем объект для чтения из архива
    FileOutputStream fos = new FileOutputStream(tempFile); // Открываем выходной поток для временного файла
    ZipOutputStream zos = new ZipOutputStream(fos); // Создаем объект для записи в архив
) {
            // 
           ZipEntry entry = zis.getNextEntry(); // Получаем следующий элемент (файл) из исходного архива
while (entry != null) { // Пока есть элементы в архиве
    zos.putNextEntry(new ZipEntry(entry.getName())); // Создаем новый элемент во временном архиве с тем же именем
    byte[] buffer = new byte[1024]; // Создаем буфер для копирования данных
    int length; // Переменная для хранения количества считанных байт
    while ((length = zis.read(buffer)) > 0) { // Читаем данные из исходного архива в буфер
        zos.write(buffer, 0, length); // Записываем данные из буфера во временный архив
    }
    zos.closeEntry(); // Закрываем текущий элемент во временном архиве
    entry = zis.getNextEntry(); // Переходим к следующему элементу в исходном архиве
}


            // для каждого файла из списка
            for (String fileToAdd : filesToAdd) { 
                File file = new File(fileToAdd);  //Создаем объект файла для текущего пути
                if (file.exists()) {    // если он существует 
                    FileInputStream fileInputStream = new FileInputStream(file);  //Создаем поток для чтения файла
        zos.putNextEntry(new ZipEntry(file.getName())); // Создаем новый элемент в архиве с именем файла
        byte[] buffer = new byte[1024]; // Создаем буфер для копирования данных
        int length; // Переменная для хранения количества считанных байт
        while ((length = fileInputStream.read(buffer)) > 0) { // Читаем данные из файла в буфер
            zos.write(buffer, 0, length); // Записываем данные из буфера в архив
        }
        zos.closeEntry(); // Закрываем текущий элемент в архиве
        fileInputStream.close(); // Закрываем поток чтения файла
        System.out.println("Added file: " + fileToAdd); // Выводим сообщение об успешном добавлении файла
    } else {
        System.out.println("File not found: " + fileToAdd); // Выводим сообщение о том, что файл не найден
    }
                
            }
        }

        // переименовываем временный архив в старое название
      File existingFile = new File(existingArchive); 
        tempFile.renameTo(existingFile);
    }
}
