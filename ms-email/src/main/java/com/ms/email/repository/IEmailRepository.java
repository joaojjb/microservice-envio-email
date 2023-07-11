package com.ms.email.repository;

import com.ms.email.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmailRepository extends JpaRepository<EmailModel, Long> {
}
