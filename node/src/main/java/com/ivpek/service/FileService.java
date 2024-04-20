package com.ivpek.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import com.ivpek.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message externalMessage);
}