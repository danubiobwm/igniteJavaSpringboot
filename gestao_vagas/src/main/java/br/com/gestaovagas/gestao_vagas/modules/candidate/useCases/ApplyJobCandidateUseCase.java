package br.com.gestaovagas.gestao_vagas.modules.candidate.useCases;

import br.com.gestaovagas.gestao_vagas.exceptions.JobNotFoundException;
import br.com.gestaovagas.gestao_vagas.exceptions.UserNotFoundException;
import br.com.gestaovagas.gestao_vagas.modules.candidate.entities.ApplyJobEntity;
import br.com.gestaovagas.gestao_vagas.modules.candidate.repositories.ApplyJobRepository;
import br.com.gestaovagas.gestao_vagas.modules.candidate.repositories.CandidateRepository;
import br.com.gestaovagas.gestao_vagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplyJobRepository applyJobRepository;

    // ID do candidato
    // ID da vaga
    public ApplyJobEntity execute(UUID idCandidate, UUID idJob){
        // Validar se o candidato existe
        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });

        // Validar se a vaga existe
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });

        // Candidato se inscrever na vaga
        var applyJob = ApplyJobEntity.builder()
                .candidateId(idCandidate)
                .jobId(idJob).build();

        applyJob = applyJobRepository.save(applyJob);
        return applyJob;
    }
}