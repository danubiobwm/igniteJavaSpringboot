package br.com.gestaovagas.gestao_vagas.modules.candidate.controllers;

import br.com.gestaovagas.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CandidateController
 */
@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @PostMapping("/")
  public void create(@Valid @RequestBody CandidateEntity candidateEntity){
    System.out.println("Candidato");
    System.out.println(candidateEntity.getName());
    System.out.println(candidateEntity.getUsername());
    System.out.println(candidateEntity.getEmail());
    System.out.println(candidateEntity.getPassword());
    System.out.println(candidateEntity.getDescription());
  }

}