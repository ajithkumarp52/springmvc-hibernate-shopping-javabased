package org.dxc.shopping.controller;

import java.util.List;

import org.dxc.shopping.entity.Product;
import org.dxc.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	@RequestMapping("/addproduct")
	public String showAddProduct(@ModelAttribute("product") Product product) {
		return "add-product";
	}

	@RequestMapping(value = "/addnewproduct", method = RequestMethod.POST)
	public String AddNewProduct(@ModelAttribute("product") Product product, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-product";
		} else {
			productService.saveProduct(product);
			model.addAttribute("product", product);
			return "success";
		}
	}

	@RequestMapping("/viewproduct")
	public String showAllProduct(ModelMap map) {
		List<Product> listOfProducts = productService.getProducts();
		System.out.println("============viewproduct called");
		map.addAttribute("listOfProducts", listOfProducts);
		return "view-product";
	}
	@RequestMapping("/update")
	public String updateProduct(@RequestParam("productId") int pid,Model model) {
		Product product=productService.updateProduct(pid);
		model.addAttribute("product", product);
		return "add-product";
		
	}
	 @RequestMapping("/delete")
	   public String deleteProduct(@RequestParam("productId")int pid) {
		  productService.deleteProduct(pid);
		   return "redirect:/viewproduct";
		   
	   }
}
