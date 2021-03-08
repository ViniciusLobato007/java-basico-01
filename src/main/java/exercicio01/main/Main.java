package exercicio01.main;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		int age = 15;
		
		System.out.println("A idade é de " + age + " anos");
		
		age = (age + 5) * 2;
		
		System.out.println("Resultado 1: " + age);
		
		age -= 25;
		
		System.out.println("Resultado 2: " + age);
		
		if(age < 20) {
			System.out.println("A idade é menor que 20");
		}else {
			System.out.println("A idade é maior que 20");
		}
	}

}
