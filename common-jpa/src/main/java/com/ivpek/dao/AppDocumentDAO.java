package com.ivpek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ivpek.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}
