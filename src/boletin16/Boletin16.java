package boletin16;

import com.alberto.persoal.Persoal;
import com.alberto.validar.Validar;
public class Boletin16 {

    public static void main(String[] args) {
      
        Persoal alum1=new Persoal("986222222", "hola@quetal.com");
        Academica aca1=new Academica("Antonia",Validar.validarNota() , alum1);
        System.out.println(aca1);

    }

}
