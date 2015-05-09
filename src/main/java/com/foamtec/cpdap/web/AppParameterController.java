package com.foamtec.cpdap.web;
import com.foamtec.cpdap.domain.AppParameter;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = AppParameter.class)
@Controller
@RequestMapping("/appparameters")
@RooWebScaffold(path = "appparameters", formBackingObject = AppParameter.class)
public class AppParameterController {
}
