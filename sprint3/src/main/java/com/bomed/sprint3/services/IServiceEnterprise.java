package com.bomed.sprint3.services;

import com.bomed.sprint3.entity.Enterprise;
import com.bomed.sprint3.repositories.IRepositoryEnterprise;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@Service
public class IServiceEnterprise {

    private IRepositoryEnterprise repository;

    public IServiceEnterprise(IRepositoryEnterprise repository) {this.repository = repository;}

    public ArrayList<Enterprise>listEnterprise(){
        return(ArrayList<Enterprise>) this.repository.findAll();
    }

    public Optional<Enterprise>searchEnterprise(Long id) {
        return this.repository.findById(id);
    }

    public String createEnterprise(Enterprise enterprise){
        if(this.repository.findById(enterprise.getId()).isEmpty()){
            this.repository.save(enterprise);
            return "Se creó la empresa ";
        }else{
            return "No se creó la empresa";
        }
    }

    public Enterprise updateEnterprise(Long id, Map<Object,Object>EnterpriseMap) {
        Enterprise emp = (Enterprise) this.repository.findById(id).get();
        EnterpriseMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Enterprise.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, emp, value);
        });
        return (Enterprise) this.repository.save(emp);
    }

    public String deleteEnterprise(Long id){
        if(this.repository.findById(id).isPresent()){
            this.repository.deleteById(id);
            return "Se eliminó la empresa exitosamente";
        }else{
            return "No se eliminó la empresa.";
        }
    }
}
