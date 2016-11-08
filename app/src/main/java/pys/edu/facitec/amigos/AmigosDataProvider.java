package pys.edu.facitec.amigos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by server on 20/10/2016.
 */
public class AmigosDataProvider {
    public static List<Amigos> getAmigos(){
        List<Amigos> amigos = new ArrayList<Amigos>();

        for (int i = 1; i<101;i++){
            Amigos a = new Amigos();
            a.setNombre("Nombre"+i);
            a.setEmail("Email"+1+"@usuario.com");
            amigos.add(a);
        }
        return amigos;
    }
}
