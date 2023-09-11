package FileManager;

import java.util.*;

class FileManager {
    private List<String> files;

    public FileManager() {
        this.files = new ArrayList<>();
    }

    public List<String> getFiles() {
        return files;
    }

    public void addFile(String fileName) {
        files.add(fileName);
    }

    public void deleteFile(String fileName) {
        Iterator<String> iterator = files.iterator();
        while (iterator.hasNext()) {
            String file = iterator.next();
            if (file.equalsIgnoreCase(fileName)) {
                iterator.remove();
            }
        }
    }

    public boolean searchFile(String fileName) {
        for (String file : files) {
            if (file.equalsIgnoreCase(fileName)) {
                return true;
            }
        }
        return false;
    }
}

