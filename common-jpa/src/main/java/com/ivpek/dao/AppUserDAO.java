package com.ivpek.dao;

import com.ivpek.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserDAO extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByTelegramUserId(Long id);
}
