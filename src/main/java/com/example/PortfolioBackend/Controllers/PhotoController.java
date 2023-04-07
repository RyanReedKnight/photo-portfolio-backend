package com.example.PortfolioBackend.Controllers;

import com.example.PortfolioBackend.DTOs.PhotoIncoming;
import com.example.PortfolioBackend.Exceptions.BadTokenException;
import com.example.PortfolioBackend.Models.Photo;
import com.example.PortfolioBackend.Services.PhotoService;
import com.example.PortfolioBackend.Utilities.JWTUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(exposedHeaders = "Authorization")
@RestController
@RequestMapping("/photos")
public class PhotoController {


    JWTUtility jwtUtility;
    PhotoService photoService;

    @Autowired
    public PhotoController(JWTUtility jwtUtility, PhotoService photoService) {
        this.jwtUtility = jwtUtility;
        this.photoService = photoService;
    }


}