package BankApplication;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Pizza {
	    private String size;
	    private List<String> toppings;

	    public Pizza(String size) {
	        this.size = size;
	        this.toppings = new ArrayList<>();
	    }

	    public void addTopping(String topping) {
	        toppings.add(topping);
	    }

	    public double calculatePrice() {
	        double basePrice;
	        switch (size.toLowerCase()) {
	            case "small":
	                basePrice = 89.99;
	                break;
	            case "medium":
	                basePrice = 110.99;
	                break;
	            case "large":
	                basePrice = 120.99;
	                break;
	            default:
	                basePrice = 0.0;
	        }

	        double toppingPrice = toppings.size() * 20;
	        return basePrice + toppingPrice;
	    }

	    @Override
	    public String toString() {
	        return "Size: " + size + ", Toppings: " + toppings;
	    }
	}

	class Order {
	    private List<Pizza> pizzas;

	    public Order() {
	        this.pizzas = new ArrayList<>();
	    }

	    public void addPizza(Pizza pizza) {
	        pizzas.add(pizza);
	    }

	    public double calculateTotal() {
	        double total = 0;
	        for (Pizza pizza : pizzas) {
	            total += pizza.calculatePrice();
	        }
	        return total;
	    }

	    public void displayOrder() {
	        System.out.println("Order details:");
	        for (Pizza pizza : pizzas) {
	            System.out.println(pizza);
	        }
	        System.out.println("Total: $" + calculateTotal());
	    }
	}

	public class PizzaDeliveryProgram {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Order order = new Order();

	        while (true) {
	            System.out.print("Enter pizza size (small, medium, large) or 'done' to finish: ");
	            String size = scanner.nextLine();
	            if (size.equalsIgnoreCase("done")) {
	                break;
	            }

	            Pizza pizza = new Pizza(size);

	            while (true) {
	                System.out.print("Add a topping (or 'done' to finish adding toppings): ");
	                String topping = scanner.nextLine();
	                if (topping.equalsIgnoreCase("done")) {
	                    break;
	                }
	                pizza.addTopping(topping);
	            }

	            order.addPizza(pizza);
	        }

	        System.out.println("Thank you for your order!");
	        order.displayOrder();

	        scanner.close();
	    }
	

}
