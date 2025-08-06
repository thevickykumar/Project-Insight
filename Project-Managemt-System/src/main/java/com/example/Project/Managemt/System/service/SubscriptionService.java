package com.example.Project.Managemt.System.service;

import com.example.Project.Managemt.System.domain.PlanType;
import com.example.Project.Managemt.System.modal.Subscription;
import com.example.Project.Managemt.System.modal.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}

