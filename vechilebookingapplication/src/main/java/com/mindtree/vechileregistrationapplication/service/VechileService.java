package com.mindtree.vechileregistrationapplication.service;

import com.mindtree.vechileregistrationapplication.entity.Vechile;
import com.mindtree.vechileregistrationapplication.exception.VechileRegistrationApplicationException;

public interface VechileService {

	void addVechile(int userId, Vechile vechile) throws VechileRegistrationApplicationException;

}
