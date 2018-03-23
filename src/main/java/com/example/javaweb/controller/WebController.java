package com.example.javaweb.controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	static final String URL_EMPLOYEES = "http://localhost:9090/user/dashboard";
	
	@RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        return "index";
    }
	
	@RequestMapping(value="/header",method = RequestMethod.GET)
    public String headerpage(){
        return "header";
    }
	
	@RequestMapping(value="/notify",method = RequestMethod.GET)
    public String notifypage(){
        return "notify";
    }
	
	@RequestMapping(value="/menu",method = RequestMethod.GET)
    public String menupage(){
        return "menu";
    }
	
	@RequestMapping(value="/footer",method = RequestMethod.GET)
    public String footerpage(){
        return "footer";
    }

	@RequestMapping(value="dashboard",method = RequestMethod.GET)
    public String dashboardpage(){
		// HttpHeaders
        //HttpHeaders headers = new HttpHeaders();
 
//        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
//        // Request to return JSON format
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("my_other_key", "my_other_value");
// 
//        // HttpEntity<String>: To get result as String.
//        HttpEntity<String> entity = new HttpEntity<String>(headers);
// 
//        // RestTemplate
//        RestTemplate restTemplate = new RestTemplate();
// 
//        // Send request with GET method, and Headers.
//        ResponseEntity<String> response = restTemplate.exchange(URL_EMPLOYEES, //
//                HttpMethod.GET, entity, String.class);
// 
//        String result = response.getBody();
// 
//        System.out.println(result);
//		ModelAndView mv= new ModelAndView();
//		mv.addObject("dynamicJson", result);
//		mv.setViewName("dashboard");
		
        return "dashboard.jsp";
    }
	
	@RequestMapping(value="calendar",method = RequestMethod.GET)
    public String calendarpage(){
        return "views/calendar";
    }
	
	@RequestMapping(value="elements",method = RequestMethod.GET)
    public String elementspage(){
        return "views/elements";
    }
	
	@RequestMapping(value="treeview",method = RequestMethod.GET)
    public String treeviewpage(){
        return "views/treeview";
    }
	
	@RequestMapping(value="nestable-list",method = RequestMethod.GET)
    public String nestablelistpage(){
        return "views/nestable-list";
    }
		
	@RequestMapping(value="content-slider",method = RequestMethod.GET)
    public String contentsliderpage(){
        return "views/content-slider";
    }
	
	@RequestMapping(value="form-elements",method = RequestMethod.GET)
    public String formelementspage(){
        return "views/form-elements";
    }
	
	@RequestMapping(value="form-elements-2",method = RequestMethod.GET)
    public String formelements2page(){
        return "views/form-elements-2";
    }
	
	@RequestMapping(value="form-wizard",method = RequestMethod.GET)
    public String formwizardpage(){
        return "views/form-wizard";
    }
	
	@RequestMapping(value="dropzone",method = RequestMethod.GET)
    public String dropzonepage(){
        return "views/dropzone";
    }
	
	@RequestMapping(value="profile",method = RequestMethod.GET)
    public String profilepage(){
        return "views/profile";
    }
	
	@RequestMapping(value="faq",method = RequestMethod.GET)
    public String faqpage(){
        return "views/faq";
    }
	
	@RequestMapping(value="inbox",method = RequestMethod.GET)
    public String inboxpage(){
        return "views/inbox";
    }
	
	@RequestMapping(value="timeline",method = RequestMethod.GET)
    public String timelinepage(){
        return "views/timeline";
    }
	
	@RequestMapping(value="search",method = RequestMethod.GET)
    public String searchpage(){
        return "views/search";
    }
	
	@RequestMapping(value="wysiwyg",method = RequestMethod.GET)
    public String wysiwygpage(){
        return "views/wysiwyg";
    }
	
	@RequestMapping(value="gallery",method = RequestMethod.GET)
    public String gallerypage(){
        return "views/gallery";
    }
	
	@RequestMapping(value="widgets",method = RequestMethod.GET)
    public String widgetspage(){
        return "views/widgets";
    }
	
	@RequestMapping(value="jqgrid",method = RequestMethod.GET)
    public String jqgridpage(){
        return "views/jqgrid";
    }
	
	@RequestMapping(value="jquery-ui",method = RequestMethod.GET)
    public String jqueryuipage(){
        return "views/jquery-ui";
    }
	
	@RequestMapping(value="invoice",method = RequestMethod.GET)
    public String invoicepage(){
        return "views/invoice";
    }
	
	@RequestMapping(value="error-404",method = RequestMethod.GET)
    public String error404page(){
        return "views/error-404";
    }
	
	@RequestMapping(value="error-500",method = RequestMethod.GET)
    public String error500page(){
        return "views/error-500";
    }
	
	@RequestMapping(value="email",method = RequestMethod.GET)
    public String emailpage(){
        return "views/email";
    }
	
	@RequestMapping(value="typography",method = RequestMethod.GET)
    public String typographypage(){
        return "views/typography";
    }
	
	@RequestMapping(value="grid",method = RequestMethod.GET)
    public String gridpage(){
        return "views/grid";
    }
	
	@RequestMapping(value="tables",method = RequestMethod.GET)
    public String tablespage(){
        return "views/tables";
    }
	
	@RequestMapping(value="buttons",method = RequestMethod.GET)
    public String buttonspage(){
        return "views/buttons";
    }
	
	@RequestMapping(value="pricing",method = RequestMethod.GET)
    public String pricingpage(){
        return "views/pricing";
    }
	
	@RequestMapping(value="mobile-menu-1",method = RequestMethod.GET)
    public String mobilemenu1page(){
        return "views/mobile-menu-1";
    }
	
	@RequestMapping(value="mobile-menu-2",method = RequestMethod.GET)
    public String mobilemenu2page(){
        return "views/mobile-menu-2";
    }
	
	@RequestMapping(value="mobile-menu-3",method = RequestMethod.GET)
    public String mobilemenu3page(){
        return "views/mobile-menu-3";
    }
	
	@RequestMapping(value="top-menu",method = RequestMethod.GET)
    public String topmenupage(){
        return "views/top-menu";
	}   
    
	
	@RequestMapping(value="two-menu-1",method = RequestMethod.GET)
    public String twomenu1page(){
        return "views/two-menu-1";
	}
	
	@RequestMapping(value="two-menu-2",method = RequestMethod.GET)
    public String twomenu2page(){
        return "views/two-menu-2";
    }
	
}
