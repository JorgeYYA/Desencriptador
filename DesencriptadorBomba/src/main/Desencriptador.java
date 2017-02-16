package main;

public class Desencriptador {
		static String mensajeCod="ME LA PONE TIESAPACO ";
		String temporal;
		static int saltos=4;
	public static void main(String[] args) {	
		descodificar();
	}
		public static void descodificar(){
			String temporal=mensajeCod;
			String mensaje="";
			
			for(int i=0;i<=saltos;i++){
				mensaje=temporal.substring(temporal.length()-1,temporal.length())+temporal.substring(0,temporal.length()-1);
				temporal=mensaje;
				
			}
			System.out.println(mensaje);
		}
}
