package Gateway;

import Repositorio.Repositorio;
import java.util.Vector;

public class Gateway {

    private Vector<Repositorio> reps = new Vector<Repositorio>();

    public Gateway() {
        reps.add( new Repositorio() );
        reps.add( new Repositorio("./nbproject/") );
    }

    @Override
    public String toString() {
        String repList = "";

        for ( Repositorio rep : reps )
            repList += "repx: " + rep;

        return repList;
    }

    public String mmString() {
        return reps.toString();
    }

}

