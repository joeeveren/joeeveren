
public class FileExplorer {
    public static List<List<String>> exploreDirectory(String path, String extension, boolean includeSubdirectories) {
        List<String> fileList = new ArrayList<>();
        List<String> subdirectoryList = new ArrayList<>();
        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {
            return null;
        }

        for (File file : directory.listFiles()) {
            if (file.isFile() && file.getName().endsWith(extension)) {
                fileList.add(file.getName());
            } else if (file.isDirectory()) {
                subdirectoryList.add(file.getName());
                if (includeSubdirectories) {
                    exploreSubdirectory(file, extension, fileList, subdirectoryList);
                }
            }
        }

        List<List<String>> result = new ArrayList<>();
        result.add(fileList);
        result.add(subdirectoryList);
        return result;
    }

    private static void exploreSubdirectory(File directory, String extension, List<String> fileList, List<String> subdirectoryList) {
        for (File file : directory.listFiles()) {
            if (file.isFile() && file.getName().endsWith(extension)) {
                fileList.add(file.getName());
            } else if (file.isDirectory()) {
                subdirectoryList.add(file.getName());
                exploreSubdirectory(file, extension, fileList, subdirectoryList);
            }
        }
    }

  
}
