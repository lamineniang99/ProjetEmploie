package sn.esmt.ProjetEmploie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employees")
public class CvEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(nullable = false , length = 200)
    private String nom;
    @Column(nullable = false , length = 200)
    private String prenom ;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false , length = 200)
    private String adresse;
    @Column(nullable = false,length = 200)
    private String email;
    @Column(nullable = false , length = 200)
    private String telephone;
    @Column(nullable = false , length = 200)
    private String specialite ;
    @Column(nullable = false , length = 200)
    private String niveauEtude;
    @Column(nullable = false , length = 250)
    private String experienceProfessionnell;

}
