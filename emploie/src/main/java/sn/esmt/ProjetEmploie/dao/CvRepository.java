package sn.esmt.ProjetEmploie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.ProjetEmploie.entities.CvEntities;


@Repository
public interface CvRepository extends JpaRepository<CvEntities,Integer> {
    public CvEntities findById(int id);
}
