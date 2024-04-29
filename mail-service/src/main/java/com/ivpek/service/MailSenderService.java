package com.ivpek.service;

import com.ivpek.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}