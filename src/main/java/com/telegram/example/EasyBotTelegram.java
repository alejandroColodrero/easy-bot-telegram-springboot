package com.telegram.example;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

  /**
   * 
   * Easy telegram Bot creation
   * 
   * 1- Import telegram Dependency
   * 2- Go to BotFather
   * 3- Set Telegram bot name
   * 4 -Set api
   * 
   * @author Alejandro.Colodrero
   *
   */
  @Component
  public class EasyBotTelegram extends TelegramLongPollingBot {
	  
	long conversationId = 12345678;

	@Override
	public void onUpdateReceived(Update update) {
		if(update.getMessage().getChatId() == conversationId) {
			System.out.println("Message text from Bot Conversation:" + update.getMessage().getText());
		} else {
			System.out.println("WARNING - MESSAGE FROM:" + update.getMessage().getChatId());
			System.out.println("WARNING - MESSAGE FROM:" + update.getMessage());
		}
	}
	
	/**
	 * 
	 * To send text to telegram conversation
	 * 
	 * @param text
	 * @return
	 * @throws TelegramApiException
	 */
	public Boolean sendTextToTelegram (String text) throws TelegramApiException {	
		SendMessage sendMessage = new SendMessage();
		sendMessage.setChatId(String.valueOf(conversationId));
		sendMessage.setText(text);
		this.execute(sendMessage);			
		return true;			
	}

	@Override
	public String getBotUsername() {
		 return "XXXXXXBot";
	}

	@Override
	public String getBotToken() {
		return "12345678:12345--SDUHSAHCIUD6sx5d6tnxjka";
	}

  }