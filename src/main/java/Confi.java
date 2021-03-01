import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paresh
 */
public class Confi extends TelegramLongPollingBot
{

    @Override
    public String getBotToken() {
        return "1613165276:AAGIL7se6zAPwkA6Aa4RXx-qujEAw7uhILY";
    }

    @Override
    public void onUpdateReceived(Update update) {
        try
      {

          SendMessage message=new SendMessage();           
      String[] data1=null;
        String text=update.getMessage().getText();
          System.out.println(text);
          System.out.println(message.setChatId(update.getMessage().getChatId()));
   
           if(text.equalsIgnoreCase("/start"))
           {
               message.setText("Enter The Ipl game you want in this format : Team1 Team2 Year\n\nExample :CSK RCB 2019");               
               System.out.println("Hey");
               execute(message);
           }
           else
           {
               getlink obj=new getlink();
               data1=obj.getdata(text);              
               for (int i = 0; i <data1.length&&!data1[i].equals(""); i++) {
                   
                   message.setText(text+" "+data1[i]+" \n\n");
                   System.out.println(message+" "+i);
                   execute(message);
                   i++;
                   message.setText(data1[i]);
                   execute(message);
               }
               
               
               
           }
      }
        catch(Exception e)
        {
        }
        
    }

    @Override
    public String getBotUsername() {
        return "IPL1_BOT";
    }
    
}
