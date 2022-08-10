package com.hexaware.collectionsproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sellerlist {
        List<Sellerdetail> sellerList = new ArrayList<Sellerdetail>();
	
	public void addsellers() {
		
		Sellerdetail obj = new Sellerdetail(1,"Sweety","sweety@gmail.com","Vijayawada");
		Sellerdetail obj1 = new Sellerdetail(2,"Meenu","meenu@gmail.com","Hyderabad");
		Sellerdetail obj2 = new Sellerdetail(3,"Honey","honey@gmail.com","Bangalore");
		Sellerdetail obj3 = new Sellerdetail(4,"Sonu","sonu@gmail.com","Chennai");
		sellerList.add(obj);
		sellerList.add(obj1);
		sellerList.add(obj2);
		sellerList.add(obj3);
	}
	
	public void addSeller(int id, String name, String location, String email) {
		sellerList.add(new Sellerdetail(id, name, location, email));
		System.out.println("Seller Added");
	}
	
	public void displayAllSellers() {
		sellerList.stream().forEach((seller) -> System.out.println(seller));
	}
	
	public void searchById(int id) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void deleteById(int id) {
		
		sellerList =  sellerList.stream()
		.filter((seller) -> id != seller.getId())
		.collect(Collectors.toList());
		
		sellerList.stream()
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void updateById(int id, String name, String location, String email) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> {
			seller.setId(id);
			seller.setName(name);
			seller.setEmail(email);
			seller.setLocation(location);
		});
		
		sellerList.stream().forEach((seller) -> System.out.println(seller));

	}
	
	public void displayByLocation(String location) {
		sellerList.stream()
		.filter((seller) -> location.equals(seller.getLocation()))
		.forEach((seller) -> System.out.println(seller));
	}
	
}
