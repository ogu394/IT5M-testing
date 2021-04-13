package com.example.coffeeapp01;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int noOfCoffee = 0;
    int priceOfCoffee = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method for submit button
    public void submitOrder(View view){
        //call the method display()pass a integer
        //display(noOfCoffee);
        int totalPrice = noOfCoffee * priceOfCoffee;
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText("Total $" + totalPrice + "\n"+ "Thank you!!");

    }

    public void display(int number){
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

    //code for increment button
    public void increment(View view){
        noOfCoffee += 1;
        if(noOfCoffee >= 10) noOfCoffee = 10;
        display(noOfCoffee);
    }
    //code for decrement button
    public void decrement(View view){
        noOfCoffee -= 1;
        if(noOfCoffee<= 0) noOfCoffee = 0;
        display(noOfCoffee);
    }
}