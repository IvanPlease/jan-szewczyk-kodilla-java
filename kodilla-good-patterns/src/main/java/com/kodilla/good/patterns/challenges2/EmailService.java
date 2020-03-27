package com.kodilla.good.patterns.challenges2;

import java.util.Map;

public class EmailService implements InformationService {
    @Override
    public void inform(UserDTO userDTO, Map<ProductsDTO, Integer> products) {
        String emailContent = "";
        MailSenderService mailSenderService = new MailSenderService(userDTO.getName(), emailContent);
        mailSenderService.send();
        //wysyłąnie maila
    }
}
