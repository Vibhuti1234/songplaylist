package com.mindtree.bookmanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bookmanagementsystem.repository.AuthorRepsitory;
import com.mindtree.bookmanagementsystem.repository.BookRepsitory;
import com.mindtree.bookmanagementsystem.repository.FeedbacksRepsitory;
import com.mindtree.bookmanagementsystem.service.AuthorService;
import com.mindtree.bookmanagementsystem.service.BookService;
import com.mindtree.bookmanagementsystem.service.FeedbacksService;
@Service
public class FeedbacksServiceImpl implements FeedbacksService{
@Autowired
FeedbacksRepsitory  feedbacksRepsitory;
@Autowired
BookRepsitory bookRepsitory;
@Autowired
AuthorRepsitory authorRepsitory;

}
