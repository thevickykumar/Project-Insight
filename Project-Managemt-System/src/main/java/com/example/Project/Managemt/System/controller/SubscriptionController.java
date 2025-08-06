package com.example.Project.Managemt.System.controller;

import com.example.Project.Managemt.System.domain.PlanType;
import com.example.Project.Managemt.System.exception.ProjectException;
import com.example.Project.Managemt.System.exception.UserException;
import com.example.Project.Managemt.System.modal.Subscription;
import com.example.Project.Managemt.System.modal.User;
import com.example.Project.Managemt.System.service.SubscriptionService;
import com.example.Project.Managemt.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @Autowired
    private UserService userService;



    @GetMapping("/user")
    public ResponseEntity<Subscription> getUserSubscription(
            @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserProfileByJwt(jwt);
        Subscription userSubscription = subscriptionService.getUserSubscription(user.getId());

        if (userSubscription != null) {
            return new ResponseEntity<>(userSubscription, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/upgrade")
    public ResponseEntity<Subscription> upgradeSubscription(@RequestHeader("Authorization") String jwt,
                                                            @RequestParam PlanType planType) throws UserException, ProjectException {
        User user = userService.findUserProfileByJwt(jwt);
        Subscription upgradedSubscription = subscriptionService.upgradeSubscription(user.getId(), planType);

        return new ResponseEntity<>(upgradedSubscription, HttpStatus.OK);

    }

}


