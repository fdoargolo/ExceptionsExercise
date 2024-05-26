package project;

import java.util.Scanner;

import exercise.entities.Account;
import exercise.exceptions.InputException;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int accountNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Holder: ");
			String accountHolder = scanner.nextLine();
			System.out.print("Initial balance: ");
			double accountIBalance = scanner.nextDouble();
			System.out.print("Withdraw limit: ");
			double accountWLimit = scanner.nextDouble();

			Account account = new Account(accountNumber, accountHolder, accountIBalance, accountWLimit);

			System.out.print("\nEnter amount for withdraw: ");
			double withdrawAmount = scanner.nextDouble();

			account.withDraw(withdrawAmount);
			System.out.println(account);
		} catch (InputException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		scanner.close();

	}

}
