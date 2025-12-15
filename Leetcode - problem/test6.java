// Multi-User Shopping Cart Billing
// Scenario
// You are building a billing system for a shopping store. Every day, multiple users visit the store.
// Each user adds a certain number of items to their shopping cart, and each item has a price.
// The store follows a discount policy. Based on the total cart value of each user, a discount may be
// applied. The important rule is that each user’s cart is calculated separately.
// Your task is to collect item prices for every user, calculate their total bill, apply discount rules, and
// finally print the payable amount for each user.
// Logic (Explained as a Story)
// First, the system asks how many users are shopping today.
// For each user, the system asks how many items they added to the cart.
// Then, it takes the price of each item and stores them in a list.
// After collecting all item prices of a user, the system calculates the total amount.
// Based on the total amount, discount rules are applied:
// • Total ≥ 5000 → 20% discount
// • Total > 1000 → 15% discount
// • Total > 500 → 5% discount
// • Otherwise → No discount
// This process is repeated for every user, and the final bill amount is printed for each user separately.
// Input
// • Number of users
// • Number of items for each user
// • Price of each item entered by the user
// Output
// • Final payable amount for each user after applying discount rules
// Test Case 1
// Input:
// Users = 2
// User 1 Items = [200, 300]
// User 2 Items = [600, 500]
// Explanation:
// User 1 Total = 500 → No discount
// User 2 Total = 1100 → 15% discount
// Output:
// User 1 = 500 RS
// User 2 = 935 RS

public class test6 {

    public static void main(String[] args) {
        int Users = 2;
        int User1item[] = {300, 400};
        int User2item[] = {1000, 600};
        int User3item[] = {200, 200};

        calculateitem(1, User1item);
        calculateitem(2, User2item);
        calculateitem(3, User3item);

    }

    static void calculateitem(int UserNo, int item[]) {
        int total = 0;
        for (int i = 0; i < item.length; i++) {
            total = total + item[i];
        }

        double amount = total;
        if (total >= 5000) {
            amount = total * 0.80;
        } else if (total > 1000) {
            amount = total * 0.85;
        } else if (total > 500) {
            amount = total * 0.95;
        }

        System.out.println("User" + UserNo + "=" + amount + "RS");
    }
}
