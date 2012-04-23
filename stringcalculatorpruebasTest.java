package prueba.calculator;


    import org.junit.*;
    import static org.junit.Assert.*;

public class stringcalculatorpruebasTest {
    private stringcalc calculadora; 
    
    
    //metodo cuando es vacio es 0
    @Test
    
         public void cuandoes0() 
    {
        calculadora = new stringcalc();
        
        
         assertEquals(0,calculadora.add("")); 
        
        
    }
    
    //metodo para comparar con assertequals va ligado a cuantoes1
       private void add(String string,int res) {
        assertEquals(res,calculadora.add(string));
    }
    
    //se crea un metodo relacionado al metodo add se envia los datos para realizar las pruebas
    @Test
         public void cuandoes1() 
    {
         calculadora = new stringcalc();

         add("1",1 );
         
         add("2", 2);
         
         add("1,2",3 );
         
         add("1\n2,3",6);
         
         add("//;2;2;2",6); 
       
     }
    //metodo para cuando es negativo -1

         public void cuandosonnegativos() 
             {
                 
                 
         calculadora = new stringcalc();
         
                try {
                        calculadora.add ("-1");
                        fail();
                     }
                catch (Exception e)   
                {
                    assertEquals("-1",e.getMessage());
                 }
   
         
     }
 
 
 
   
    
    
       
       
}
