package org.bridgelabz.dataStructure;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HashingFunction <T>{
		//search the element into Hashmap
			public void hashingSearch(LinkedList<T> list[], String[] num) {
				for (int i = 0; i < num.length; i++) {
					int number = Integer.parseInt(num[i]);
					int key = number % 11;
					list[key].sort(number);
				}
			}

			/**
			 * function to search the element into list
			 * 
			 * @param number
			 * @param list
			 */
			public void search(int number, LinkedList<T> list[]) {
				int key = number % 11;
				if (list[key].search(number)) {
					list[key].remove(number);
					System.out.println("Found Hence Remove..");
					
				} else {
					list[key].sort(number);
					System.out.println("Not Found hence Added..");
				}
			}

			public static void main(String[] args) throws IOException {

				HashingFunction<Integer> h = new HashingFunction<>();

				LinkedList<Integer> list[] = new LinkedList[11];
				//Utility<Object> u = new Utility<>();
				IOFile io = new IOFile();
				String num[] = io.readFromFile("/home/admin1/git/repository/bridgelabz/src/Data_structure/sample.txt").split(" ");
				for (int i = 0; i < 11; i++) {
					list[i] = new LinkedList<>();
				}
				h.hashingSearch(list, num);
				for (int i = 0; i < 11; i++) {
					if (list[i].size() == 0) {
						continue;
					}
					list[i].display();
					System.out.println();
				}
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number for finding : ");
				int n = sc.nextInt();
				h.search(n, list);
				FileWriter fw = new FileWriter(
						"/home/admin1/git/repository/bridgelabz/src/Data_structure/sample.txt");
				fw.write("");
				fw.close();
				for (int i = 0; i < 11; i++) {
					if (list[i].size() == 0) {
						continue;
					}
					list[i].display();
					System.out.println();
				}
				for (int i = 0; i < 11; i++) {
					if (list[i].size() == 0) {
						continue;
					}
					io.appendToFile(list[i],
							"/home/admin1/git/repository/bridgelabz/src/Data_structure/sample.txt");
				}
				sc.close();
			}

}