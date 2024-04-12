package br.com.gestaovagas.gestao_vagas.modules.candidate.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import lombok.Data;



import java.time.LocalDateTime;
import java.util.UUID;

/**
 * CandidateEntity
 */

@Data
@Entity(name="candidate")
public class CandidateEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Schema(example = "Daniel de Souza", requiredMode = Schema.RequiredMode.REQUIRED, description = "Nome do candidato")
  private String name;

  @NotBlank()
  @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
  @Schema(example = "daniel", requiredMode = Schema.RequiredMode.REQUIRED, description = "Username do candidato")
  private String username;

  @Email (message = "O campo [email] deve conter um e-mail válido")
  @Schema(example = "daniel", requiredMode = Schema.RequiredMode.REQUIRED, description = "Username do candidato")
  private String email;

  @Length(min=10, max=100)
  @Schema(example = "admin@1234", minLength = 10, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED, description = "Senha do candidato")
  private String password;

  @Schema(example = "Desenvolvedor Java", requiredMode = Schema.RequiredMode.REQUIRED, description = "Breve descrição do candidato")
  private String description;
  private String curriculum;

  @CreationTimestamp
  private LocalDateTime createAt;
}