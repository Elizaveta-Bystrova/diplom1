package com.ivpek.controller;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
@Component
public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "diplomivpek_bot";
    }

    @Override
    public String getBotToken() {
        return "6804102621:AAGu-A8gyCkjP-ye_zYCXIheLLcacpaDq_Y";
    }

    @Override
    public void onUpdateReceived(Update update) {
        var originalMessage = update.getMessage();
        System.out.println(originalMessage.getText());

    }
}
