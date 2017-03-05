package paquete;

public class Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CotaInf = 10;
		final int CotaSup = 100;
		final int Rango = CotaSup - CotaInf;
		int mx, mn;
		//Se inicializa mx y mn al mínimo y máximo respectivamente
		
		mx = CotaInf;
		mn = CotaSup;
		System.out.println("\tSecuencia de 20 numeros aleatorios.");
		for(int k = 1; k <= 20; k++){
			int x;
			x = (int)(Rango*Math.random()+ CotaInf);
			mx = Math.max(mx, x);
			mn = Math.min(mn, x);
			System.out.println(" "+x);
		}
		System.out.println("\n\tMaximo numero generado: "+mx);
		System.out.println("\n\tMinimo numero generado: "+mn);
	}

}
