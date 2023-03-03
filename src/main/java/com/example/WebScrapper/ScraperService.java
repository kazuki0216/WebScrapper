package com.example.WebScrapper;

import java.util.Set;

public interface ScraperService {
    Set<ResponseDTO> getVehicleByModel(String vehicleModel);
}
