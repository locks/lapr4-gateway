package Gateway;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
       Gateway gateway = new Gateway();

//        System.out.println( gateway );
        System.out.println( gateway.mmString() );

        Vector lol = new Vector();
        Vector lolada = new Vector();

        lol.add(14);
        lol.add(15);
        lolada.add(14);

        if (lol.removeAll( lolada ))
            System.out.println( "\n\nYep:\n\n" + lol );
        else
            System.out.println("Erro.");
    }

}
