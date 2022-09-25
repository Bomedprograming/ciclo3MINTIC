package com.bomed.sprint3.services;

import com.bomed.sprint3.entity.Profile;
import com.bomed.sprint3.repositories.IRepositoryProfile;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class IServiceProfile {
    private IRepositoryProfile repository;

    public IServiceProfile(IRepositoryProfile repository){
        this.repository = repository;}

    public ArrayList<Profile> listProfile(){
        return(ArrayList<Profile>)this.repository.findAll();
    }
    public Optional<Profile> searchProfile(String id) {
        return this.repository.findById(id);
    }
    public String createProfile(Profile profile){
        if(searchProfile(profile.getId()).isEmpty()){
            this.repository.save(profile);
            return "Se creó el perfil";
        }else {
            return "No se pudo crear el perfil";
        }
    }
    public String updateProfile(Profile profile){
        if(searchProfile(profile.getId()).isPresent()){
            this.repository.save(profile);
            return "Se actualizo el perfil";
        }else{
            return " No se pudo actualizar el perfil";
        }
    }
    public String deleteProfile(String id){
        if(searchProfile(id).isPresent()){
            this.repository.deleteById(id);
            return "Se eliminó el perfil";
        }else{
            return "No se pudo eliminar el perfil";
        }
    }
}
