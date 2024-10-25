package gr.aueb.cf.schoolapp.repository;

import gr.aueb.cf.schoolapp.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AttachmrntRepository extends JpaRepository<Attachment , Long>, JpaSpecificationExecutor<Attachment> {
}
