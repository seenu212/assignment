package controller;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import animal.Bird;
import animal.Butterfly;
import animal.Chicken;
import animal.Duck;
import animal.Fish;
import animal.Shark;
import animal.Chicken.GenderOption;
import animal.ClownFish;

@Controller
@RequestMapping(value = "/api/v1")
public class AnimalController {
	@RequestMapping(value = "/getBird" , produces = {
            "application/json;charset=UTF-8", "application/x-www-form-urlencoded;charset=UTF-8" }, method = RequestMethod.GET)
	public @ResponseBody String getBird(Model model, HttpServletRequest request,
			@RequestParam(required = false, value="birdSpecie") String birdSpecie) throws Exception{
		Bird b;
		JSONParser parser = new JSONParser();
		if (birdSpecie.equals("Chicken"))
		 b = new Chicken();
		else if(birdSpecie.equals("Rooster"))
			b= new Chicken(GenderOption.MALE);
		else
			b=new Duck();
		Object obj = parser.parse(b.toString());
		JSONObject jsonObject = (JSONObject) obj;
		return jsonObject.toJSONString();
	
	}
    
	
	@RequestMapping(value = "/getFish" , produces = {
            "application/json;charset=UTF-8", "application/x-www-form-urlencoded;charset=UTF-8" }, method = RequestMethod.GET)
	public @ResponseBody String getFish(Model model, HttpServletRequest request,
			@RequestParam(required = false, value="fishSpecie") String fishSpecie) throws Exception{
		Fish f;
		JSONParser parser = new JSONParser();
		if (fishSpecie.equals("Shark"))
		 f = new Shark();
		else
			f= new ClownFish();
		Object obj = parser.parse(f.toString());
		JSONObject jsonObject = (JSONObject) obj;
		return jsonObject.toJSONString();
	
	}
	
	@RequestMapping(value = "/getButterfly" , produces = {
            "application/json;charset=UTF-8", "application/x-www-form-urlencoded;charset=UTF-8" }, method = RequestMethod.GET)
	public @ResponseBody String getButterfly(Model model, HttpServletRequest request,
			@RequestParam(required = false, value="stage") String stage) throws Exception{
		Butterfly b;
		JSONParser parser = new JSONParser();
		if (stage.equals("butterfly"))
		{
		 b = new Butterfly();
			b.transform();
		}
		else
			b = new Butterfly();
		Object obj = parser.parse(b.toString());
		JSONObject jsonObject = (JSONObject) obj;
		return jsonObject.toJSONString();
	
	}

}
