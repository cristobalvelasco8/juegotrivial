import java.util.Scanner;

public class JuegoTrivial {

	public static void main(String[] args) {
	System.out.println("Bienvenido al Trivial");
	int valorpregunta=1;
	int puntuaje=0;
	String pregunta1= "¿Cuanto es 6*5?";
	String respuesta1= "30"; 
	String respuesta2= "50";
	String pregunta2= "¿Cuánto es 10*5?";
	String respuesta3= "50";
	String respuesta4= "90";
	String pregunta3= "¿Cuanto es 9+5?";
	String respuesta5= "14";
	String respuesta6= "20";
	String pregunta4= "¿Cuanto es 15+5?";
	String respuesta7= "20";
	String respuesta8= "40";
	String pregunta5= "¿Cuanto es 30*2?";
	String respuesta9= "60";
	String respuesta10= "10";
	String pregunta6= "¿Cuanto es 40*2?";
	String respuesta11= "80";
	String respuesta12= "60";
	String pregunta7= "¿Cuanto es 7-3?";
	String respuesta13= "4";
	String respuesta14= "5";
	String pregunta8= "¿Cuanto es 50*70?";
	String respuesta15= "140";
	String respuesta16= "3500";
	String pregunta9= "¿Cuanto es 0*70?";
	String respuesta17= "0";
	String respuesta18= "70";
	String pregunta10= "¿Cuanto es 20/10?";
	String respuesta19= "2";
	String respuesta20= "5";
	
	
	Scanner preguntas=new Scanner (System.in);
	System.out.println("1- Primera Pregunta: "+pregunta1);
	String r1=preguntas.nextLine();
	
	if(r1.equalsIgnoreCase(respuesta1)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta1);
		}
	System.out.println("2- Segunda Pregunta: "+pregunta2);
	String r2=preguntas.nextLine();
	if(r2.equalsIgnoreCase(respuesta3)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta3);
		}
	System.out.println("3- Tercera Pregunta: "+pregunta3);
	String r3=preguntas.nextLine();
	if(r3.equalsIgnoreCase(respuesta5)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta5);
		}
	System.out.println("4- Cuarta Pregunta: "+pregunta4);
	String r4=preguntas.nextLine();
	if(r4.equalsIgnoreCase(respuesta7)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta7);
		}
	System.out.println("5- Quinta Pregunta: "+pregunta5);
	String r5=preguntas.nextLine();
	if(r5.equalsIgnoreCase(respuesta9)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta9);
		}
	System.out.println("6- Sexta Pregunta: "+pregunta6);
	String r6=preguntas.nextLine();
	if(r6.equalsIgnoreCase(respuesta11)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta11);
		}
	System.out.println("7- Séptima Pregunta: "+pregunta7);
	String r7=preguntas.nextLine();
	if(r7.equalsIgnoreCase(respuesta13)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta13);
		}
	System.out.println("8- Octava Pregunta: "+pregunta8);
	String r8=preguntas.nextLine();
	if(r8.equalsIgnoreCase(respuesta16)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta16);
		}
	System.out.println("9- Novena Pregunta: "+pregunta9);
	String r9=preguntas.nextLine();
	if(r9.equalsIgnoreCase(respuesta17)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta17);
		}
	System.out.println("10- Décima Pregunta: "+pregunta10);
	String r10=preguntas.nextLine();
	if(r10.equalsIgnoreCase(respuesta19)) {
		System.out.println("Respuesta Correcta: ");
		puntuaje=puntuaje+1;
		}
		else {
			System.out.println("Respuesta incorrecta, la respuesta correcta es: "+respuesta19);
		}
	System.out.println("Tu puntuaje fue: " +valorpregunta*puntuaje);
	
	}
	}
