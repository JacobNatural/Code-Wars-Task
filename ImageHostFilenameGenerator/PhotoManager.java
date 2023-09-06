package pl.jakubmarjankowski.codewars.ImageHostFilenameGenerator;

import java.util.List;

public class PhotoManager {
    List<String> list;
    PhotoManager(List<String> list){
        this.list = list;
    }
    public boolean nameExists(String filename){
        if(list.contains(filename)) return true;
        return false;
    }

    public static void main(String[] args) {
        List<String> list = List.of("ABCDEF", "GHBABF", "LKJHGF", "ABCDER", "LOPOIU", "HGGHYT");
        PhotoManager photoManager = new PhotoManager(list);
    }
}
