import java.io.File;

public class Cat {
    public static void main(String[] args)  {
        dirList("D:\\secureCRT");
    }
    static void dirList(String path){
        File file=new File(path);
        File filelist[]=file.listFiles();
        for (File f:filelist)  if(f.isDirectory())dirList(f.getPath());
        else System.out.println(f.getAbsolutePath());
        System.out.println(file.getAbsolutePath());
    }
}