package com.example.hotel.service.HotelService.services;

import com.example.hotel.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel getById(String id);
}
