public class Cliente {

	public static void main(String[] args) {
		
		// Usando Lazy Singleton
		
		FileLogger1 logger01 = FileLogger1.getFileLogger1();
		
		logger01.log("Mensagem 1");
		
		FileLogger1 logger1 = FileLogger1.getFileLogger1();
		
		if(logger01 == logger1) {
			System.out.println("\nOs objetos logger01 e logger1 são a mesma instância\n");
			
		}else {
			System.out.println("O padrão Sigleton falhou!!!");
		}
		
		logger1.log("Mensagem 2");
		
		///////////////////////////////////////////////
		
		// Usando Enum Singleton
		
		FileLogger2 logger02 = FileLogger2.INSTANCIA;
		logger02.log("Mensagem 3");
		FileLogger2 logger2 = FileLogger2.INSTANCIA;
		
		if(logger02 == logger2) {
			System.out.println("\nOs objetos logger02 e logger2 são a mesma instância\n");
			
		}else {
			System.out.println("O padrão Sigleton falhou!!!");
		}
		
		logger2.log("Mensagem 4");
		
		
	}

}
