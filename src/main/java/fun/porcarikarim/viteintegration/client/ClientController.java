package fun.porcarikarim.viteintegration.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Value("${environment.type}")
    private String envType;

    @Value("${vite.url}")
    private String viteUrl;

    @RequestMapping(value = "/{path:^(?!api)(?!.*\\..*$).*$}")
    public String client(Model model) {

        if("development".equals(envType)) {
            model.addAttribute("viteUrl", viteUrl);
            return "dev";
        }

        return "forward:/index.html";


    }

}
