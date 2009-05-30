package Repositorio;

import java.io.File;
import java.util.Vector;

public class Repositorio {

    private String dir = "./";
    private File[] mails = null;

    public Repositorio() {
        setDirectory();
        mails = new File(dir).listFiles();
    }

    public Repositorio(String dir) {
        setDirectory(dir);
        mails = new File(this.dir).listFiles();
    }

    public void setDirectory() {
        dir = "./";
    }
    public void setDirectory(String dir) {
        this.dir = dir;
    }

    public void percorreRep() {
        for(File ficheiro: mails) {
            System.out.println(ficheiro.getName());
        }
    }

    public Vector<String> toStringArray() {
        Vector<String> lista = new Vector<String>();

        for( File ficheiro : mails )
            lista.add( ficheiro.getName() );

        return lista;
    }

    @Override
    public String toString() {
        String fileList = "";

        for( File ficheiro : mails )
            fileList += ficheiro.getName() + "\n";

        return fileList;
    }

}
