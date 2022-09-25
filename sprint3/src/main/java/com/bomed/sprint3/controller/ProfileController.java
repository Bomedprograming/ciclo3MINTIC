package com.bomed.sprint3.controller;

import com.bomed.sprint3.entity.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ProfileController {
    private ProfileController services;

    public ProfileController(ProfileController services) {
        this.services = services;
    }

    @GetMapping("/showprofile")
    public ArrayList<Profile> listProfile(){
        return this.services.listProfile();
    }

    @GetMapping("/searchprofile/{id}")
    public Optional<Profile> searchProfile(@PathVariable("id") String id){
        return this.services.searchProfile(id);
    }

    @PostMapping("/createprofile")
    public String createProfile(@RequestBody Profile profile){
        return this.services.createProfile(profile);
    }

    @PutMapping("/updateprofile")
    public String updateProfile(@RequestBody Profile profile){
        return this.services.updateProfile(profile);
    }

    @DeleteMapping("/deleteprofile/{id}")
    public String deleteProfile(@PathVariable("id") String id){
        return this.services.deleteProfile(id);
    }
}

