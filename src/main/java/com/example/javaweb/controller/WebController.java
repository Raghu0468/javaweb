package com.example.javaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
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
        return "views/dashboard";
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
	
	@RequestMapping(value="grid",method = RequestMethod.GET)
    public String gridpage(){
        return "views/grid";
    }
	
}
