package com.ivpek.service;

import com.ivpek.entity.AppPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;
import com.ivpek.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
}