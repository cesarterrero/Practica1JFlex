package codigo;
import  java.io.File;
public class Principal {	
public static void main(String [] args) {
	String ruta = "C:/users/cesar/eclipse-workspace/AnalizadorLexico/src/codigo/Lexer.flex";
	generarlexer(ruta);
}


public static void generarlexer(String ruta) {
	
	File archivo = new File(ruta);
	JFlex.Main.generate(archivo);
}

}
