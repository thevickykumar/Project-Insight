package com.example.Project.Managemt.System.modal;

import com.example.Project.Managemt.System.domain.PlanType;
import com.example.Project.Managemt.System.domain.SubscriptionType;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;

@Entity
@Data
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate subscriptionStartDate;
    private LocalDate subscriptionEndDate;

    @Enumerated(EnumType.STRING)
    private SubscriptionType subscriptiontype;

    @Enumerated(EnumType.STRING)
    private PlanType planType;

    private boolean isValid;

    @OneToOne
    private User user;

}

