package prueba.calculator;

public class stringcalc 
{
    //cuando la cadena es vacia
    
     public int add (String string )
    {
        if (string.length()==0)
        {
            return 0;          
        }
        
     
       //apartir de este se genera el else de cuando la cadena no es vacia 
        else
        {
            //cuando la cadena contiene el delimitador "," o saldo de linea
            String Delimitador = ",|\n";
            
            //si la cadena contiene // en el principio 
            if (string.contains("//"))
            {        
                
                //creamos variable enviamos  el delimitador 
                Delimitador = string.substring(2,3);
    
            }  
            String values = (string);
               if (string.contains("//"))
            {          
                
                values = string.substring(3);
    
            }
               //split para dividir por delimitadores
           return suma(values.split(Delimitador));
          
    }
    }
     //crear metodo suma con valores de cadena
     
     
    private int suma(String[] values)
    {
        
        String negatives = "";
        
            for (String value : values)
               {
                   //calcular negativos sea menor de 0
                 if(Entero(value)<0)
                    {
                             negatives += ","+value;
                    }
              }
            
            //si hay varios negativos
        if(negatives.length()>0) 
            
       
            throw new RuntimeException (negatives.substring(1));
        int resultado = 0;
        //haga la suma de los datos recibidos entero contiene valor
        
        for (String value : values)
        {
            resultado += Entero(value);
        }
                
              return resultado;
    }
    
    //metodo para transformar a entero para cuando se pone el negativo
    private Integer Entero(String value)
    {
    Integer number = Integer.valueOf(value);
    if(number <0)
        //si hay numero negativo arroja excelcion
        throw new RuntimeException(value);
    return number;
        
    }
    
    
    
}
