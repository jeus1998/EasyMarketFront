package market.front.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAttribute {
    @Value("${spring.backend.url}")
    private String backendUrl;

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("backendUrl", backendUrl);
    }
}
