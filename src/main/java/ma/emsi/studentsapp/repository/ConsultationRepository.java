package ma.emsi.studentsapp.repository;

import ma.emsi.studentsapp.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
