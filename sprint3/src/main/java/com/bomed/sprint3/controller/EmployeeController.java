package com.bomed.sprint3.controller;

import com.bomed.sprint3.services.IServiceEmployee;
import com.bomed.sprint3.entity.Employee;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmployeeController {
    private IServiceEmployee services;


    public EmployeeController(IServiceEmployee services){
        this.services = services;
    }

    @GetMapping("/users")
    public ArrayList<Employee> listEmployee(){
        return this.services.listEmployee();
    }

    @GetMapping("/user/{id}")
    public Optional<Employee> searchEmployee(@PathVariable("id") Long id){
        return this.services.searchEmployee(id);
    }

    @PostMapping("/users")
    public String createEmployee(@RequestBody Employee employee){
        return this.services.createEmployee(employee);
    }

    @PatchMapping("/user/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Map<Object, Object> EmployeeMap){
        return this.services.updateEmployee(id, EmployeeMap);
    }

    @DeleteMapping("/user/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        return this.services.deleteEmployee(id);
    }
}

//@RestController
//@RequestMapping("/users")
//public class EmployeeController {

//    @Autowired
//    private IRepositoryEmployee repositoryEmployee;

//    @RequestMapping(value = "/crear", method = RequestMethod.POST)
//    public Employee crearEmployee(@RequestBody Employee employee) {
//       return repositoryEmployee.save(employee);
//    }

//   @RequestMapping(value = "/consultartodos", method = RequestMethod.GET)
//   public Iterable<Employee> consultarTodos() {
//       return repositoryEmployee.findAll();
//    }

    //OBTENER UN SOLO EMPLEADO
//    @RequestMapping(value = "/consultar/{id}",method = RequestMethod.GET)
//    public Iterable<Employee> consultar() {
//        return  repositoryEmployee.findById();
//    }

//    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
//    public boolean eliminar(@PathVariable() Long id) {
//        repositoryEmployee.deleteById();
//        return true;
//   }

//    @RequestMapping(value = "actualizar/{id}", method = RequestMethod.PATCH)
//    public boolean editar(@PathVariable() Long id) {
//        repositoryEmployee.save(Employee);
//       return true;
//    }
//}

