package servidorCliente;

import uniandes.gload.core.LoadGenerator;
import uniandes.gload.core.Task;

public class Generador {
	
	private LoadGenerator loadG;
	
	public Generador(){
		Task work=crearTask();
		int nTasks=400;
		int brecha=20;
		
		loadG=new LoadGenerator("Con cifrado",nTasks,work,brecha);
		loadG.generate();
	}

	private Task crearTask() {
		return new Cliente();
	}
	
	public static void main(String[] args){
		Generador gen=new Generador();
	}
}