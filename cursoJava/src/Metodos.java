import Class.SmartTv;

public class Metodos {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.reduzirVolume();
		smartTv.reduzirVolume();
		smartTv.reduzirVolume();
		
		System.out.println("TV ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual : " + smartTv.canal);
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual : " + smartTv.canal);
		System.out.println("Volume Atual : " + smartTv.volume);
		
		
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		
		
		smartTv.ligar();
		System.out.println("Atualizando -> TV ligada ? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Atualizando -> TV ligada ? " + smartTv.ligada);
		

	}

}
