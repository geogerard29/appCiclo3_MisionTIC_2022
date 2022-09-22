package com.GADJET.Sprint_3_4.frontControllers;

import com.GADJET.Sprint_3_4.entities.User;
import com.GADJET.Sprint_3_4.frontServices.frontUserServices;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontManagementSystemController {

    frontUserServices U2;
    public frontManagementSystemController(frontUserServices U2) {
        this.U2 = U2;
    }

    @GetMapping("/managementSystem")

    public String management(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
            User user = this.U2.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
        }
        return "Management_System";
    }
}
