package com;

public class Client {

	public static void main(String args[])
	{
		try {
			Fruit fruit;
			Vegetables vegetables;
	        AFruitAndVegetables aFruitAndVegetables = new AFruitAndVegetables();
	        aFruitAndVegetables = (AFruitAndVegetables)XMLUtil.getBean();
	        fruit = aFruitAndVegetables.CreateF();
	        fruit.eat();
	        vegetables = aFruitAndVegetables.CreateV();
	        vegetables.eat();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
