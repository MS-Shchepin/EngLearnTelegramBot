package com.shchepinms.telegram_bot.commands;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.bots.AbsSender;

public class CmdStart extends Command {

    public CmdStart() {
        super("start", "Запуск бота");
    }

    @Override
    public void processMessage(AbsSender absSender, Message message, String[] strings) {
        message.setText("""
                Добро пожаловать!
                Я помогу вам учить новые английские слова каждый день!
                
                Формат обучения такой: я буду присылать вам сообщения с утра и до вечера
                с заданным интервалом, обычно я шлю их каждые 4 часа.
                
                В сообщении будет содержаться 2 пары слов: ENG <-> RUS,
                ваша задача будет связать эти слова и сохранить у себя в голове.
                
                Количество слов в сообщении и интервал можно настроить командами
                /interval и /words, начать и остановить обучение - /run и /stop.
                
                Ах да, мне же понадобится словарь - просто киньте в меня текстовым файлом
                с парами слов, этот словарь и будем использовать для обучения.
                
                Кстати, список всех команд можно посмотреть прислав мне /help. Удачи 😉
                """);
        super.processMessage(absSender, message, null);
    }
}
