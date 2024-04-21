package com.ivpek.service;

import com.ivpek.entity.AppPhoto;
import com.ivpek.service.enums.LinkType;
import org.telegram.telegrambots.meta.api.objects.Message;
import com.ivpek.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
    String generateLink(Long docId, LinkType linkType);
}