package Class;

public class SmartTv {
	public boolean ligada = false;
	public int canal = 1;
	public int volume = 25;
	
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		
	}
	
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void reduzirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Volume aumentado para : " + volume );
	}
	
	public void reduzirVolume() {
		volume--;
		System.out.println("Volume reduzido para : " + volume);
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
}
