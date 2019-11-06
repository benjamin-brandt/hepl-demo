package be.hepl.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class CatController {

    private CatRepository catRepository;

    public CatController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Cat> getAllCats() {
        return catRepository.findAll();
    }


    @PostMapping(path="/add")
    public @ResponseBody
    String addNewCat (@RequestParam String name
            , @RequestParam String color) {

        Cat c = new Cat();
        c.setName(name);
        c.setColor(color);
        catRepository.save(c);
        return "Saved";
    }


}
