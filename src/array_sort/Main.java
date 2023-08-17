package array_sort;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arr) {
		String message = "Введите количество элементов массива: ";
		System.out.println(message);

		boolean loop = true;
		int amount = 0;
		while (loop) {
			amount = valid();
			if (amount == 0) {
				System.out.println(message);
			} else
				loop = false;
		}

		System.out.println("Введите элементы массива: ");

		int[] arr1 = initialization(amount);
		Arrays.sort(arr1);
        System.out.println("Отсортированный массив:");
		printArray(arr1);
		scanner.close();
	}

	public static int valid() {
		int num = 0;
		String fail = "Введите целое положительное число! ";
		boolean loop = true;
		while (loop) {
			try {

				num = scanner.nextInt();
				if (num < 0)
					System.out.println(fail);
				else
					loop = false;
			} catch (InputMismatchException e) {
				System.out.println(fail);
				scanner.next();
			}
		}

		return num;
	}

	public static int[] initialization(int amount) {
		int[] arr = new int[amount];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = valid();
		}

		return arr;
	}

	public static void printArray(int[] arr1) {

		Arrays.sort(arr1);
		

		System.out.print("[ ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("]");

	}
}
