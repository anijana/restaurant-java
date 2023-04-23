package com.example.restaurant.controller;

import com.example.restaurant.model.Restaurant;
import com.example.restaurant.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    private final RestaurantService restaurantService;
    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }

    @PostMapping("/addRestaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.createRestaurant(restaurant);
    }

    @GetMapping("/getRestaurant/restaurantId/{restaurantId}")
    public Restaurant findRestaurantById(@PathVariable int restaurantId){
        return restaurantService.findById(restaurantId);
    }

    @GetMapping("/getAllRestaurant")
    public List<Restaurant> findAllUser(){
        return restaurantService.findAll();
    }

    @PutMapping("/updateRestaurantInfo/restaurantId/{restaurantId}")
    public void upadateRestaurant(@PathVariable int restaurantId, @RequestBody Restaurant restaurant){

    }
    @DeleteMapping("/deleteRestaurant/restaurantId/{restaurantId}")
    public void deleteURestaurant(@PathVariable int restaurantId){
        restaurantService.deleteUser(restaurantId);
    }
}
