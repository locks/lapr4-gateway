package Repositorio;

import java.io.File;
import java.util.Vector;

public class Repositorio {

    private String dir = "./";
    private File[] mails = null;
    private Vector<File> repositorio = new Vector<File>();

    public Repositorio() {
        setDirectory();
        mails = new File(dir).listFiles();
        setRepositorio();
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

    public void setRepositorio() {
        for(File ficheiro : new File(dir).listFiles())
            repositorio.add(ficheiro);
    }

    public Vector<File> novoRepositorio() {
        Vector<File> novo = null;
        
        for(File ficheiro : new File(dir).listFiles())
            repositorio.add(ficheiro);

        return novo;
    }
    
    public Vector<String> toStringArray() {
        Vector<String> lista = new Vector<String>();

        for( File ficheiro : mails )
            lista.add( ficheiro.getName() );

        return lista;
    }

    public Vector<File> getElementosNovos() {
        Vector<File> novo = novoRepositorio();
        return (novo.removeAll(repositorio)) ?
            novo : null;
    }

    public void actualizar() {
        mails = (mails.equals( new File(dir).listFiles()) )?
            null : null;
    }

    public void novos() {

        File[] novos = new File(dir).listFiles();

//        for( File ficheiro : novos )
//            if ( mails.)
    }

    @Override
    public String toString() {
        String fileList = "";

        for( File ficheiro : mails )
            fileList += ficheiro.getName() + "\n";

        return fileList;
    }

    public String mmString() {
        return repositorio.toString();
    }

}
