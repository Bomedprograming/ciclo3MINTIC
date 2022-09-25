package com.bomed.sprint3.services;

import com.bomed.sprint3.entity.Employee;
import com.bomed.sprint3.repositories.IRepositoryEmployee;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@Service
public class IServiceEmployee {

    private IRepositoryEmployee repository;

    public IServiceEmployee (IRepositoryEmployee repository) { this.repository = repository; }

    public ArrayList<Employee>  listEmployee() {
        return  (ArrayList<Employee>) this.repository.findAll();
    }

    public Optional<Employee> searchEmployee (long id) {
        return this.repository.findById(id);
    }

    public String createEmployee (Employee employee) {
        if(employee.getId() == null){
            this.repository.save(employee);
            return "Se crea el empleado exitosamente";
        }else{
            return "Ya existe un empleado con ese Id";
        }
    }

    public Employee updateEmployee (long id,Map<Object, Object> EmployeeMap) {
        Employee employee = this.repository.findById(id).get();
        EmployeeMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Employee.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, employee, value);
        });
        return this.repository.save(employee);
    }

    public String deleteEmployee (long id) {
        if(this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return "Se eliminó el empleado";
        }else{
            return "No existe un empleado con ese Id";
        }

    }

}