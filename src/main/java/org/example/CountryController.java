package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {
    @Autowired
    CountryRepo repo;

    @GetMapping("/{id}")
    public Optional<Country> findById(@PathVariable int id){
        return repo.findById(id);
    }
    @GetMapping("/all")
    public List<Country> getAll(){
        repo.findAll().forEach(c -> System.out.println(c));
        return (List) repo.findAll();
    }
}
