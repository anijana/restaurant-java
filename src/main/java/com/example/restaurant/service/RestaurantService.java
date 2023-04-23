package com.example.restaurant.service;

import com.example.restaurant.model.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();
    private static int restaurantCount = 0;

    static {
        restaurants.add(new Restaurant(++restaurantCount, "palti", "kolkata", "63211441251", "birianny","50"));
        restaurants.add(new Restaurant(++restaurantCount, "palti", "kolkata", "63211441251", "birianny","50"));
    }

    public List<Restaurant> findAll(){
        return restaurants;
    }
    public Restaurant findById(int id){
        Predicate<? super Restaurant> predicate = user -> user.getRestaurantId() == id;
        Restaurant user = restaurants.stream().filter(predicate).findFirst().get();

        return user;
    }
    public void createRestaurant(Restaurant user){
        restaurants.add(user);
    }

    public void deleteUser(int id){
        Predicate<? super Restaurant> predicate = todo -> todo.getRestaurantId() == id;
        restaurants.removeIf(predicate);
    }
}
