package com.lyrpx.util;

import java.io.File;

public class ImgFile {
    public static final String IMG_PATH = "D:\\Desktop\\Project\\javaweb\\javaweb03\\upload\\";

    public static void deleteImg(File file) {
        if(!file.exists()) return;
        if(file.isFile() || file.list() == null)
            file.delete();
        else {
            File []files = file.listFiles();
            for(File f : files) {
                deleteImg(f);
            }
            file.delete();
        }
    }
}
