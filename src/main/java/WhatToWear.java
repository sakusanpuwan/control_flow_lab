import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
        System.out.println("What's weather like? (rainy,sunny,cloudy,snow)");
        Scanner readerWeather = new Scanner(System.in);
        String weather = readerWeather.nextLine();
        System.out.println("What's the temperature?");
        Scanner readerTemp = new Scanner(System.in);
        int temperature = Integer.parseInt(readerTemp.nextLine());

        if (weather == "rainy" && temperature < 12){
            System.out.println("Wear waterproof winter coat");
        } else if (weather == "sunny" || temperature > 12){
            System.out.println("Wear something thin");

        }


    }
}
