package com.mindtree.collegebranchmanagementapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.collegebranchmanagementapplication.entity.Branch;
import com.mindtree.collegebranchmanagementapplication.entity.College;
import com.mindtree.collegebranchmanagementapplication.exception.CollegeBranchApplicationException;
import com.mindtree.collegebranchmanagementapplication.service.BranchService;
import com.mindtree.collegebranchmanagementapplication.service.CollegeService;

@Controller
public class CollegeBranchController {
	@Autowired
	CollegeService collegeService;
	@Autowired
	BranchService branchService;
	@RequestMapping("/")
	public String menu()
	{
		return "menu";
	}
	@RequestMapping("/addCollege")
	public String addCollege()
	{
		return "addCollege";
	}
	@PostMapping("/addColleges")
	public String addColleges(College college)
	{   collegeService.addCollege(college);
		return "menu";
	}
	@RequestMapping("/addBranch")
	public String addBranch(Model model)
	{
		model.addAttribute("colleges", collegeService.getColleges());
		return "addBranch";
	}
	@PostMapping("/addBranches")
	public String addBranches(@RequestParam("collegeId") int collegeId,Branch branch) throws CollegeBranchApplicationException
	{ branchService.addBranches(collegeId,branch);
		return "menu";
	}
	@RequestMapping("/display")
	public String display(Model model)
	{
		model.addAttribute("colleges", collegeService.getColleges());
		return "display";
		
	}
	@GetMapping("/displayBranches")
	public String displayBranches(@RequestParam("collegeId") int collegeId,Model model)
	{ model.addAttribute("branches", branchService.getBranchByCollege(collegeId));
	return "display";
		
	}
	@RequestMapping("/update")
	public String update(@RequestParam("branchId") int branchId,Model model)
	{
		model.addAttribute("branch",branchService.getBranchById(branchId));
		return "edit";
		}
	@PostMapping("/editBranches")
	public String update(Branch branch)
	{
		branchService.updateBranch(branch);
		return "menu";
	}
}