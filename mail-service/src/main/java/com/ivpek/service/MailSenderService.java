package com.ivpek.service;

import com.ivpek.utils.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}