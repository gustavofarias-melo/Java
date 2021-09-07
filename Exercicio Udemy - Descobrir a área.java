import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area = Math.PI * Math.pow(raio, raio);
		System.out.println(area);
