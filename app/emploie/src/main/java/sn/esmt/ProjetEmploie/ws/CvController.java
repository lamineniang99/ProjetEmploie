package sn.esmt.ProjetEmploie.ws;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sn.esmt.ProjetEmploie.dao.CvRepository;
import sn.esmt.ProjetEmploie.entities.CvEntities;

import java.util.List;

@Controller
@RestController
@RequestMapping(value = "/cvs")
@AllArgsConstructor
public class CvController {
    CvRepository cvRepository ;
    @PostMapping(path = "/save")
    public CvEntities save(@RequestBody CvEntities cventities){
        return cvRepository.save(cventities);
    }
    @GetMapping(path = "/all")
    public List<CvEntities> all(){
        return cvRepository.findAll();
    }
}
