
package Ejercicios;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Cadena {

  public static String NombrePropio(String cadena){
      
  char [] caracteres =cadena.toCharArray();
  
  for(int i =0; i<cadena.length()-2; i++){
   if(caracteres[i] == ',' || caracteres[i] == '.' || caracteres[i] == ' ' ){
   caracteres[i+1] = Character.toUpperCase(caracteres[i+1]);
   
   }else{
   caracteres[0]=Character.toUpperCase(caracteres[0]);
  
  }
  
  }
  return new String(caracteres);
  }  
  
  
  public static int ContarVocales(String cadena1){
  int totalVocales=0;
  
  for(int i =0; i<cadena1.length(); i++){
   char c = cadena1.charAt(i);
   if((c == 'a')|| (c == 'A') || (c == 'e')|| (c == 'E') || (c == 'i') || (c == 'I')|| (c == 'o')|| (c == 'O') || (c == 'u') || (c == 'U')){
   totalVocales++;  
  }     
  } 
  return totalVocales;
  
  }
  
  public static String BorrarCaracter(String cadena2, String c){
  String cadenaNueva = cadena2.replaceAll(c, "");
  return cadenaNueva;
  }
  
  public static int ContarPalabras(String cadena3){
  StringTokenizer st = new StringTokenizer(cadena3);
  int numeroPalabras = st.countTokens();
  return numeroPalabras ;
  }
  
  public static boolean ValidarCorreo(String cadena4){
  Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
  Matcher mather = pattern.matcher(cadena4);
  boolean validacion;
  
  if(mather.find()==true){
  validacion =true;
  
  }else {
  validacion = false;
  }
  
  return validacion;
  }
  
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    // agregar un comentario de nuevo
//  String cadena=sc.nextLine();
//  System.out.println(Cadena.NombrePropio(cadena));
//  String cadena1 = sc.nextLine();
//  System.out.println(Cadena.ContarVocales(cadena1));
//   String cadena2 = sc.nextLine();
//   String c = sc.nextLine();
//   System.out.println(Cadena.BorrarCaracter(cadena2, c));
//     String cadena3 = sc.nextLine();
//     System.out.println(Cadena.ContarPalabras(cadena3));
    String cadena4 = sc.nextLine();
    System.out.println(Cadena.ValidarCorreo(cadena4));
  }
}
