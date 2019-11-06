package be.hepl.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface CatRepository extends CrudRepository<Cat, Integer> {

    Set<Cat> findCatByName(String name);

}
