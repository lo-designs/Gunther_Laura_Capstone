//package capstone.laura.youthmatters.youth.resources.controllers;
//
//import capstone.laura.youthmatters.helplines.Helpline;
//import capstone.laura.youthmatters.youth.resources.services.ResourceService;
//import capstone.laura.youthmatters.youth.resources.models.Resource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.validation.Valid;
//
//
//@Controller
//public class HelplineController {
//
//    // CONTROLLER FOR ADMIN TO ADD, UPDATE, AND DELETE RESOURCES
//    private HelplineService helplineService;
//
//    @Autowired
//    public ResourceController(ResourceService resourceService) {
//        this.resourceService = resourceService;
//    }
//
//    // SHOW LIST OF RESOURCES
//
//    @GetMapping("/all_resources")
//    public String getAllResources(Model model) {
//        model.addAttribute("allResources", resourceService.getAllResources());
//        return "all_resources";
//    }
//
//
//    @GetMapping("/showNewResourceForm")
//    public String showNewResourceForm(Model model) {
//        Resource resource = new Resource();
//        model.addAttribute("resource", resource);
//        return "new_resource";
//    }
//
//    @PostMapping("/saveResource")
//    public String saveResource(@ModelAttribute("resource") @Valid Resource resource, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "new_resource";
//        }
//        // SAVE RESOURCE TO DATABASE
//        resourceService.saveResource(resource);
//        return "redirect:/all_resources";
//    }
//
//    @GetMapping("/showFormForUpdate/{id}")
//    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
//
//        // GET RESOURCE FROM SERVICE
//        Resource resource = resourceService.getResourceById(id);
//
//        // SET RESOURCE AS MODEL ATTRIBUTE TO PRE-POPULATE FORM
//        model.addAttribute("resource", resource);
//        return "update_resource";
//    }
//
//    @GetMapping("/deleteResource/{id}")
//    public String deleteResource(@PathVariable(value = "id") long id) {
//
//        // CALL DELETE RESOURCE METHOD
//        this.resourceService.deleteResourceById(id);
//        return "redirect:/all_resources";
//    }
//}
