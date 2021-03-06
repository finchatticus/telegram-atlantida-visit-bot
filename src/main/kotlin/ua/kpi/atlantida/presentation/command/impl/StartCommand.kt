package ua.kpi.atlantida.presentation.command.impl

import org.telegram.telegrambots.api.methods.send.SendMessage
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import ua.kpi.atlantida.AtlantidaVisitBot
import ua.kpi.atlantida.presentation.command.Command

/**
 * Created by vlad on 09.10.17.
 */
class StartCommand: Command {

    override fun execute(chatId: Long, bot: AtlantidaVisitBot) {
        bot.sendReply(SendMessage(chatId, "/start"))
    }

}