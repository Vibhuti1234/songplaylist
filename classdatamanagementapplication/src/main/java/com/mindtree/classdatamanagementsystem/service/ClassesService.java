package com.mindtree.classdatamanagementsystem.service;

import java.util.List;

import com.mindtree.classdatamanagementsystem.entity.Classes;

public interface ClassesService {
 void addClasses(Classes classes);

List<Classes> getAllClasses();

}
