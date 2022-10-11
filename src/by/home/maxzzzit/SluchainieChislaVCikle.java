package by.home.maxzzzit;

public class SluchainieChislaVCikle {

	public static void main(String[] args) {
		// Цикл, который генерирует и выводит на экран 26 целых случайных чисел из диапазона от 10 до 45
		int rand;
		for (int i=0; i<26; i++) {
			rand=10+(int)(Math.random()*36);
			System.out.print(rand+" ");
		}
	}

}
