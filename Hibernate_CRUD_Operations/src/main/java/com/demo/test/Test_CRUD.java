package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class Test_CRUD {

	public static void main(String[] args) {
		ProductService ps = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Add new product\n 2. Delete by id\n 3. Display all\n");
			System.out.println("4. display by Id\n 5. sort by id\n6. update by id\n7. exit\nchoice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ps.addNewProdut();
				break;
				
			case 2:
				System.out.println("Enter Id");
				int id = sc.nextInt();
				boolean confirm = ps.deleteById(id);
				if (confirm) {
					System.out.println("Deleted Successfully");
				} else {
					System.out.println("Id not found....");
				}

				break;

			case 3:
				List<Product> plist = ps.getAllProduct();
//				System.out.println(plist);                //prints list in single line
				plist.forEach(System.out::println);

				break;

			case 4:
				System.out.println("Enter Id");
				id = sc.nextInt();
				Product p = ps.displayById(id);
				if (p != null) {
					System.out.println(p);
				} else {
					System.out.println("Id not found....");
				}

				break;
				
			case 5:
				plist = ps.sortById();
				plist.forEach(System.out::println);
				break;
				
			case 6:
				System.out.println("enter product id");
				int pid=sc.nextInt();
				System.out.println("enter productname");
				String pname=sc.next();
				System.out.println("enter warehousename");
				String wname=sc.next();
				boolean status = ps.updateProduct(pid, pname, wname);
				if(status) {
					System.out.println("modified successfuly");
				}
				else {
					System.out.println("not found");
				}
				break;
				
				
			case 7:
				ps.closeConnection();
				System.out.println("Thank you for visiting....");
				break;

			}

		} while (choice != 7);

	}

}
