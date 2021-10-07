package com.telegram.example;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

  /**
   * 
   * Easy telegram Bot creation
   * 
   * 1- Import telegram Dependency
   * 2- Go to BotFather
   * 3- Set Telegram bot name
   * 4 -Set bot token
   * 
   * @author Alejandro.Colodrero
   *
   */
  @Component
  public class EasyBotTelegram extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		if(update.getMessage().getChatId() == 1111111) { // Your id Telegram
			System.out.println("Message text from Bot Conversation:" + update.getMessage().getText());
		} else {
			System.out.println("WARNING - MESSAGE FROM:" + update.getMessage().getChatId());
			System.out.println("WARNING - MESSAGE FROM:" + update.getMessage());
		}
	}

	@Override
	public String getBotUsername() {
		 return "BotName";
	}

	@Override
	public String getBotToken() {
		return "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"; // Token given by BotFather
	}

  }